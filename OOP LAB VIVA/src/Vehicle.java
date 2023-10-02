public abstract class Vehicle {


    public String Manufacturer;
    public int M_Year;
    public String Model;
    public String Fuel_Type;
    public String NumberPlate;

    public Vehicle(String manufacturer, int mYear, String model, String fuelType, String numberPlate) {
    }

    public Vehicle() {}

    public abstract void Speed();
    public void Weight()
    {
        System.out.println("Vehicles have a variety of weights");
    }

    public void information(String Manufacturer,int M_Year)
    {
        this.Manufacturer=Manufacturer;
        this.M_Year=M_Year;
        System.out.println("The Vehicle was manufactured by"+ Manufacturer + "In the Year" + M_Year);
    }
    public void information(String Fuel_Type,String numplate)
    {
        this.NumberPlate=numplate;
        this.Fuel_Type=Fuel_Type;
        System.out.println("The vehicle Fuel Type is " + Fuel_Type+ "and its Number Plate is :" + numplate);
    }
}
