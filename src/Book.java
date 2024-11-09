import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Book {
    String title, author, borrowerName;
    int isbn;
    Boolean availability;

    Book(String title, String author, String borrowerName, int isbn, boolean availability) {
        this.title = title;
        this.author = author;
        this.borrowerName = borrowerName;
        this.isbn = isbn;
        this.availability = availability;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrower Name: " + borrowerName);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + availability);
    }

    public void borrowBook(String title, String name) {
        if (this.availability == true) {
            if (this.title == title) {
                this.availability = false;
                this.borrowerName = name;
                System.out.println("Book is Borrowed");
            } else
                System.out.println("This book is not available");
        } else {
            System.out.println("Book borrowed by " + this.borrowerName);
            return;
        }
    }


    public void returnBook(String title) {
        if (this.availability == false) {
            this.availability = true;
            this.borrowerName = "N/A";
            System.out.println("Book is Returned");
        } else {
            System.out.println("This book is not Borrowed");
        }
    }

    //ArrayList <Book> books = new ArrayList<>();

    /*//BufferedReader br = new BufferedReader(new FileReader(filePath)
    public static void borrow (String filePath, String borrowTitle){
        BufferedReader br = new BufferedReader(new FileReader(filePath);
        }
    }*/
}
