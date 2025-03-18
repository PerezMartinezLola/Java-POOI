
package pildoras;

/**
 *
 * @author lolit
 */
public class Portatil {
    private int peso;
    private String color;
    private boolean nuevo;

    public int getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public boolean isNuevo() {//los métodos que acceden a propiedades de tipo boolean suelen usar el prefijo is en lugar de get.
        return nuevo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    
    
}

