//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String filePath = "library.txt";
        //String borrowTitle = "Moby Dick";
        //Scanner sc = new Scanner (System.in);
        /*Book book1 = new Book("black","padma","NA",2134567,true);

        book1.displayBook();
        book1.borrowBook("black","Indran");
        book1.displayBook();
        book1.returnBook("black");
        book1.displayBook();*/

        //book1.borrow(filePath, borrowTitle);
        Library lib = new Library();
        lib.addBook("black", "padma", "NA", 2134567, true);
        lib.displayBook();
        //lib.searchbyTitle("black");
        //lib.searchbyTitle("white");
        //lib.searchbyAuthor("black");
        //lib.searchbyAuthor("padma");
        //lib.searchbyISBN("black");
        //lib.searchbyISBN(2134567);

        }
    }