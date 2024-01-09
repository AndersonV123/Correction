class Cumbia extends Latina {
    private String subSubNombre;

    // Constructor
    public Cumbia(String nombre, String subNombre, String subSubNombre) {
        super(nombre, subNombre);
        this.subSubNombre = subSubNombre;
    }

    // Getter y Setter
    public String getSubSubNombre() {
        return subSubNombre;
    }

    public void setSubSubNombre(String subSubNombre) {
        this.subSubNombre = subSubNombre;
    }

    // Método personalizado
    public void describirSubSubGenero() {
        System.out.println("Subsubgénero musical: " + getSubSubNombre() + " del subgénero " + getSubNombre() + " del género " + getNombre());
    }
}