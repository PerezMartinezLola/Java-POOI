/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author lolit
 */
public class RectanguloCasa {
    int base;
    int altura;
    String color;

    public RectanguloCasa(int base, int altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public RectanguloCasa(int base, int altura) {
        this.base = base;
        this.altura = altura;
        color = "blanco";
    
    }
    
    public RectanguloCasa(){
        this.base = 1;
        this.altura = 1;
        this.color = "verde";
    }
    
    public void show (){
        System.out.printf("El rectangulo de base %d y altura %d es de color %s.%n", base, altura, color);
    }
    
    public static void main(String[] args) {
        RectanguloCasa c1 = new RectanguloCasa (2,2,"rosa");
        RectanguloCasa c2 = new RectanguloCasa (4,4);
        RectanguloCasa c3 = new RectanguloCasa();
        
        
        c1.show();
        c2.show();
        c3.show();
    }
}

