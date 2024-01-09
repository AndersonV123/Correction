class GeneroMusical {
    private String nombre;

    // Constructor
    public GeneroMusical(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método personalizado
    public void describirGenero() {
        System.out.println("Género musical: " + nombre);
    }
}