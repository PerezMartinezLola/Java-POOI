/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerasclases;

/**
 *
 * @author lolit
 */
public class Rectangulo {

    //aqui se crea todo a 0 o null si es un String, se crea el molde?
    int base;
    int altura;
    String color;

    public Rectangulo(int base, int altura, String color) {
        //aqui creamos el constructor
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.base = altura;
        color = "blanco";
    }
    public Rectangulo(){
        base = 1;
        altura = 1;
        color = "blanco";
        
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(20, 10);
        Rectangulo r3 = new Rectangulo(30, 15, "rojo");

        Rectangulo[] rectangulos = {r1, r2, r3};

        for (Rectangulo r : rectangulos) {
            System.out.printf("Rectangulo %s de %d x %d%n", r.color, r.base, r.altura);
        }
    }

}
