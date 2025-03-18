/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author lolit
 */
public class Vehiculo {
    int kms;
    String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        kms = 100;
    }
    
    public void show(){
        System.out.printf("El coche %s va a una velocidad de %d kms/hora.%n",nombre, kms);
    }
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo ("Toyota");
        Vehiculo v2 = new Vehiculo ("Dacia");
        
        v1.show();
        v1.marchaAlante();
        v1.show();
        v2.show();
        v2.marchaAtras();
        v2.marchaAtras();
        v2.show();
        v1.show();
        v1.acelerar(5);
        v1.show();
    }
    
    public void marchaAlante (){
        kms = kms + 1 <=120 ? kms +1 : kms; 
    }
    public void marchaAtras () {
        kms = kms -1 >= 0? kms -1 :kms;
    }
    
    public boolean acelerar (int n){
        if (kms +n <= 120 ){
            kms += n;
            return true;
        }else{
            return false;
        }
    }
    // public void correrLimite120 (){
    //    for (int i = kms; i <= 100; i++) {
             //quiero crear un metodo para correr hasta 120 
     //    }
    // }
       
        
    
}
