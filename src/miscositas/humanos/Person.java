package miscositas.humanos;

public class Person {

    private short yearOfBirth;
    private String name;
    private String surname;
    private boolean brokenName;
    private boolean brokenSurname;

    public void show() {
        System.out.printf("Person %s(%b) %s(%b) de %d anios.%n",
                name, brokenName, surname, brokenSurname, 2023 - yearOfBirth);
    }

    public Person(String name, String surname) {
        this((short) 1995, name, surname);
    }

    public Person(short yearOfBirth, String name, String surname) {

        //hecho por mí
        this.yearOfBirth = yearOfBirth > 2023 ? 2023 : yearOfBirth;

        if (name == null) {
            name = "";
        }

        this.brokenName = name.length() > 20;
        this.brokenSurname = surname.length() > 20;

        this.name = name.length() > 20 ? name.substring(0, 20) : name;
        /*if (name.length() > 20){
            this.name = name.substring(0, 20);
        }else{
            this.name = name;
        }*/

        if (surname == null) {
            surname = "";
        }
        this.surname = surname.length() > 20 ? surname.substring(0, 20) : surname;
        /*if (surname.length() > 20){
            this.surname = surname.substring(0, 20);
        } else{
            this.surname = surname;*/
        this.name = this.name.toUpperCase();
        this.surname = this.surname.toUpperCase();

        //hecho por Javi
        /*this.yearOfBirth = (yearOfBirth > 2023) ? 2023 : yearOfBirth;
         if(name.length() > 20) {
            name = name.substring(0, 20);
            this.brokenName = true;
        }
        
        
        if(surname.length() > 20) {
            surname = surname.substring(0, 20);
            this.brokenSurname = true;*/
    }

    public Person(Person p) {
        this.yearOfBirth = p.yearOfBirth;
        this.name = p.name;
        this.surname = p.surname;
        this.brokenName = p.brokenName;
        this.brokenSurname = p.brokenSurname;
    }
//getter y setters

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(short yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isBrokenName() {
        return brokenName;
    }

    public void setBrokenName(boolean brokenName) {
        this.brokenName = brokenName;
    }

    public boolean isBrokenSurname() {
        return brokenSurname;
    }

    public void setBrokenSurname(boolean brokenSurname) {
        this.brokenSurname = brokenSurname;
    }

//Métodos pedidos en el ejercicio
//boolean
    public boolean isBroken() {
        return this.brokenName || this.brokenSurname;
    }


    /*boolean changeName(String name, String surname): en este caso solo cambia el nombre si se cumplen las 
  siguientes condiciones (si no lo cambia devuelve false):
    1. Usar solo caracteres del alfabeto inglés en mayúsculas.
    2. Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos. 
    3. Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
    4. No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés..*/
    public boolean changeName(String name, String surname) {
        //1.Usar solo caracteres del alfabeto inglés en mayusculas.
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || name.charAt(i) == ' ') {
                return false;
            }
        }
        for (int i = 0; i < surname.length(); i++) {
            if (!(surname.charAt(i) >= 'A' && surname.charAt(i) <= 'Z') || surname.charAt(i) == ' ') {
                return false;
            }
        }
        //Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos 
        String nombreSinEspacios = name.trim();
        int contadorDeEspaciosNombre = 0;
        for (int i = 0; i < nombreSinEspacios.length(); i++) {
            if (nombreSinEspacios.charAt(i) == ' ') {
                contadorDeEspaciosNombre++;
                if (contadorDeEspaciosNombre > 1) {
                    return false;
                }
            }
        }

        String surnameSinBlancosExtremos = surname.trim();
        int contadorDeBlancosEnSurname = 0;
        for (int i = 0; i < surnameSinBlancosExtremos.length(); i++) {
            if (surnameSinBlancosExtremos.charAt(i) == ' ') {
                contadorDeBlancosEnSurname++;
                if (contadorDeBlancosEnSurname > 1) {
                    return false;
                }
            }
        }
        //Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
        if (name.length() > 20 || surname.length() > 20) {
            return false;
        }

        //No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.
        if (name.trim().equals("") || surname.trim().equals("")) {
            return false;
        }
        this.name = name;
        this.surname = surname;
        brokenName = brokenSurname = true;
        return true;
    }

    //Método diferencia edad entre personas
    public int diferenciaEdad(Person p) {
        return this.getAge() - p.getAge();
    }

    public boolean changeName(String name) {
        return this.changeName(name, this.surname);
    }

    public boolean changeSurname(String surname) {
        return this.changeName(this.name, surname);
    }

    //Metodo para calcular la edad
    public short getAge() {
        return (short) (2023 - yearOfBirth);
        //se realiza la resta que da un tipo int y luego se convierte a short
    }

    //Método para saber si dos personas tienen la misma edad
    public boolean sameAge(Person p) {
        return this.getAge() - p.getAge() == 0;
    }
    //Método para comparar nombre, apellido y edad.
    //Después de pelearla me la dio chatgpt más compacta
    public boolean compareWith (Person p){
       return this.name.equals(p.name) && this.surname.equals(p.surname)&& this.sameAge(p);
        
    
    }
}


/*     HECHO POR JAVI
       //name solo alfabelto ingles o espacios en blanco
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) == ' ')) {
                return false;//para que se salga completamente del método porque no cumple la primera condición

            }
        }
        //surname solo alfabeto inglés o espacios en blanco
        for (int i = 0; i < surname.length(); i++) {
            if (!(surname.charAt(i) >= 'A' && surname.charAt(i) <= 'Z' || surname.charAt(i) == ' ')) {
                return false;
            }
        }
        //sólo 0 o 1 espacios en blanco que no sean extremos
        String nameSinBlancosExtremos = name.trim();
        int contadorBlancosEnName = 0;
        for (int i = 0; i < nameSinBlancosExtremos.length(); i++) {
            if (nameSinBlancosExtremos.charAt(i) == ' ') {
                contadorBlancosEnName++;
                if (contadorBlancosEnName > 1) {
                    return false;
                }
            }
        }
        String surNameSinBlancosExtremos = name.trim();
        int contadorBlancosEnSurname = 0;
        for (int i = 0; i < surNameSinBlancosExtremos.length(); i++) {
            if (surNameSinBlancosExtremos.charAt(i) == ' ') {
                contadorBlancosEnSurname++;
                if (contadorBlancosEnSurname > 1) {
                    return false;
                }
            }
        }
        
        //ninguno puede ser broken después del cambio longitud 20
        
        if(name.length()> 20 || surname.length() > 20) {
            return false;
        }
       
    
        //no puede ser ninguno blanco: al menos debe haber una letra del alafabeto ingles
        //aquí se esta evitando que haya espacios en blanco por eso pones "     " si le quitas los espacios se queda "" y
        //por eso pone .equals("") para elimiar esta opción
        if(name.trim().equals("") || surname.trim().equals("")){
            return false;
        }
        
        this.name = name;
        this.surname = surname;
        brokenName = brokenSurname = false;
        return true;
    }
}
/*    

/* EXPLICACIÓN EN CLASE DE JAVI
Métodos de la clase String
    String s = "Hola";
    
    //Numero caracteres del texto (o longitud)
    //este length tiene parentesis no como en el array
    System.out.println(s.length());
    
    //nombre.length > 20
    //Numero de caracteres que tiene un texto quitando los espacios en blanco de los extremos
     System.out.println(s.trim().length());
    
    //0 ó 1 espacios en blanco que no pueden estar en los extremos
     //split cuenta los elementos como un array de lo que pongas entre parentesis
    String [] letras = s.trim().split("");
    int espaciosEnBlanco = 0;
        for(String letra: letras){
    //si la palabra es igual, si tiene las mismas letras
            if(" ".equals(letra)){
               espaciosEnBlanco++;
    }
}
        
       //"hol a " longitud 6, indices de 0 a 5 
    for(int i = 0; i < s.length; i++){
       if(s.charAt(i) >= 
}
    //No en blanco
    //Métodos
   /* .length(): contar posiciones
    .charArt(int i):
    .trim(): elimina espacios de los extremos
        
        
}*/
