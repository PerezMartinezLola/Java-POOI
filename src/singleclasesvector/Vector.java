package singleclasesvector;

public class Vector {

    //POPIEDADES
    private int x;//private int x,y. Así tambien es válido.
    private int y;

    //CONSTRUCTORES
    //En cuanto creo un constructor ya el sin parámetros no existe.
    public Vector(int x, int y) {
        this.x = x; //Esto es un invento mio (x < 0) ? 0 : (x > 10) ? 10 : x;
        this.y = y; //Esto es un invento mio(y < 0) ? 0 : (y > 10) ? 10 : y;
    }

    //El vector con los dos parámetros del mismo número
    //llama al otro constructor por si allí ya tenemos puestos parámetros
    public Vector(int k) {
        this(k, k);
    }

    //en el copia mejor hacerlo así que llamar a otro constructor SIEMPRE
    public Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void show() {
        System.out.printf("Vector de coordenadas (%d, %d)%n", getX(), getY());
    }

    //GETTERS SETTERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //MÉTODOS
    public Vector suma(Vector v) {//ingredientes que se le da al plato va entre ()
        if (this.x + (long) v.x <= Integer.MAX_VALUE && this.x + (long) v.x >= Integer.MIN_VALUE) {
            Vector resultado = new Vector(this.x + v.x, this.y + v.y);
            return resultado;

        } else {
            return new Vector(0);
        }

    }
    //para que en el método main pueda
    //this se refieren a las coordenadas del vector actual, es decir, el objeto que invoca el método.
    //v.x y v.y se refieren a las coordenadas del vector pasado como parámetro (en este caso, v).

    public Vector resta(Vector v) {
        //esta forma prefiere que lo haga javi porque el código sólo está hecho en un sitio
           return this.suma(new Vector(-v.x, -v.y));
        //Es una simplificación de esto
        //Vector resultado = new Vector(this.x - v.x, this.y - v.y);
        //return resultado;
        
    }

    public Vector opera(Vector v, char operacion) {
            Vector resultado = operacion == '-' ? this.resta(v) : this.suma(v);

            System.out.printf("(%d,%d) %c (%d, %d) = (%d,%d)%n",
                    x, y,
                    operacion == '-' ? '+' : '+',
                    v.x, v.y, resultado.x, resultado.y);
            return resultado;  
        }
    
}
/*public class VectorJavi {
    // Prolpiedades
    private int x, y;

    // Constructores
    public VectorJavi (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public VectorJavi (int k) {
        this(k, k);
    }

    public VectorJavi (Vector v) {
        this.x = v.x;
        this.y = v.y;
    }

    // Getter y setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Métodos
    public void show() {
        System.out.printf("Vector de coordenadas (%d, %d)%n", x, y);
    }

    public Vector suma(Vector v) {

        if (this.x + (long)v.x <= Integer.MAX_VALUE && this.x + (long)v.x >= Integer.MIN_VALUE ) {
            Vector resultado = new Vector(this.x + v.x, this.y + v.y);
            return resultado;
        } else {
            return new Vector(0);
        }

    }

    public Vector resta(Vector v) {
        return this.suma(new Vector(-v.x, -v.y));
    }
    
    public Vector opera(Vector v, char operacion){
        Vector resultado = operacion == '-' ?  this.resta(v): this.suma(v);                 
        System.out.printf("(%d,%d) %c (%d, %d) = (%d,%d)%n",
                x, y, 
                operacion == '-' ? '-' : '+', 
                v.x, v.y, 
                resultado.x, resultado.y);
        return resultado;      
    }*/
