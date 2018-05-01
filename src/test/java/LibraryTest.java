import org.junit.Before;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Sarah's Library");
        book = new Book();
    }
}
