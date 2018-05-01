import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before

    public void before(){
        borrower = new Borrower("Sarah");
        book = new Book();
        library = new Library("Sarah's Library", 4);
        library.addBook(book);

    }

    @Test
    public void cancountBorrowedBooks(){
        assertEquals(0, borrower.countBorrowedBooks());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.countBorrowedBooks());
    }



}
