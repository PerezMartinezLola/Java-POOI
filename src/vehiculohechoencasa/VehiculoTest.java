
package vehiculohechoencasa;

public class VehiculoTest {
    
    public static void main(String[] args) {
       Vehiculo v1 = new Vehiculo("BMW", (byte) 4, "blanco", 30_000);
        v1.show();
        Vehiculo v2 = new Vehiculo ("Ford", (byte)4, "azul", 10_000);
        v2.show();
        Vehiculo v3 = new Vehiculo (v2, "blanco");
        v3.show();
        Vehiculo v4 = new Vehiculo (v1);
        v4.show();
        Vehiculo Pintadov1 = v2.pintar("amarillo");
        
        
        v1.acelera ().frena().acelera().acelera().frena().para();
        v1.PintarBasadoEn(v2).show();
        
        }
       
    }


    
    
    
    

