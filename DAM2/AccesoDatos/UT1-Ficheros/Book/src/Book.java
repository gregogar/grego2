public class Book {

    private String nombre;
    private int ISBN;

    public Book(String nombre, int iSBN) {
        this.nombre = nombre;
        ISBN = iSBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

}
