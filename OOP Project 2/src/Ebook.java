class Ebook extends Book {
    private String format;

    public Ebook(String title, String author, String genre, String format) {
        super(title, author, genre); // Call the superclass constructor
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Format: " + format;
    }
}