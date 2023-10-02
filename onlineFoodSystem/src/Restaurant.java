public class Restaurant {

    private int RestaurantID;
    private String RestaurantName;
    private String Address;
    private  int R_PhoneNumber;

    public int getRestaurantID(){
        return this.RestaurantID;
    }
    public int setRestaurantID(int R_id)
    {
       this.RestaurantID=R_id;
       return R_id;
    }

    public String getRestaurantName()
    {
        return this.RestaurantName;
    }
    public String  setRestaurantName(String R_name)
    {
        this.RestaurantName= R_name;
        return R_name;
    }

    public String getAddress()
    {
        return this.Address;
    }
    public String setAddress(String address)
    {
        this.Address= address;
        return address;
    }

    public int getR_PhoneNumber()
    {
        return this.R_PhoneNumber;
    }

    public int setR_PhoneNumber(int Pnumber)
    {
        this.R_PhoneNumber= Pnumber;
        return Pnumber;
    }
}
