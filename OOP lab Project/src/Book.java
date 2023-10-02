public class Book extends Object{

    private String B_Name;
    private String B_Author;
    private String Genre;
    private String SerialNo;
    private float B_Price;
    private int B_Quantity;

    public Book(String b_Name, String b_Author, String genre, String serialNo, float b_Price, int b_Quantity) {
        this.setB_Name(b_Name);
        this.setB_Author(b_Author);
        this.setGenre(genre);
        this.setSerialNo(serialNo);
        this.setB_Price(b_Price);
        this.setB_Quantity(b_Quantity);
    }

    //Getters for all the above variables

    public String getB_Name() {
        return B_Name;
    }

    public void setB_Name(String b_Name) {
        B_Name = b_Name;
    }

    public String getB_Author() {
        return B_Author;
    }

    public void setB_Author(String b_Author) {
        B_Author = b_Author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    public float getB_Price() {
        return B_Price;
    }

    public void setB_Price(float b_Price) {
        B_Price = b_Price;
    }

    public int getB_Quantity() {
        return B_Quantity;
    }

    public void setB_Quantity(int b_Quantity) {
        B_Quantity = b_Quantity;
    }

    public void UpdateQuantity(int quantity)
    {
        B_Quantity-=quantity;
    }

}
