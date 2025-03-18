/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author lolit
 */
public class Cuadrado {
    int lado = 5;
    String color = "rojo";

    
    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;  
    }
    
    public Cuadrado(String color) {
        this.color = color;
    }
    
    public Cuadrado(int lado, String color) {
        this.lado = lado;
        this.color = color;
    }
    
    public int area(int lado){
        return lado*lado;
    }
    
   // public void show1(int lado, String color){
     //   System.out.printf("El cuadrado de lado %d y color %s%n", lado, color);
    //}
    
}



