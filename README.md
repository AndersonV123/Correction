# Correction
NOMBRE:ANDERSON VILATUÑA
g.- Los setters y getters son métodos utilizados en programación para acceder y modificar los atributos de una clase de manera controlada, sin exponer directamente los atributos. Los setters permiten asignar un valor a un atributo, mientras que los getters devuelven el valor actual de un atributo.
public class Persona {
    private String nombre;

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }
}

// Uso de los setters y getters
public class Ejemplo {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        // Establecer el nombre utilizando el setter
        persona.setNombre("Juan");

        // Obtener el nombre utilizando el getter
        System.out.println("Nombre: " + persona.getNombre());
    }
}


h.- clonar un repositorio, traer los últimos cambios y actualizarlos en git:

1. Clonar el repositorio:
   git clone 

2. Traer los últimos cambios:
   git pull origin nombre_de_la_rama

3. Una vez realizados los cambios, añadir y confirmar los cambios:
   git add 
   git commit -m " "

4. Actualizar los cambios en el repositorio remoto:
   git push origin 
   

El try y catch en Java se utiliza para el manejo de excepciones. El código que puede generar errores se coloca dentro del bloque try, y si ocurre una excepción, se captura en el bloque catch, donde se maneja o se notifica:

public class Division {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;
        int resultado;

        try {
            // Intenta realizar la división
            resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Captura la excepción si se intenta dividir por cero
            System.out.println("Error: División por cero.");
        }
    }
}


j.- La Programación Orientada a Objetos es un paradigma de programación que se basa en el concepto de objetos, los cuales son entidades que tienen atributos y métodos. Los objetos interactúan entre sí a través de mensajes.

Los constructores son métodos especiales de una clase que se llaman automáticamente cuando se crea un objeto de esa clase. Sirven para inicializar los atributos de un objeto. Hay diferentes tipos de constructores:

Constructor por defecto No tiene parámetros y es proporcionado por Java si no se define uno. Por ejemplo:
 
  public Persona() {
      // constructor por defecto
  }
 
Constructor con parámetros recibe argumentos para inicializar los atributos al momento de la creación del objeto. Por ejemplo:
  
  public Persona(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
  }
  

Constructor copia Crea un nuevo objeto copiando los valores de otro objeto del mismo tipo.

  public Persona(Persona otraPersona) {
      this.nombre = otraPersona.nombre;
      this.edad = otraPersona.edad;
  }
  
