public class Truck_info extends Vehicle {

    private String Make;
    private String model;
    private int year;
    private String Numplate;

    public Truck_info(String manufacturer, int mYear, String model, String fuelType, String numberPlate) {
        super(manufacturer, mYear, model, fuelType, numberPlate);
    }

    public Truck_info() {
        super();
    }

    public void Speed()
    {
        System.out.println("Trucks travel at low speeds");
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumplate() {
        return Numplate;
    }

    public void setNumplate(String numplate) {
        Numplate = numplate;
    }


}
