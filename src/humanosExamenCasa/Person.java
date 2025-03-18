package humanosExamenCasa;

public class Person {

    private short yearOfBirth;
    private String name;
    private String surname;
    private boolean brokenName;
    private boolean brokenSurname;

    public Person(short yearOfBirth, String name, String surname) {
        this.yearOfBirth = yearOfBirth == 0 ? 2024 : yearOfBirth > 2024 ? 2024 : yearOfBirth;
        if (name.length() > 20) {
            name = name.substring(0, 20);
            this.brokenName = true;
        }
        this.name = name.toUpperCase();

        if (surname.length() > 20) {
            surname = surname.substring(0, 20);
            this.brokenSurname = true;
        }
        this.surname = surname.toUpperCase();
    }

    public Person(String name, String surname) {
        this((short) 2024, name, surname);
    }

    public Person(Person p) {
        yearOfBirth = p.yearOfBirth;
        name = p.name;
        surname = p.surname;
        brokenName = p.brokenName;
        brokenSurname = p.brokenSurname;
    }

    public void show() {
        System.out.printf("Person %s %s de %d anios.%n", name, surname, 2024 - yearOfBirth);
    }

    //boolean isBroken(): para averiguar si alguno tiene name o surname roto (es decir, truncado).
    public boolean isBroken() {
        return brokenName || brokenSurname;
    }

    //boolean changeName(String name, String surname)`: en este caso solo cambia el nombre si se cumplen las siguientes condiciones (si no lo cambia devuelve false):
    // 1. Usar solo caracteres del alfabeto inglés en mayúsculas. 
    // 2. Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos. 
    // 3. Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
    // 4. No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.
    public boolean changeName(String name, String surname) {
        // 1. Usar solo caracteres del alfabeto inglés en mayúsculas. 
        if (name == null || surname == null) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) >= 'a' && name.charAt(i) <= 'z'
                    || name.charAt(i) == ' ')) {
                return false;
            }
        }
        
        for (int i = 0; i < surname.length(); i++) {
            if(!(surname.charAt(i)>= 'A' && surname.charAt(i) <= 'Z' || surname.charAt(i) >= 'a' && surname.charAt(i) <= 'z'
                    || surname.charAt(i) == ' ')){
                return false;
            }
        }
        
        //2. Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos.
        
        String nombreSinEspaciosExtremos = name.trim();
        int contadorEspaciosBlancoName = 0;
        for (int i = 0; i < nombreSinEspaciosExtremos.length(); i++) {
            if(nombreSinEspaciosExtremos.charAt(i) == ' '){
                contadorEspaciosBlancoName++;
                if(contadorEspaciosBlancoName >1){
                    return false;
                }
            }  
        }
        
        String surnameSinEspaciosExtremos = surname.trim();
        int contadorEspaciosBlancoSurname = 0;
        for (int i = 0; i < surnameSinEspaciosExtremos.length(); i++) {
            if(surnameSinEspaciosExtremos.charAt(i) == ' '){
                contadorEspaciosBlancoSurname++;
                if(contadorEspaciosBlancoSurname > 1){
                    return false;
                }
            }
        }
        
        // 3. Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
       if (name.length() > 20 || surname.length() > 20){
           return false;
       }
        
         // 4. No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.
         
       if (name.trim().equals("") || surname.trim().equals("")){
           return false;
       }
       this.name = name.toUpperCase();
       this.surname = surname.toUpperCase();
       brokenName = brokenSurname = false;

        return true;
    }
    //1. `boolean changeName(String surname)`
    //boolean changeName(String name)`
    
    public boolean changeName (String name){
        return this.changeName(name, this.surname);
    }
    
    public boolean changeSurname (String surname){
        return this.changeName(this.name, surname);
    }
    
    //short getAge(): devuelve la edad haciendo un calculo sencillo restando el año actual del año de nacimiento. 
    public short getAge (){
        return (short) (2024 -yearOfBirth);
    }
    
    //boolean sameAge(Person p): compara fechas de nacimiento de una persona con otra, devolviendo
    //true en caso de que hayan nacido el mismo año y false en caso contrario.
    public boolean sameAge(Person p){
        return this.getAge()== p.getAge();
    }
    
    //boolean compareWith(Person p): devuelve true si tienen exactamente la misma edad, nombre y apellido. 
    public boolean compareWith (Person p){
        return name.equals(p.name) && surname.equals(p.surname) && sameAge(p);
    }
}
