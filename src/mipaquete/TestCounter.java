
package mipaquete;


public class TestCounter {
     public static void main(String[] args) {
         //Main es el nombre del método
        Counter c1 = new Counter ();
        Counter c2 = new Counter (50);
        Counter c3 = new Counter (80, "Model-A");
        Counter c4 = new Counter ();
        
       c1.show();
       c2.show();
       c3.show();
       c4.show();
        
       /* c1.show();
        c2.show();
        System.out.println(c2.increment(50));
        c2.show();
        c3.show();
        c4.show();
        System.out.println(c1.getMaxValue());*/
       
    }
}
