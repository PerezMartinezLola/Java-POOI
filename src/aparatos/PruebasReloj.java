package aparatos;

public class PruebasReloj {

    public static void main(String[] args) {
        Reloj [] relojes = new Reloj [4];
        relojes [0] = new Reloj(13, 59, "CASIO");
        relojes [1] = new Reloj(23, 22);
        relojes [2] = new Reloj(relojes [0]);
        relojes [3] = new Reloj(10, 59, "GUESS");
        
        
        System.out.printf("Relojes%n");
        System.out.printf("=========%n");
        for (Reloj reloje : relojes) {
            reloje.show();
            
        }
        System.out.printf("%nIncrementar 1 minuto%n");
        System.out.printf("====================%n");
        for (Reloj reloje : relojes) {
            reloje.incrementarMinuto();
            reloje.show();
        }
        
        System.out.printf("%nIncrementar 1 hora%n");
        System.out.printf("====================%n");
        for (Reloj reloje : relojes) {
            reloje.incrementarHora();
            reloje.show();
            
        }
        System.out.printf("%nResetear a las 12:00 y poner 00:00%n");
        System.out.printf("===================================%n");
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].reiniciar(); 
            relojes[i].show(); 
        }
        
        System.out.printf("%nSeleccionar hora%n");
        System.out.printf("==================%n");
        System.out.println(relojes [0].setHora(22, 0)); 
            
        
        
        }
    }
          
        
        
        
        
        
        
        
        
        
        
        /*
        Reloj [] relojes = new Reloj [5];
        relojes [0] = new Reloj(18, 23);
        relojes [1] = new Reloj(11, 59, "CASIO");
        relojes [2] = new Reloj(13, 22, "GUESS");
        relojes [3] = new Reloj(15, 47);
        relojes [4] = new Reloj(relojes [0]);
        
        System.out.printf("Relojes%n");
        System.out.printf("===============%n");
        for (Reloj reloj : relojes) {
            reloj.show();
            
        }
       
        System.out.printf("%nRelojes con 1 minuto incrementado%n");
        System.out.printf("===============%n");
        for (Reloj reloj : relojes) {
            reloj.incrementarMinuto();
            reloj.show();
            
        }
        System.out.println();
        System.out.printf("%nRelojes con cambio de formato%n");
        System.out.printf("===============%n");
        for (Reloj reloj : relojes) {
            reloj.cambiarFormato();
            reloj.show();
        }
        
        System.out.printf("%nReiniciar todos los relojes%n");
        System.out.printf("================%n");
        for (Reloj reloj : relojes) {
            System.out.println(reloj.reiniciar());
            
            
        }
    }

}
*/


















/* Ejercicio hecho por mi
    r1.show();  // Mostrar hora inicial: debería mostrar "22:00"
        

        boolean resultado = r1.setHora(25, 00); // Intentamos establecer 25:00
        System.out.println("Resultado setHora: " + resultado);  // Debería mostrar false

        r1.show();  // Mostrar la hora después de intentar cambiarla: debería seguir mostrando "22:00"

        // Probar con valores válidos
        resultado = r1.setHora(10, 30);  // Cambiar a 10:30
        System.out.println("Resultado setHora: " + resultado);  // Debería mostrar true*/

 /*   Ejercicio de notion
    Reloj[] relojes = new Reloj[5];
        relojes[0] = new Reloj(13, 59, "CASIO");
        relojes[1] = new Reloj();
        relojes[2] = new Reloj(5, 45, "GUESS");
        relojes[3] = new Reloj(14, 22);
        relojes[4] = new Reloj(9, 32, "FLIPFLOP");

        System.out.println("Mostrar relojes");
        //mostrar todos los relojes del array
        for (Reloj r : relojes) {
            r.show();
        }
        System.out.println("Mostrar relojes con incremento de 1 minuto");
        for (Reloj r : relojes) {
            r.incrementarMinutos();
            r.show();
        }
        System.out.println("Cambio de formato de hora");
        for (Reloj r : relojes) {
            System.out.print("A:");
            r.show2();
            
            r.cambiarFormatoHora();
            
            System.out.print("B:");
            r.show2();
            r.show();
     
       }
        
    }

} 

        /*System.out.println("Reloj r2 ");
        System.out.println(r2.incrementarMinutos());
        System.out.println(r2.incrementarMinutos());
        System.out.println("Reloj r1 ");
        System.out.println(r1.incrementarHoras());
        System.out.println(r1.incrementarHoras());
        r1.cambiarFormatoHora();
        r1.reiniciar();
         Reloj [] relojes  = new Reloj [5];
        relojes [0] = new Reloj(13, 59, "CASIO");
        relojes [1] = new Reloj();
        relojes [2] = new Reloj(5, 45, "ADVANCE");
        relojes [3] = new Reloj(14, 22);
        relojes [4] = new Reloj(9, 32, "FLIPFLOP");
        
       
        for (Reloj reloj : relojes) {
            reloj.show();
        }*/
