
package singleclasespoint1;

public class PointCasa {
    byte x;
    byte y;
    String color;
    char symbol;

    
    public void showSimple (){
        System.out.printf("Point %c de color %s (%d, %d)%n",
                symbol, color, x, y);
    }
    public PointCasa(byte x, byte y, String color, char symbol) {
        this.x = (x < 0)? 0: (x > 12)? 12: x;
        
        this.y = (y < 0)? 0: (y > 7)? 7: y;
        
        //“red”, “green”, “yellow”, “blue” y “purple”
        this.color = ( "red".equals(color) || "green".equals(color) || "yellow".equals(color) || "blue".equals(color) || "purple".equals(color) ? color : color == null? "black": "black");
        
        this.symbol = symbol;
        
    }

    public PointCasa() {
        this((byte)0 , (byte)0, "red", '*');//aqui imprime black
    }

    public PointCasa(byte x, byte y) {
        this (x, y, null, '?');
    }

    public PointCasa(String color, char symbol) {
        this ((byte)2, (byte) 4, color, symbol);
    }
    
    
    public PointCasa (PointCasa p){
        this.x = p.x;
        this.y = p.y;
        this.color = p.color;
        this.symbol = p.symbol;
    }
    
    public static void main(String[] args) {
        PointCasa p1 = new PointCasa ((byte)2, (byte) 5, "yellow", '<');
        PointCasa p2 = new PointCasa ();
        PointCasa p3 = new PointCasa ((byte) 0, (byte)7);
        PointCasa p4 = new PointCasa ("green", '*');
        PointCasa p5 = new PointCasa (p4);
        p1.showSimple();
        p2.showSimple();
        p3.showSimple();
        p4.showSimple();
        p5.showSimple();
        p1.showSimple();
        p1.left();
        p1.showSimple();
        p1.showSimple();
        p1.down();
        p1.showSimple();
        p1.right();
        p1.showSimple();
        
    }
    
    public boolean up (){
        if (y == 7){
             return false;
        } else {
            y++;
            return true;
        }  
    }
    
    public boolean down() {
        if (y == 0) {
            return false;
        } else {
            y--;
            return true;
        }
    }
    
    public boolean left (){
        if (x == 0){
            return false;
        }else{
            --x;
            return true;
        }
    }
    
    public boolean right() {
        if (x == 12) {
            return false;
        } else {
            x++;
            return true;
        }
    }
    
}
