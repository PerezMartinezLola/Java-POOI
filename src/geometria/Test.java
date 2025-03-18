/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author lolit
 */
public class Test {
    
    public void show1(int lado, String color){
      System.out.printf("El cuadrado de lado %d y color %s%n", lado, color);
    }
    
    public void show2 (int base, int altura, String color){
        System.out.printf("El rectangulo de base %d, altura %d y color %s%n", base, altura, color);
    }
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado (10);
        Cuadrado c3 = new Cuadrado ("verde");
        Cuadrado c4 = new Cuadrado(20, "naranja");
      
        Cuadrado [] cuadrado = {c1,c2,c3,c4};
        for(Cuadrado c: cuadrado){
            
      
        }
    }
     
}
