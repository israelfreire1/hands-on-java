import biblioteca.Author;
import biblioteca.Book;
import biblioteca.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Author author1 = new Author("Platão",1);
        Author author2 = new Author("Ariano Suassuna", 2);

        library.registerAuthor(author1);
        library.registerAuthor(author2);

       // Book book1 = new Book(1 , "Apologia de Sócrates",  author1, );
       // Book book2 = new Book(2, "Auto da compadecida", author2, );

        library.searchAuthorById(1L);
    }
}