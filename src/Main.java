public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        GeneroMusical genero = new GeneroMusical("Música Latina");
        Latina subGenero = new Latina("Música Latina", "Cumbia");
        Cumbia subSubGenero = new Cumbia("Música Latina", "Cumbia", "Cumbia Villera");

        // Almacenamiento en un array
        GeneroMusical[] listaGeneros = { genero, subGenero, subSubGenero };

        // Acceso a los objetos y llamada a métodos
        for (GeneroMusical elemento : listaGeneros) {
            if (elemento instanceof GeneroMusical) {
                elemento.describirGenero();
            }
            if (elemento instanceof Latina) {
                ((Latina) elemento).describirSubGenero();
            }
            if (elemento instanceof Cumbia) {
                ((Cumbia) elemento).describirSubSubGenero();
            }
        }
    }
}
