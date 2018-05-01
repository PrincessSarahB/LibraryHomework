import org.junit.Before;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before

    public void before(){
        borrower = new Borrower("Sarah");
        book = new Book();
        library = new Library("Sarah's Library", 4);

    }

}
