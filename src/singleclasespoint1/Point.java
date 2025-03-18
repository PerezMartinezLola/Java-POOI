
package singleclasespoint1;

public class Point {
    byte x ;
    byte y;
    String color;
    char symbol;

    public Point(byte x, byte y, String color, char symbol) {
        this.x = (x < 0) ? 0 : (x > 12)? 12: x;
       // if (x < 0){
       //     this.x = 0;
      //  }else if (x > 12){
      //      this.x = 12;
      //  }
        this.y = (y < 0)? 0: (y > 7)? 7 : y;
      //  this.y = y;
      //  if(y < 0){
      //     this.y = 0;
      //  }else if (y >7){
      //      this.y = 7;}
        
        //“black”, “red”, “green”, “yellow”, “blue” y “purple”
        this.color = ( color == "red" || color == "green" || color == "yellow" || color == "blue" || color == "purple" ? color : color == null? "black": "black");
            //   if (color == "red" || color == "green" || color == "yellow" || color == "blue" || color == "purple"){
            //       this.color = color; 
         //   }else {
         //          this.color = "black";
         //      }
        this.symbol = symbol;
                
    }
     
    public Point(){
//cuando te da un constructor dado pero quieres coger parámetros de otro constructor tienes que llamarlo.
       this( (byte)0,(byte)0, "black", '*'); 
    }

    public Point(byte x, byte y) {
        this (x, y, "black", '*');
    }

    public Point(String color, char symbol) {
        this.color = color;
        this.symbol = symbol;
        x = 1;
        y = 1;
        
    }
    
    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
        this.color = p.color;
        this.symbol = p.symbol;
    }
    
    public void showSimple() {
        System.out.printf("Point %c de color %s (%d, %d)%n", symbol, color, x ,y);
    }
    
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.showSimple();
        Point p = new Point((byte) -3, (byte) 5, null, '+');
        p.showSimple();
        Point p2 = new Point(p);
        p2.showSimple();
        System.out.println(p == p2);
        Point p10 = new Point((byte) 3, (byte) 5);
        p10.showSimple();
        for (int i = 0; i < 10; i++) {
            System.out.println(p10.down());
            p10.showSimple();
        }
    }
    
    public boolean up(){
        if (y < 7){
           y++ ;
           return true;
        }else {
            return false;
        }
    }
    
    public boolean down () {
        if (y > 0){
            y -=1;
            return true;
        }else{
            return false;
        }
    }

    public boolean left () {
        if (x > 0){
            x -=1;
            return true;
        }else {
            return false;
        }
    }
    
    public boolean right () {
        if(x < 12){
            x +=1;
            return true;
        }else {
            return false;
        }
    }
    
}
