import java.util.Comparator;

class GenreComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getGenre().compareTo(book2.getGenre());
    }
}
