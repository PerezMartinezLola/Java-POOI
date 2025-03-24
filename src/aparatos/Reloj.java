package aparatos;

public class Reloj {

    private int horas;
    private int minutos;
    private String modelo;
    private boolean en24Horas;
    
    
    
    public Reloj (){
        this(0,0);
    }

    public Reloj(int horas, int minutos, String modelo) {
        this.horas = horas < 0 ? 0 : horas > 23 ? 0 : horas;
        this.minutos = minutos < 0 ? 0 : minutos > 59 ? 0 : minutos;
        this.modelo = modelo == null ? "BASIC-WATCH": modelo;
        en24Horas = true;
    }

    public Reloj(int horas, int minutos) {
        this(horas, minutos, "BASIC-WATCH");
    }

    public Reloj (Reloj r){
        horas = r.horas;
        minutos = r.minutos;
        modelo = r.modelo;
        en24Horas = r.en24Horas;
    }
        
    public void show (){
        if(en24Horas){
            System.out.printf("Reloj (%s): %02d:%02d.%n", modelo,horas, minutos);
        }else{
            System.out.printf("Reloj (%s): %02d:%02d %s.%n", modelo, horas > 12 ? horas-12: horas, minutos, 
                    horas < 12? "AM": "PM");
        }
    }
    
    //boolean incrementarMinuto(): Incrementa los minutos en 1. Si llega a 60, reinicia los minutos y 
    //aumenta la hora. Devuelve true si se pudo incrementar.
    public boolean incrementarMinuto (){
      minutos =  minutos == 59 ? 0 : minutos+1;
      horas = minutos == 0 ? (horas == 23 ? 0 : horas+1) : horas;
       return true;
    }
    //boolean incrementarHora(): Incrementa las horas en 1. Si llega a 24 (o 12 en el 
    //formato de 12 horas), reinicia la hora. Devuelve true si se pudo incrementar.
    public boolean incrementarHora (){
        if(en24Horas){
            horas = horas == 23 ? 0 : horas+1;
            
        }else{
            horas = horas == 12? 1 : horas +1;
        }
        return true;
    }

    public boolean cambiarFormato (){
        return en24Horas =! en24Horas;
    }
    
    //reiniciar el reloj a las 12:00 y poner las 00:00
    public boolean reiniciar (){
        if (horas == 12 || horas == 24 && minutos == 0){
            horas = 0;
            return true;
        }else{
            return false;
        }
         
    }
    //boolean setHora(int horas, int minutos): Ajusta las horas y minutos, validando que sean 
    //valores correctos. Devuelve false si los valores son inválidos.
    public boolean setHora (int horas, int minutos){
       boolean horaCorrecta = horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
       if(horaCorrecta){
           this.horas = horas;
           this.minutos = minutos;
       }
       return horaCorrecta;
    }
    
    
}

/*
    private int horas;
    private int minutos;
    private String modelo;
    private boolean en24Horas;

    public Reloj() {
        this(0, 0);
    }

    public Reloj(int horas, int minutos) {
        this(horas, minutos, "CASIO");
    }

    public Reloj(int horas, int minutos, String modelo) {
        this.horas = horas < 0 ? 0 : horas > 23 ? 23 : horas;
        this.minutos = minutos < 0 ? 0 : minutos > 59 ? 59 : minutos;
        this.modelo = modelo == null ? "BASIC-WATCH" : modelo;
        en24Horas = true;
    }

    public Reloj(Reloj r) {
        horas = r.horas;
        minutos = r.minutos;
        modelo = r.modelo;
        en24Horas = r.en24Horas;
    }

    public void show() {
        if (en24Horas) {
            System.out.printf("Reloj (%s) %02d:%02d.%n", modelo, horas, minutos);
        } else {
            System.out.printf("Reloj (%s) %02d:%02d %s.%n", modelo,
                    horas > 12 ? horas - 12 : horas, minutos, horas < 12 ? "AM" : "PM");

        }

        //boolean incrementarMinuto(): Incrementa los minutos en 1. Si llega a 60, 
        //reinicia los minutos y aumenta la hora. Devuelve true si se pudo incrementar.
    }

    public boolean incrementarMinuto() {
        minutos = minutos == 59 ? 0 : minutos + 1;
        horas = minutos == 0 ? (horas == 23 ? 0 : horas + 1) : horas;
        return true;
    }

    //boolean incrementarHora(): Incrementa las horas en 1. Si llega a 24 (o 12 en el formato 
    //de 12 horas), reinicia la hora. Devuelve true si se pudo incrementar.
    public boolean incrementarHora() {
       horas = horas == 12 || horas == 24 ? 0 : horas+1;
       return true; 
    }
    
    //boolean cambiarFormato(): Cambia entre formato de 24 horas y 12 horas.
    public boolean cambiarFormato() {
        return en24Horas = !en24Horas;
    }
    //boolean reiniciar(): Pone el reloj a las 00:00 si son las 12:00 . Devuelve true si se reinició.

    public boolean reiniciar() {
        if (horas == 12 && minutos == 0) {
            horas = 0;
            return true;
        } else {
            return false;
        }

    }
    //boolean setHora(int horas, int minutos): Ajusta las horas y minutos, validando que sean valores 
    //correctos. Devuelve false si los valores son inválidos.

    public boolean setHora(int horas, int minutos) {
        boolean horaCorrecta = horas >= 0 && horas <= 24 && minutos >= 0 && minutos <=59;
        if (horaCorrecta) {
            this.horas = horas;
            this.minutos = minutos;
        }
        return horaCorrecta;
        
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

}
 */
 /* private int horas;
    private int minutos;
    String modelo;
    boolean en24Horas;

    public Reloj() {
        horas = 0;
        minutos = 0;
        modelo = "BASIC-WATCH";
        en24Horas = true;

    }

    public Reloj(int horas, int minutos) {
        this(horas, minutos, "BASIC-WATCH");
        /* this.horas = horas;
        this.minutos = minutos;
        modelo = (modelo != null && modelo.isEmpty()) ? modelo : "BASIC-WATCH";
        en24Horas = true;*/
 /* public Reloj(int horas, int minutos, String modelo) {
        this.horas = horas < 0 ? 0 : horas > 23 ? 23 : horas;
        this.minutos = minutos < 0 ? 0 : minutos > 59 ? 59 : minutos;
        this.modelo = (modelo == null || modelo.isEmpty()) ? "BASIC-WATCH" : modelo;
        en24Horas = true;

    }

    public Reloj(Reloj j) {
        this.horas = j.horas;
        this.minutos = j.minutos;
        this.modelo = j.modelo;
        this.en24Horas = j.en24Horas;
    }

    public void show() {
        String mostrarHora;
        if (en24Horas) {
            mostrarHora = String.format("%02d:%02d", horas, minutos);
        } else {
            int hora12 = (horas == 0 || horas == 12) ? 12 : horas % 12;
            String periodo = horas < 12 ? "AM" : "PM";
            mostrarHora = String.format("%d:%02d %s", hora12, minutos, periodo);
        }
        System.out.println("Reloj" + " " + modelo + " " + mostrarHora + ".");

    }

    //Métodos
    //Incrementar 1 minuto
    public boolean incrementarMinutos() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            incrementarHoras();
        }
        return true;
    }

    //Incrementar 1 hora
    public boolean incrementarHoras() {
        horas++;
        if (en24Horas && horas == 24) {
            horas = 0;
        } else if (!en24Horas && horas == 12) {
            horas = 0;

        }
        return true;
    }

    //Cambiar formato 24 horas a 12
    public boolean cambiarFormatoHora() {
        en24Horas = !en24Horas;
        return true;
    }

    public boolean reiniciar() {
        if (en24Horas) {
            horas = 0;
            minutos = 0;

        } else {
            horas = 12;
            minutos = 0;

        }
        show();
        return true;
    }

    public boolean setHoras(int horas, int minutos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 || minutos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            return true;
        }
        return false;
    }

    public void show2() {
        System.out.printf("%02d:%02d %s %b.%n", horas, minutos, modelo, en24Horas);

    }
 */
