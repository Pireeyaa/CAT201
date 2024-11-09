import java.util.ArrayList;

public class Library {
    ArrayList <Book> books;

    public Library (){
        books = new ArrayList<>();
    }

    public void addBook (String title, String author, String borrowerName, int isbn, boolean availability) {
        books.add(new Book(title, author, borrowerName, isbn, availability));
    }
    public void displayBook() {
        for(int i = 0; i < books.size(); i++){
            books.get(i).displayBook();
        }
    }

    public void searchbyTitle(String title){
        boolean found = false;
        for(int i = 0; i < books.size(); i++){
            if(title.equals(books.get(i).title)){
                found = true;
                books.get(i).displayBook();

            }
        }
        if(found == false)
            System.out.println("Book not Found in Library");
    }

    public void searchbyAuthor(String author){
        boolean found = false;
        for(int i = 0; i < books.size(); i++){
            if(author.equals(books.get(i).author)){
                found = true;
                books.get(i).displayBook();
            }
        }
        if(found == false)
            System.out.println("Book not Found in Library");
    }

    public void searchbyISBN(int isbn){
        boolean found = false;
        for(int i = 0; i < books.size(); i++){
            if(isbn == books.get(i).isbn){
                found = true;
                books.get(i).displayBook();
            }
        }
        if(found == false)
            System.out.println("Book not Found in Library");
    }
}
