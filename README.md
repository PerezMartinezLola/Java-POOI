![Java POO-I](https://cdn.openwebinars.net/media/featured_images/poo-java-interfaces.webp)
# POO I: Creación de Objetos en Java

La Programación Orientada a Objetos (POO) es un paradigma de programación que permite modelar problemas del mundo real mediante clases y objetos. Java es un lenguaje fuertemente basado en este enfoque, lo que facilita la reutilización de código y la organización de programas complejos.

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
