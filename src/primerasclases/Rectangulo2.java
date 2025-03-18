/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerasclases;

/**
 *
 * @author lolit
 */
public class Rectangulo2 {
    int base;
    int altura;
    String color;
    int superficie;
    
    public Rectangulo2(int miBase, int miAltura, String miColor){
        base = miBase;
        altura = miAltura;
        color = miColor;
        superficie = base*altura;
    }
    
    public static void main(String[] args) {
        Rectangulo2 r1 = new Rectangulo2 (50, 25, "verde");
    //    System.out.printf("El rectangulo %s es de base %d, altura %d y superficie %d%n", r1.color, r1.base,r1.altura,r1.superficie);
    //    r1.base = 50;
    //    r1.altura= 25;
    //   r1.color = "azul";
    //    r1.superficie = r1.base*r1.altura;
        
     System.out.printf("El rectangulo %s es de base %d, altura %d y superficie %d%n", r1.color, r1.base,r1.altura, r1.superficie);
        
    //    Rectangulo r2= new Rectangulo();
        
    //    r2.base = 70;
    //    r2.altura = 50;
    //    r2.color = "verde";
    //    r2.superficie= r2.base * r2.altura;
        
    //    System.out.printf("El rectangulo %s es de base %d, altura %d y superficie %d%n", r2.color, r2.base,r2.altura,r2.superficie);
        
        
        
    }
}
