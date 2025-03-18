package humanosExamenCasa;

public class Test {

    public static void main(String[] args) {
      
       Person p1 = new Person((short) 1989, "LolaPerezMartinezPerez", "LolaPerezMartinezPerez");
       Person p2 = new Person("Kike", "Perez");
       Person p3 = new Person((short) 1991,"Jose", "Gonzalez");
       Person p4 = new Person(p1);
       
        System.out.println(p1.changeName("lola", "Perez"));
        p1.show();
       
       
       
       
        
        
    }
    
 

}
