/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misprimerasclases;

/**
 *
 * @author lolit
 */
public class PostIt {
    int alto;
    int ancho;
    String color;
    String contenido;
    
    public static void main(String[] args) {
        PostIt p1 = new PostIt();
        System.out.printf("Post-It %s de %dx%d en el que pone AAAA", p1.color, p1.alto, p1.ancho,p1.contenido);
                
        p1.alto = 70;
        p1.ancho =70;
        p1.color = "amarillo";
        p1.contenido = "A";
        
        System.out.printf("Post-It %s de %dx%d en el que pone AAAA", p1.color, p1.alto, p1.ancho,p1.contenido);
    }
    
}
