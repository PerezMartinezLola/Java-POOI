/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paracticarstatic;

/**
 *
 * @author lolit
 */
public class TestAnimal {

    public static void main(String[] args) {
        Animal a1 = new Animal("negro");
        Animal a2 = new Animal(3, "marron");
        Animal a3 = new Animal(10, "blanco");
        Animal a4 = new Animal(a3);
        
        a1.show();
        a1.showClase();
        a2.show();
        a2.showClase();
        a3.show();
        a3.showClase();
        a4.show();
        a4.showClase();
    }

}
