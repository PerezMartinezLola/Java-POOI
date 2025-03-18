package paracticarstatic;

public class Animal {

    private int ID;
    private int peso;
    private String color;
    private static int cantAnimales;
    private static int nextID = 1;

    public void show() {
        System.out.printf("Animal ID %d, peso %d kg,color %s. %n",
                ID, peso, color);
    }

    public void showClase() {
        System.out.printf("Cantidad total: %d. Ultimo NextID:%d.%n", cantAnimales, nextID);
    }

    public Animal(int peso, String color) {
        this.peso = peso;
        this.color = color;
        ID = nextID++;
        cantAnimales++;
    }

    public Animal(int peso) {
        this.peso = peso;
        ID = nextID++;
        cantAnimales++;
    }

    public Animal(String color) {
        this.color = color;
        ID = nextID++;
        cantAnimales++;
    }

    public Animal(Animal a) {
        this.color = a.color;
        this.peso = a.peso;
        ID = nextID++;
        cantAnimales++;
    }

}
