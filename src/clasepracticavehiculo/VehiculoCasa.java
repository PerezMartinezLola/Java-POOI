package clasepracticavehiculo;

public class VehiculoCasa {

    int x;
    double velocidad;
    String color;
    String marca;
    String tipo;
    byte numeroDeRuedas;
    boolean nuevo;
    double kms;
    String[] historicoDeColores;//máximo 5
    double precio;
    short yearFabricacion;

    public VehiculoCasa(VehiculoCasa v) {
        x = 0;
        velocidad = v.velocidad;
        color = v.color;
        marca = v.marca;
        tipo = v.tipo;
        numeroDeRuedas = v.numeroDeRuedas;
        nuevo = v.nuevo;
        kms = v.kms;
        historicoDeColores = v.historicoDeColores;
        precio = v.precio;
        yearFabricacion = v.yearFabricacion;
    }

    public VehiculoCasa(VehiculoCasa v, double precio) {
        this(v.color, v.marca, v.numeroDeRuedas, precio);
    }

    public VehiculoCasa(String color, String marca, byte numeroDeRuedas, double precio) {
        yearFabricacion = 2024;
        velocidad = 0;
        this.color = color == null ? "blanco" : color;
        this.marca = marca == null ? "SEAT" : marca;
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
            case 10:
                tipo = "autobus";
            default:
                tipo = "camion";
        }
        nuevo = true;
        historicoDeColores = new String[5];
        if (color != null) {
            historicoDeColores[0] = this.color;
        }

        this.precio = precio < 100 ? 100 : precio;
    }

    public VehiculoCasa pintar(String color) {
        int espacioParaGuardar = -1;
        for (int i = 0; i < historicoDeColores.length; i++) {
            if (historicoDeColores[i] == null) {
                espacioParaGuardar = i;
                break;
            }
        }
        if (espacioParaGuardar != -1) {
            historicoDeColores[espacioParaGuardar] = color;
            this.color = color;
            return this;
        } else {
            return null;

        }

    }

    public VehiculoCasa pintarBasadoEn(VehiculoCasa v) {
        return v == null ? null : pintar(v.color);
    }
}
