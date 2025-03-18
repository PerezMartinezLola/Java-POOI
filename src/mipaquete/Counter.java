
package mipaquete;


public class Counter {
    //propiedades
    //poner las propiedades en privado es encapsular, poner los métodos no
    private int value;
    private int maxValue = 120;
    private String model = "N-COUNTER";
    private static String CounterEnEsperanto = "ohmmmm";
    private static int contadoresCreados;
    

    //constructores
    public Counter() {
        this.value = value;
        this.maxValue = maxValue;
        this.model = model;
        contadoresCreados++;
    }

    public Counter(int maxValue) {
        this.maxValue = maxValue < 10? 10: maxValue;
        contadoresCreados++;
    }
     
    public Counter(int maxValue, String model) {
        this.maxValue = maxValue < 10? 10: maxValue;
        this.model = model;
        contadoresCreados++;
    }
    
    public Counter (Counter c){
        this.maxValue = c.maxValue;
        this.model = c.model;
        contadoresCreados++;
    }
    
    //Métodos
    public boolean increment (){
        return increment(1);
          
    }
    public boolean increment(int n){
        if(value + n <= maxValue){
            value+= n;
            return true;
        }else{
            value= maxValue;
             return false;
        }
           
    }
     public boolean reset(){
        if(maxValue == value){
            value = 0;
            return true;
        } else {
            return false;
        }
    }
    public void show(){
        System.out.printf("Contador (%d/%d) modelo %s. Posicion:%d.%n", value, maxValue, model, contadoresCreados);
        
    }
    
    //Getter y setter
    public int getMaxValue (){
        return maxValue;
    }
    
    public void showEnEsperanto (){
         System.out.printf("%s (%d/%d) modelo %s%n", 
                 Counter.CounterEnEsperanto, this.value, this.maxValue, this.model);
         //ponemos Counter.CounterEnEspanto para hacer referencia a que es una propiedad static de Counter
         //podríamos poner this porque al final forma parte del objeto/instancia pero es más correcto poner Counter
    }
    
    public String comoSeDiceShowEnEsperanto (){
        //ponemos estatico porque le tenemos que preguntar a la propiedad de la clase static
       // Los objetos saben por la información static de la clase por eso podemos quitar el static aqui
        return CounterEnEsperanto;
        
    }
}
