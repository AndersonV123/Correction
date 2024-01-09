class Latina extends GeneroMusical {
    private String subNombre;

    // Constructor
    public Latina(String nombre, String subNombre) {
        super(nombre);
        this.subNombre = subNombre;
    }

    // Getter y Setter
    public String getSubNombre() {
        return subNombre;
    }

    public void setSubNombre(String subNombre) {
        this.subNombre = subNombre;
    }

    // Método personalizado
    public void describirSubGenero() {
        System.out.println("Subgénero musical: " + getSubNombre() + " del género " + getNombre());
    }
}