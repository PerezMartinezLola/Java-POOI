
package pildoras;

public class Pez {
    double peso;
    String color;
    float largo;
    int profundidadMaxima;
    boolean vivo;

    public Pez(double peso, String color, float largo, int profundidadMaxima) {
        this.peso = peso <0? 100: peso;
        this.color = color !=null? color:"blanco";
        this.largo = largo <0? 5: largo;
        this.profundidadMaxima = profundidadMaxima < 0?0: profundidadMaxima;
        this.vivo = true;
    }

    public Pez() {
       this(150, "amarillo", 120, 150);
    }
    public Pez (Pez p){
        this.peso = p.peso;
        this.color = p.color;
        this.largo = p.largo;
        this.profundidadMaxima = p.profundidadMaxima;
        this.vivo = false;
        //Esto se podría poner
        //public Pez (Pez p){
        //this(p.peso, p.color,p.largo,p.profundidadMaxima);

    }
    
    public void show (){
        System.out.printf(" El pez %s de peso %.2f gramos, color %s, longitud %.2f cms se encuentra a una profundidad de %d kms.%n",
                 vivo != true? "muerto": "vivo", peso, color, largo, profundidadMaxima);
    }
    
    public static void main(String[] args) {
        Pez p1 = new Pez (350, "rojo", 100, 2_000);
        Pez p2 =new Pez ();
        Pez p3 = new Pez (p1);
        
        p1.show();
        p2.show();
        p3.show();
        
        
    }
    
}
