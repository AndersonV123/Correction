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


