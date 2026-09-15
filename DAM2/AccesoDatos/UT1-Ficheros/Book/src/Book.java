public class Book {

    private String nombre;
    private String ISBN;

    public Book(String nombre, String iSBN) {
        this.nombre = nombre;
        ISBN = iSBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

}
