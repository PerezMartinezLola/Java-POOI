
package clasepracticavehiculo;


public class VehiculoJavi{
   
    
    private String marca; // getter
    public String getMarca (){
        return marca;
    }
    
    private String tipo; // getter
    public String getTipo (){
        return marca;
    }
    
    private byte numeroDeRuedas; //getter
    public byte getNumeroDeRuedas (){
        return numeroDeRuedas;
    }
    private short yearFabricacion; //getter
    public short getYearFabricacion(){
        return yearFabricacion;
    }

    private String[] historicoDeColores; // máximo 5  // no g no s 
    
    private String color;// g
    public String getColor (){
        return color;
    }

    private int x;// g
    public int getX (){
        return x;
    }
    
    private double velocidad; //g
    public double getVelodicad (){
        return velocidad;
    }
    
    private boolean nuevo; //g
    public boolean getNuevo (){
        return nuevo;
    }
    
    private double kms; // g
    public double getKms (){
        return kms;
    }
    
    private double precio; // g s
    public double getPrecio () {
        return precio;   
    }
    public void setPrecio (double precio){ //se pone void porque 
        this.precio = precio;
    }

    public void show() {
        System.out.printf(
                "%s %s %s %s [%d] de %d ruedas con %.2f kms a %.2f km/h de precio %.2f (x=%d).%n",
                tipo, marca, color, nuevo ? "nuevo" : "usado", yearFabricacion,
                numeroDeRuedas, kms,
                velocidad, precio, x);
        
        System.out.println("Histórico de colores");
        for (String c : historicoDeColores) {
            System.out.printf("%S ", c != null ? c: "");
        }
        System.out.println();
    }

    public VehiculoJavi(VehiculoJavi v) {
        x = 0;
        yearFabricacion = v.yearFabricacion;
        velocidad = v.velocidad;
        color = v.color;
        marca = v.marca;
        tipo = v.tipo;
        numeroDeRuedas = v.numeroDeRuedas;
        nuevo = v.nuevo;
        kms = v.kms;
        historicoDeColores = v.historicoDeColores;
        precio = v.precio;

    }

    public VehiculoJavi(VehiculoJavi ve, double precio) {
        this(ve.color, ve.marca, ve.numeroDeRuedas, precio);
    }

    public VehiculoJavi() {
        this("blanco", "Seat", (byte) 4, (int) 1_000.4);
    }

    public VehiculoJavi(String color, String marca, byte numeroDeRuedas, double precio) {
        // tengo ya el this con los valores por defecto
        x = 0;

        yearFabricacion = 2024;
        velocidad = 0;
        this.color = color;
        this.marca = marca == null ? "Seat" : marca; // Seat si no hay marca

        this.numeroDeRuedas = numeroDeRuedas < 2 ? 2 : numeroDeRuedas;

        switch (this.numeroDeRuedas) {
            case 2:
                tipo = "moto";
                break;
            case 3:
                tipo = "triciclo";
                break;
            case 4:
                tipo = "coche";
                break;
            case 10:
                tipo = "autobús";
                break;
            default:
                tipo = "camión";
        }

        nuevo = true;
        kms = 0;
        historicoDeColores = new String[5];//historicoDeColores = [null, null, null, null, null]
        // si el vehículo ya tiene un color definido, ese color se guarda en la 
        //primera posición del arreglo historicoDeColores
        if (this.color != null) {
            historicoDeColores[0] = this.color;
        }
        this.precio = precio < 100 ? 100 : precio;
    }

    public VehiculoJavi pintar(String color) {
        //buscar si hay un espacio para escribir en él
        int puedoEscribirEn = -1;
        
        for (int i = 0; i < historicoDeColores.length; i++) {
            //si encuentra un espacio en el array null
            if (historicoDeColores[i] == null) {
                puedoEscribirEn = i;// Registrar el índice del espacio libre
                break;// Salir del bucle
            }
        }
          // Si se encontró un espacio, registrar el color
        if (puedoEscribirEn != -1) {
            historicoDeColores[puedoEscribirEn] = color;// Guardar el nuevo color en el historial
            this.color = color;// Actualizar el color del vehículo
            return this;// Retornar el vehículo actualizado
        } else {
            return null;// Si no hay espacio, retornar null
        }
    }

    // se llama pintar y coge el vehículo sobre el que aplica cambia a color blanco
    public VehiculoJavi pintar() {
        return pintar("blanco"); 
    }

    public VehiculoJavi para(){
        velocidad = 0;
        System.out.println("Vehículo detenido.");
        return this;
    }
    
    public void circula(double velocidad) {
    }
    
    
    public VehiculoJavi acelera() {
        
        velocidad = ((velocidad + 10) >= 120) ? 120: velocidad + 10;
        System.out.printf("Nueva velocidad: %.2f%n", velocidad);
        return this;
    }

    public VehiculoJavi frena() {
        velocidad = ((velocidad - 10) <=0) ? 0: velocidad - 10;
        System.out.printf("Nueva velocidad: %.2f%n", velocidad);
        return this;
    }
    
    public VehiculoJavi pintarBasadoEn (VehiculoJavi vehiculo) {
        
        return vehiculo == null ? null: pintar(vehiculo.color);
    }
    public double getVelocidad () {//tienes que poner public + la propiedad que necesitas que te de
        return velocidad; 
    }
    public void setVelocidad (double velocidad) {
        this.velocidad = velocidad;
    
    }
    
}
