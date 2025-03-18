package vehiculohechoencasa;

public class Vehiculo {

    String marca;
    String tipo;
    byte numRuedas;
    short yearFabricacion;
    String color;
    int x;
    double velocidad;
    boolean nuevo;
    double kms;
    double precio;
    String[] historicoDeColores;

    public void show() {
        System.out.printf("%s %s %s %s [%d] de %d ruedas con %.2f kms a %.2f km/h de precio %.2f euros(x=%d).%n",
                tipo, marca, color, nuevo ? "nuevo" : "usado", yearFabricacion,
                numRuedas, kms, velocidad, precio, x);

        System.out.println("Histórico de colores");
        for (String c : historicoDeColores) {
            System.out.printf("%S ", c != null ? c : "");
        }
        System.out.println();

    }

    //Constructores
    public Vehiculo(String marca, byte numRuedas, String color, double precio) {
        this.marca = marca == null ? "Seat" : marca;
        this.numRuedas = numRuedas < 2 ? 2 : numRuedas;
        switch (this.numRuedas) {
            case 2:
                tipo = "moto";
                break;
            case 3:
                tipo = "triciclo";
                break;
            case 4:
                tipo = "Coche";
                break;
            case 5:
                tipo = "autobus";
                break;
            default:
                tipo = "camion";
                break;
        }
        this.color = color;
        historicoDeColores = new String[5];//historicoDeColores = [null, null, null, null, null];
        if (this.color != null) {
            historicoDeColores[0] = this.color;
        }

        this.yearFabricacion = 2024;
        this.color = color == null ? "blanco" : color;
        x = 0;
        velocidad = 0;
        nuevo = true;
        kms = 0;
        this.precio = precio;

    }

    public Vehiculo() {
        this("Toyota", (byte) 4, "Negro", 20_000);
    }

    public Vehiculo(Vehiculo v) {
        this.marca = v.marca;
        this.tipo = v.tipo;
        this.numRuedas = v.numRuedas;
        this.yearFabricacion = v.yearFabricacion;
        this.color = v.color;
        this.x = v.x;
        this.velocidad = v.velocidad;
        this.nuevo = v.nuevo;
        this.kms = v.kms;
        this.precio = v.precio;
        this.historicoDeColores = v.historicoDeColores;
    }

    //quiero crear un vehiculo igual pero que sea nuevo por lo tanto el precio será distinto
    public Vehiculo(Vehiculo v, double precio) {
        this(v.marca, v.numRuedas, v.color, precio);
    }

    //yo y mi hermano compramos el mismo coche pero de diferente color
    public Vehiculo(Vehiculo ve, String color) {
        this(ve.marca, ve.numRuedas, color, ve.precio);
    }

    //Métodos
    //Metodo pintar y poner en el historico de colores
    public Vehiculo pintar(String color) {
        int posicionEn = -1;
        for (int i = 0; i < historicoDeColores.length; i++) {
            if (historicoDeColores[i] == null) {
                posicionEn = i;
                break;
            }
        }
        if (posicionEn != -1) {
            historicoDeColores[posicionEn] = color;
            this.color = color;
            return this;
        } else {
            return null;
        }
    }

    public Vehiculo para(double velocidad) {
        velocidad = 0;
        return this;
    }

    public Vehiculo acelera() {
        velocidad = ((velocidad + 10) >= 120) ? 120 : velocidad + 10;
        System.out.printf("Nueva velocidad:%.2f kms/h.%n", velocidad);
        return this;
    }

    public Vehiculo frena() {
        velocidad = (velocidad - 10 <= 0) ? 0 : velocidad - 10;
        System.out.printf("Nueva velocidad:%.2f kms/h.%n", velocidad);
        return this;
    }

    public Vehiculo para() {
        velocidad = 0;
        System.out.println("Vehiculo parado.");
        return this;
    }

    public Vehiculo PintarBasadoEn(Vehiculo v) {

        return v == null ? null : pintar(v.color);
    }
}
