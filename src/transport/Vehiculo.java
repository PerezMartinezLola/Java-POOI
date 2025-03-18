package transport;

public class Vehiculo {

    private String matricula;
    private String tipo;
    private short yearFabricacion;
    private int kilometraje;
    private boolean requiereMantenimiento;

    public Vehiculo(String matricula, String tipo, short yearFabricacion, int kilometraje) {
        String tipoValido = "moto".equalsIgnoreCase(tipo)|| "camion".equalsIgnoreCase(tipo) || 
                "bicicleta".equalsIgnoreCase(tipo) ? tipo.toUpperCase() : "COCHE";
        
        short yearFabricacionValido = yearFabricacion <1990? 1990 : yearFabricacion > 2024? 2024 : yearFabricacion;
        
        this.matricula = validarMatricula(matricula) ? matricula.toUpperCase() : "DESCONOCIDA";
        this.tipo = tipoValido;
        this.yearFabricacion = yearFabricacionValido;
        this.kilometraje = kilometraje < 0 ? 0 : kilometraje;
    }

    public Vehiculo(Vehiculo v) {
        matricula = v.matricula;
        tipo = v.tipo;
        yearFabricacion = v.yearFabricacion;
        kilometraje = v.kilometraje;
        requiereMantenimiento = v.requiereMantenimiento;
    }

    //métodos privados estaticos
    private static boolean validarMatricula(String matricula) {
        if (matricula.length() > 10 || matricula.length() < 4) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (!(matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z'
                    || matricula.charAt(i) >= 'a' && matricula.charAt(i) <= 'z')) {
                return false;
            }
        }
        for (int i = 3; i < matricula.length(); i++) {
            if (!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    public void show() {
        System.out.printf("Vehiculo [%s] (%s) del anio %d con %d km. Requiere mantenimiento: %s.%n",
                matricula, tipo, yearFabricacion, kilometraje, requiereMantenimiento ? "Sí" : "No");
    }
    
    
   // boolean actualizarKilometraje(int nuevoKilometraje): Actualiza el kilometraje si el nuevo valor es
    //mayor que el actual. Devuelve true si se actualizó, false en caso contrario.
    
    public boolean actualizarKilometraje (int nuevoKilometraje){
        if (nuevoKilometraje > kilometraje){
            kilometraje = nuevoKilometraje;
            return true;
        }else{
            return false;
        }
    }
    //boolean marcarParaMantenimiento(): Cambia el estado de requiereMantenimiento a true. 
    //Devuelve true si se marcó, false si ya estaba marcado.
    public boolean marcarParaMantenimiento (){
       if (requiereMantenimiento){
           return false;
       }else {
           requiereMantenimiento = true;
           return true;
       }
    }
    //int calcularAntiguedad(): Calcula la antigüedad del vehículo restando el año actual del año de fabricación
    public int calcularAntiguedad (){
        return 2024-yearFabricacion;
    }
    
    //boolean mismaAntiguedad(Vehiculo v): Compara la antigüedad de dos vehículos, 
    //devolviendo true si tienen la misma antigüedad.
    public boolean mismaAntiguedad (Vehiculo v){
        return calcularAntiguedad() == v.calcularAntiguedad();
    }
    
    //boolean esIgual(Vehiculo v): Devuelve true si coinciden en matricula y tipo
    public boolean esIgual (Vehiculo v){
        return matricula.equals(v.matricula) && tipo.equals(v.tipo);
    }
}


























/*   //PROPIEDADES
    private String matricula;
    private String tipo;
    private short anioFabricacion;
    private int kilometraje;
    private boolean requiereMantenimiento;

    
    //CONSTRUCTORES
    public Vehiculo(String matricula, String tipo, short anioFabricacion, int kilometraje) {
        //valores válidos
        
        //si ponemos el equals al revés nos aseguramos de que no exista null
        //ponemos ignorecase para que coja el nombre aunque este en mayusculas y minusculas
        //ponemos tipo.toLowercase() para que lo convierta en minusculas
        String tipoValido = "camion".equalsIgnoreCase(tipo)||"moto".equalsIgnoreCase(tipo)|| 
                            "bicicleta".equalsIgnoreCase(tipo) ? tipo.toLowerCase() :"coche";
        //creamos una variable para verificar la validación y no tenerla en la misma línea
        short anioFabricacionValido = anioFabricacion < 1990 ? 1990 : anioFabricacion > 2024 ? 2024 : anioFabricacion;
        int kilometrajeValido = kilometraje < 0 ? 0 : kilometraje;
        
        
        //Construccion con valores válidos
        this.anioFabricacion = anioFabricacionValido;
        this.matricula = matriculaValida(matricula)? matricula : "DESCONOCIDA";
        this.tipo = tipoValido;
        this.kilometraje = kilometrajeValido;
        //este boolean se puede quitar porque boolean por defecto es false
        requiereMantenimiento = false;
        
    }
    public Vehiculo (Vehiculo vehi){
        matricula = vehi.matricula;
        tipo = vehi.tipo;
        anioFabricacion = vehi.anioFabricacion;
        kilometraje = vehi.kilometraje;
        requiereMantenimiento = vehi.requiereMantenimiento;
       
    }
    
    
    //MÉTODOS PÚBLICOS
    
    public void show (){
        System.out.printf("Vehiculo [%s] (%s) del anio %d con %d km. Requiere mantenimiento: %s.%n", 
                matricula, tipo,anioFabricacion, kilometraje, requiereMantenimiento ? "Si": "No");
    }
    
    public boolean marcarParaMantenimiento (){
        if(requiereMantenimiento){//no ponemos nada porque es false por defecto
            return false;
        }else{
            requiereMantenimiento = true;
            return true;
        }
    }
    public int calcularAntiguedad (){
        //sumamos 1 porque damos por hecho que  si es de este año ya tiene un año
        return 2024 - this.anioFabricacion +1;
    }
    
    public boolean mismaAntiguedad (Vehiculo v){  
        return anioFabricacion == v.anioFabricacion;
    }
    
    public boolean esIgual (Vehiculo v){
        return matricula.equals(v.matricula) && tipo.equals(v.tipo);     
    }
    
    
    //MÉTODOS PRIVADOS
    private static boolean matriculaValida(String matricula){
        //ha puesto 4 porque considera que como minimo la matricula debe tener 3 letras y 1 número ABC1
        if(matricula.length() > 10 || matricula.length() <= 4) return false;
        for(int i = 0; i < 3; i++){
            if(!(matricula.charAt(i)>= 'A' && matricula.charAt(i) <= 'Z')) return false;
        }
        for(int i = 3; i < matricula.length(); i++){
            if(!(matricula.charAt(i)>= '0' && matricula.charAt(i) <= '9')) return false;
        }
        return true;
    }
    
}
    
 */
