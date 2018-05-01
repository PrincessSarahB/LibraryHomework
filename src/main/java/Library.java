import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int countBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
    }

}
