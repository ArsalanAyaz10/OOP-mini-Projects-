public class Book extends Object {
    //class book extend default parent class Object

    private String B_Name;
    private String B_Author;
    private String B_SNO;
    private int Chap;
    private int Time;
    private boolean B_status;
    private String Summary;


//Book Class Constructor
    public Book(String name, String author, String serialNUmber){
        this.B_Author = author;
        this.B_Name = name;
        this.B_SNO = serialNUmber;
        this.Chap = 0;
        this.Time = 0;
        this.Summary = "";
        this.B_status = false;
    }
// Getter & Setter for above variables
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

    public String getB_SNO() {
        return B_SNO;
    }

    public void setB_SNO(String b_SNO) {
        B_SNO = b_SNO;
    }

    public int getChap() {
        return Chap;
    }

    public void setChap(int chap) {
        Chap = chap;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        this.Time = time;
    }

    public boolean isB_status() {
        return B_status;
    }

    public void setB_status(boolean b_status) {
        B_status = b_status;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

// Getter Setter Ends here

    // updates TIme,Summary,number of chapters and indicator for completion
    public void UpdateTime(int timeRead){
        Time += timeRead;
    }

    public void updateSummary(String todaySummary) {
        Summary += todaySummary;
    }

    public void UpdateChapter(int todayChapter){
        Chap += todayChapter;
    }
    public void markCompleted() {
         B_status= true;
    }

}
