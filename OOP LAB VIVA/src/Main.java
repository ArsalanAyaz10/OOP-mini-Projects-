import java.util.*;
public class Main {
    public static void main(String[] args) {

        Truck_ArrayList data = new Truck_ArrayList();
        Truck_info info = new Truck_info();

        info.setNumplate("Telsa-2021F");
        info.setMake("Tesla");
        info.setYear(2019);
        info.setModel("Model Y");

        data.ADD(info);

//        System.out.println(info.getMake());
//        System.out.println(info.getYear());

        Truck_info info1 = new Truck_info();

        info1.setNumplate("T-2014D");
        info1.setMake("Honda");
        info1.setYear(2011);
        info1.setModel("Accord");


        data.ADD(info1);
//        System.out.println(data.GetByNumplate("T-2014D").getModel());
//        System.out.println(data.GetByNumplate("Telsa-2021F").getYear());
//        System.out.println(data.GetByNumplate());

        data.remove(info1);
//        System.out.println(data.GetByNumplate("T-2014D").getModel());
//        System.out.println(data.GetByNumplate("Telsa-2021F").getYear());

         String Manufacturer = "";
         int M_Year = 0;
         String Model = "";
         String Fuel_Type = "";
         String NumberPlate = "";
        String  Car_type = "";
        int Fuel_Capacity = 0;



        Car_info car = new Car_info(Manufacturer,M_Year,Model,Fuel_Type,NumberPlate,Car_type,Fuel_Capacity);
        Manufacturer= "Toyota";
        M_Year = 2015;
        Model = "Fortuner";
        Fuel_Type = "Normal";
        NumberPlate = "TO-2015T";
        Car_type = "Sedan";
        Fuel_Capacity = 40;

        Car_ArrayList car_data = new Car_ArrayList();

        car_data.ADD(car);

        String manufacturer = "0";
        int m_year = 0;
        String model = "";
        String fuel_Type = "";
        String numberPlate = "";
        String car_type = "";
        int fuel_Capacity = 0;

        Car_info car2 = new Car_info(manufacturer,m_year,model,fuel_Type,numberPlate,car_type,fuel_Capacity);

        manufacturer= "Hundai";
        m_year = 2018;
         model = "Tuscan";
         fuel_Type = "Normal";
         numberPlate = "HU-2001H";
         car_type = "SUV";
         fuel_Capacity = 42;

         car_data.ADD(car2);

        System.out.println(car_data.GetByType("SUV").Manufacturer);
        System.out.println(car_data.GetByType("Sedan").Fuel_Capacity);
        }
    }
