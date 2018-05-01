import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Sarah's Library");
        book = new Book();
    }

    @Test
    public void countBooks(){
        assertEquals(0, library.countBooks());
    }
}
