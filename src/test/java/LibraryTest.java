import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Sarah's Library", 4);
        book = new Book("War & Peace", "Classic");
    }

    @Test
    public void countBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cannotAddBookLibraryFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4,library.countBooks());
    }

    @Test

    public void bookCanBeBorrowed(){
        library.addBook(book);
        Book result = library.removeBook();
        assertNotNull(result);

    }



}
