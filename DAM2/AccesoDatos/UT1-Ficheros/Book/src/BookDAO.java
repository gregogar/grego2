import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookDAO {
    
    public String ruta;
    BookDAO(String ruta)
    {
        this.ruta = ruta;
    }

    // Crear
    
    public void saveBook(Book b) throws IOException
    {
        File f = new File(this.ruta);
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\n" + b.getISBN() + ";" + b.getNombre());
        bw.close();
        fw.close();
        System.out.println(" =================================== ");
        System.out.println(" Libro añadido correctamente :) ");
        System.out.println(" =================================== ");
    }



    // Read



    // Update



    // Delete

}
