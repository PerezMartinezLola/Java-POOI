
# POO I: Creación de Objetos en Java
![Java POO-I](https://cdn.openwebinars.net/media/featured_images/poo-java-interfaces.webp)

La Programación Orientada a Objetos (POO) es un paradigma de programación que permite modelar problemas del mundo real mediante clases y objetos. Java es un lenguaje fuertemente basado en este enfoque, lo que facilita la reutilización de código y la organización de programas complejos.


En la POO, una clase es una plantilla o modelo que define las características y comportamientos que tendrán los objetos creados a partir de ella.

Por otro lado, un objeto es una instancia de una clase, es decir, una entidad concreta que sigue el modelo definido por la clase. Cada objeto tiene sus propios valores para las características definidas en la clase y puede ejecutar sus comportamientos.

- Características de una clase:
    - Define atributos, que representan las características o propiedades de los objetos.
    - Contiene métodos, que determinan las acciones o comportamientos que los objetos pueden realizar.
    - Puede servir como base para crear múltiples objetos con características similares.

- Características de un objeto:
    - Tiene valores específicos para los atributos definidos en la clase.
    - Puede ejecutar los métodos definidos en la clase.
    - Es una representación concreta de la estructura definida en la clase.

## ¿Qué encontrarás en este repositorio?

Este repositorio está diseñado para introducir los conceptos fundamentales de la creación de objetos en Java. Aprenderás:

- Qué son **clases** y cómo se definen.
- Cómo crear **objetos** a partir de una clase.
- Uso de **atributos** y su modificación dentro de un objeto.
- La importancia de la **POO** para estructurar programas de manera más organizada y modular.

## Requisitos

Para ejecutar los ejemplos de este repositorio en tu equipo, necesitarás:
- [Java 8 o superior instalado. JDK 8 (Java SE Development Kit 8)](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
- [Apache NetBeans (versión compatible con Java 8)](https://netbeans.apache.org/front/main/download/index.html)

#### Ejemplo de lo que vas a encontrar:
Este es un ejemplo básico de una clase PostIt, que representa una nota adhesiva con atributos como alto, ancho, color y contenido.

```java
   package misprimerasclases;

public class PostIt {
    int alto;
    int ancho;
    String color;
    String contenido;
    
    public static void main(String[] args) {
        PostIt p1 = new PostIt();
        System.out.printf("Post-It %s de %dx%d en el que pone: %s%n", p1.color, p1.alto, p1.ancho, p1.contenido);
                
        p1.alto = 70;
        p1.ancho = 70;
        p1.color = "amarillo";
        p1.contenido = "A";
        
        System.out.printf("Post-It %s de %dx%d en el que pone: %s%n", p1.color, p1.alto, p1.ancho, p1.contenido);
    }
}
```

***
#### Recursos adicionales:
- [Documentación oficial de Java orientada a objetos](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Codegym - Conceptos de programación orientada a objetos en Java](https://codegym.cc/es/groups/posts/es.76.conceptos-de-programacion-orientada-a-objetos-en-java)
- [Curso Java. POO I](https://www.youtube.com/watch?v=XmUz5WJmJVU&t=488s&ab_channel=pildorasinformaticas)
