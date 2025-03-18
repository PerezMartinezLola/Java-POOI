/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras;

/**
 *
 * @author lolit
 */
public class Personas {
    //Añade constructores con todos los parámetros
    // con todos excepto el año en cuyo caso pondrás 2024
    //Método main y show
    String nombre;
    String primerApellido;
    String segundoApellido;
    int añoDeNacimiento;
    
   
    public void show(){
        System.out.printf("%s %s %s nacido en el anio %d.%n", nombre, primerApellido, segundoApellido, añoDeNacimiento);
    }
    
    public Personas(String nombre, String primerApellido, String segundoApellido, int añoDeNacimiento){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public Personas(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        añoDeNacimiento = 2024;
    }
    
    
    public static void main(String[] args) {
        
        Personas p1 = new Personas("Juan", "Perez", "Manzano");
        p1.show();
        Personas p2 = new Personas ("Naroa", "Martinez", "Vidal", 1989);
        p2.show();
        Personas p3 = new Personas ("Claudia", "Bejar", "Gonzalez");
        p3.show();
        Personas p4 = new Personas ("Pepe", "Lopez", "Alonso", 1992);
        p4.show();
        
       
    }
    
}
