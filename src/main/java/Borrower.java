import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBook;

    public Borrower(String name){
        this.name = name;
        this.borrowedBook = new ArrayList<>();
    }

    public int countBorrowedBooks(){
        return this.borrowedBook.size();
    }

    public void borrowBook(Library library){
       Book bookToBorrow = library.removeBook();
       this.borrowedBook.add(bookToBorrow);
    }
}
