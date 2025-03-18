
package transport;


public class TestVehiculo {
    
    public static void main(String[] args) {
       Vehiculo v1 = new Vehiculo("qwe1234", "camioN", (short)2000, 0);
       Vehiculo v2 = new Vehiculo("ABC1234", "COCHE", (short) 2015, 50);
       Vehiculo v3 = new Vehiculo(v1);
       Vehiculo v4 = new Vehiculo("123RTF", "Bicicleta", (short) 2024, 0);
        
       Vehiculo [] vehiculos = {v1,v2,v3,v4};
        
        System.out.printf("Vehiculos%n");
        System.out.printf("=========%n");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.show();
            
        }
        System.out.printf("%nActualizar kilometraje%n");
        System.out.printf("======================%n");
        System.out.println(v1.actualizarKilometraje(50));
        System.out.println(v2.actualizarKilometraje(20));
        
        System.out.printf("%nCalcular Antiguedad%n");
        System.out.printf("======================%n");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.calcularAntiguedad());
            
        }
        System.out.printf("%nMisma Antiguedad%n");
        System.out.printf("======================%n");
        System.out.println(v1.mismaAntiguedad(v3));
        System.out.println(v1.mismaAntiguedad(v4));
    }
}