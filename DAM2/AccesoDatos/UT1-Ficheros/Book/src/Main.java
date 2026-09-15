import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BookDAO dao = new BookDAO("AccesoDatos/UT1-Ficheros/Book/src/books.txt");
        boolean ok = true;
        while (ok) {
            System.out.println("=====================");
            System.out.println("(C)rud Book");
            System.out.println("(R)ead Book");
            System.out.println("(U)pdate Book");
            System.out.println("(D)elete Book)");
            System.out.println("=====================");
            System.out.println("(S)alir");
            System.out.println("=====================");
            String option = sc.nextLine().toUpperCase();

            switch (option) {
                case "C":
                    System.out.println(" Introduce el nombre del libro: ");
                    String name = sc.nextLine();
                    System.out.println(" Introduce el ISBN del libro: ");
                    String ISBN = sc.nextLine();
                    Book b = new Book(name, ISBN);
                    dao.saveBook(b);
                    break;
                case "R":

                    break;
                case "U":

                    break;
                case "D":

                    break;
                case "S":
                    System.out.println(" CHAO PESCAO");
                    ok = false;
                    break;
                default:
                    System.out.println(" Por favor introduce una opcion válida");
                    break;
            }
        }
    }
}