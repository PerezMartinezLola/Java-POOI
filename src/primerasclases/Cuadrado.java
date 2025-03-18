/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerasclases;

/**
 *
 * @author lolit
 */
public class Cuadrado { //estas son las propiedades
    int lado;
    String color;
    int superficie;

  public Cuadrado(int lado, String color){
        this.lado = lado;
        this.color = color;
        superficie = lado * lado;        
    }
    
    public Cuadrado(){
    this(1,"blanco");
    
}
  public Cuadrado (int lado){
      this(lado, "blanco");
      //Resumen de
     // this.lado = lado;
     // color = "blanco";
     // superficie = lado * lado;
  }
  public Cuadrado (String color){
      this(1,color);
      //Resumen de
      //lado = 1;
      //this.color = color;
      //superficie = lado *lado;
  }
   
  //public Cuadrado (int lado, String color){//estos son los parámetros de este cuadrado
   //   this.lado = lado;
   //   this.color = color;
  
  
    public static void main(String[] args) {
        Cuadrado [] cuadrados1 ={
            new Cuadrado(),
            new Cuadrado (7),
            new Cuadrado ("rojo"),
            new Cuadrado (10, "verde")
    };
    
    for (Cuadrado c: cuadrados1){
        System.out.printf("Cuadrado %s de lado %d y superficie %d.%n", c.color, c.lado, c.superficie);
    }
    int totalCuadrados = 100;
        Cuadrado [] cuadrados2 = new Cuadrado[totalCuadrados];
           
            for(int i = 0; i < cuadrados2.length; i++){
                cuadrados2[i] = new Cuadrado (i+1);
            }
            
            for (Cuadrado c: cuadrados2){
                System.out.printf("Cuadrado %s de lado %d y superficie %d.%n", c.color, c.lado, c.superficie);
        
            
            
            }
}
}
