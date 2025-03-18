/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author lolit
 */
public class Plantas {
    String color;
    boolean sana;
    int numeroHojas;
    double altura;

    public Plantas(String color, boolean sana, int numeroHojas, double altura) {
        this.color = color != null? color: "verde";
        this.sana = sana;// este valor se asignará al crear el objeto planta p5.
        this.numeroHojas = numeroHojas <= 0? 0: numeroHojas;
        this.altura = altura <= 0 ? 0: altura;
    }

    public Plantas(int numeroHojas, double altura) {
        color = "morada";
        this.numeroHojas = numeroHojas;
        this.altura = altura;
    }

    public Plantas() {
        this("amarilla", true, 5, 1.5);
    }

    public Plantas(boolean sana, int numeroHojas) {
        this.sana = false;
        this.numeroHojas = numeroHojas;
        color = "rojo";
        altura = 2.5;
    }
    public Plantas (Plantas p){
        this.color = p.color;
        this.sana = p.sana;
        this.numeroHojas = p.numeroHojas;
        this.altura = p.altura;
        
    }
    
    public void show (){
        System.out.printf("La planta de color %s, numero de hojas %d y altura %.2f cms, se encuentra %s.%n",
                color, numeroHojas, altura, sana ? "viva" : "muerta");
    }
    public static void main(String[] args) {
        Plantas p1 = new Plantas ();
        Plantas p2 = new Plantas (6, 2.5);
        Plantas p3 = new Plantas (true, 2); //he puesto false en el constructor y el valor del constructor prevalece sobre éste.
        Plantas p4 = new Plantas (p3);
        Plantas p5 = new Plantas (null, true, 8, 10);
        
        p1.show();
        p2.show();
        p3.show();
        p4.show();
        p5.show();
    }
    
}
