public class Car_info extends Vehicle {

    String Car_type;
    int Fuel_Capacity;

    public Car_info(String manufacturer,int M_Year,String Model,String Fuel_Type,String car_type,String NumberPlate, int fuel_Capacity)
    {
        super(manufacturer,M_Year,Model,Fuel_Type,NumberPlate);
        Car_type = car_type;
        Fuel_Capacity = fuel_Capacity;
    }

    public Car_info() {

    }


    public void Speed()
    {
        System.out.println("Travels at 200 Miles per Hour");
    }
    @Override
    public  void Weight()
    {
        System.out.println("A car weighs about 1000kg");
    }
}
