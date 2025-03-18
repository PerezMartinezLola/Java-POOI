
package miscositas.humanos;


public class Test {
    public static void main(String[] args) {
        Person p1 = new Person((short) 1989, "JuanCarlosFranciscoDeLaVega","loijsbdwiodjneotsltnaaaaa");
        p1.show();
        Person p2 = new Person("Lorena", "Ochoa");
        Person p3 = new Person((short)1989, "Julia", "Carrera");
        Person p4 = new Person(p3);
        p2.show();
        System.out.println(p2.getSurname());
        System.out.println(p2.changeSurname(""));
        System.out.println( p1.diferenciaEdad(p2));
        System.out.println(p1.sameAge(p2));
        System.out.println(p3.sameAge(p1));
        System.out.println(p3.compareWith(p4));
        
        
    }
}
