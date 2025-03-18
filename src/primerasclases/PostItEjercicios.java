/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerasclases;

/**
 *
 * @author lolit
 */
public class PostItEjercicios {
    String color;
    String mensaje;
    int alto;
    int ancho;
    
    
    public static void main(String[] args) {
        PostItEjercicios p;
        PostItEjercicios p1 = new PostItEjercicios();
        p = p1;
        p.color = "rosa";
        p.mensaje = "AA";
        p.alto = 50;
        p.ancho = 50;
        
        System.out.printf("PostIt %s de %d x %d con mensaje %s%n",p.color, p.alto, p.ancho, p.mensaje);
    
    
        PostItEjercicios p2 = new PostItEjercicios ();
        p = p2;
        p2.color = "amarillo";
        p2.mensaje = "BB";
        p2.alto = 50;
        p2.ancho = 50;
        System.out.printf("PostIt %s de %d x %d con mensaje %s%n",p2.color, p2.alto, p2.ancho, p.mensaje);
       
        PostItEjercicios p3 = new PostItEjercicios ();
        p = p3;
        p3.color = "naranja";
        p3.mensaje = "CC";
        p3.alto = 30;
        p3.ancho = 30;
        System.out.printf("PostIt %s de %d x %d con mensaje %s%n", p3.color, p3.alto, p3.ancho, p3.mensaje);
        
        PostItEjercicios p4 = new PostItEjercicios();
        p = p4;
        p4.color = "azul";
        p4.mensaje = "DD";
        p4.alto = 30;
        p4.ancho = 30;
        System.out.printf("PostIt %s de %d x %d con mensaje %s%n", p4.color, p4.alto, p4.ancho, p4.mensaje);
}
}