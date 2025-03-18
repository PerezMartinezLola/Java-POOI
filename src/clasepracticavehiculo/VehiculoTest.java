
package clasepracticavehiculo;


public class VehiculoTest{
  
    
    public static void main(String[] args) {
        VehiculoJavi v1 = new VehiculoJavi();
        v1.show();
        VehiculoJavi v2 = new VehiculoJavi(v1, 2345);
        v2.show();
        VehiculoJavi v3 = new VehiculoJavi(v2);
        v3.show();
        VehiculoJavi v4 = new VehiculoJavi("azul", "renault", (byte) 4, 9999);
        v4.acelera().acelera().frena().para().show();
        //v2 = null;
        //v1.pintarBasadoEn(v2);
       // para poder actuar con atributos privados solo puedo usar getter o setter
       
        v1.setVelocidad(50);
        System.out.println(v1.getVelocidad());
       
    
    
    }
    
    
    
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

