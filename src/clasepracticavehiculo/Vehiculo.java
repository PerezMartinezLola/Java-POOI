
package clasepracticavehiculo;


public class Vehiculo {
    //aqui se definen las propiedades
    //tengo que pintarlo, circular, frenar y acelerar
    int x;
    double velocidad;
    String color;
    String marca;
    String tipo;
    byte numeroDeRuedas;
    boolean nuevo;
    double kms;
    String[] historicoDeColores;//máximo 5
    double precio;
    short yearFabricacion;
    

    
    
    public void show(){
        System.out.printf("%s %s %s %s [%d] de %d ruedas con %.2f kms a %.2f km/h de precio %.2f(x=%d).%n",
                tipo,marca,color,nuevo? "nuevo": "usado", numeroDeRuedas,yearFabricacion, kms, velocidad, precio,x);
    }
    
    
    public Vehiculo (Vehiculo v){//este es un objeto copiado del constructor más grande
       // this(v.velocidad, v.color, v.marca, v.tipo, v.numeroDeRuedas,v.nuevo, v.kms, v.historicoDeColores, 
       //v.precio); ésto sería un error porque this()llama a un constructor con esos parametros y ese constructor no existe
        x = 0;
        velocidad = v.velocidad;
        color = v.color;
        marca = v.marca;
        tipo = v.tipo;
        numeroDeRuedas = v.numeroDeRuedas;
        nuevo = v.nuevo;
        kms = v.kms;
        historicoDeColores= v.historicoDeColores;
        precio = v.precio;
        yearFabricacion = v.yearFabricacion;
        
    }
    public Vehiculo(String color, String marca, byte numeroDeRuedas, double precio) {
        //cada constructor se crea para un conjunto de parámetros
        //cuando creas un vehículo estás dando valor a esos parámetros
        //estos son los parámetros
        x = 0;
        velocidad = 0;
        this.color = color;
        this.marca = marca == null? "Seat": marca;//seat su no hay marca
       this.tipo = tipo;
        this.numeroDeRuedas = numeroDeRuedas < 2? 2: numeroDeRuedas;
        switch (this.numeroDeRuedas) {
            case 2:
                tipo = "moto";
                break;
            case 3:
                tipo = "triciclo";
                break;
            case 4:
                tipo = "vehículo";
                break;
            case 10:
                tipo = "autobús";
                break;
            default:
                tipo = "camión";
        }
        
        nuevo = true;
        kms = 0;
        historicoDeColores = historicoDeColores= new String [5];
        if (this.color != null){
            historicoDeColores [0] = this.color;
        }
        this.precio = precio < 100 ? 100 : precio;
        this.yearFabricacion= 2024;
    }
    
    public Vehiculo (Vehiculo v, double precio){//esto es un vehiculo con los mismos parametros que el vehiculo v pero le quiero cambiar el precio porque quizas es nuevo así que pongo double precio para que no coja el precio del constructor vehiculo v
        this(v.color, v.marca, v.numeroDeRuedas, precio);//this hace alusión a este constructor
    }
    
    public Vehiculo (){//entre parentesis especifico que es un byte porque sino me da fallo.
        this("blanco", "Seat", (byte) 4, 1_000);
    }
    
    public static void main(String[] args) {
        Vehiculo v1= new Vehiculo();
        v1.show();
        Vehiculo v2 = new Vehiculo(v1, 2345);
        v2.show();
        Vehiculo v3 = new Vehiculo(v2);
        v3.show();
        Vehiculo v4 = new Vehiculo("azul", "renault", (byte)4, 9999);
        v4.show();
        v4.pintar("amarillo").show();
        //v4.velocidad = 10; //aqui estoy cambiando la velocidad del vehiculo
        //for (int i = 0; i < 100; i++) {
        //}
        //v4.acelera().acelera().frena().para().show();
       
        
       // v4.acelera();
       // v4.acelera();
        //v4.frena();
       // v4.para();
       // v4.show();
    
    }
    public Vehiculo pintar (String color){
        //ver si lo puedo pintar
        
        //Retornar lo que proceda. Si no lo puedo pintar null
        //si lo pinto el propio coche
        int puedoEscribirEn = -1;//para poner un numero fuera del indice
        for(int i= 0; i < historicoDeColores.length; i++){
            if(historicoDeColores [i] == null){
                puedoEscribirEn = i;
                break;
            }
        }   
        
         //si puedo lo pinto y actualizar el histórico
        if(puedoEscribirEn != -1){
            historicoDeColores [puedoEscribirEn] = color;
            this.color = color;
            return this;   
        }else{
            return null;
            }
            
        }
        
    //aqui pintas y guardas en el historico invocando al metodo pintar
        public Vehiculo pintar (){
           return pintar ("blanco");
            
        } 
        public void para(){
            velocidad = 0;
            System.out.println("Vehiculo detenido");
        }
        
        public void acelera (){
           velocidad = velocidad + 10 >= 120? 120: velocidad +10;
            System.out.printf("Nueva velocidad: %.2f%n", velocidad);
        }
        
        public void frena (){
            velocidad = velocidad -10 > 0? velocidad-10: 0;
        }
        
        
        //pintar un coche como un coche que ve, primero comprobar si hay espacio en el historico de colores
        
        //public void pintarBasadoEn (Vehiculo v){
         //   return pintar(Vehiculo.color);
        

}