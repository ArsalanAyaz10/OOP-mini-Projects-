import java.util.ArrayList;

public class Library implements i_inventory{
    private ArrayList<Book> books_data;
    //ArrayList Won't create until object isn't create
    public Library(){
        books_data = new ArrayList<>();
    }

    //Polymorphism used here,overriding
    @Override
    public void Project_Info(){
        System.out.println("\nThis is A Personal Book Inventory Management System!!\n");
    }

//Adds book to ArrayList
    public void addBook(Book book) {
        books_data.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books_data;
    }

    //fetches book acc to index number
    public Book getBookByIndex(int index) {
        return books_data.get(index);
    }

    //calc total time
    public int getTotalTimeRead() {
        int totalTime = 0;
        for (Book book : books_data) {
            totalTime += book.getTime();
        }
        return totalTime;
    }
}
