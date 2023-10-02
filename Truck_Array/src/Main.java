import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String args[])
    {
        TrucksDatabase Truck_Data = new TrucksDatabase();
        Truck_Info T1 = new Truck_Info();
        Scanner Scan = new Scanner(System.in);
//
//        System.out.println("Enter Make for Truck");
//        T1.setMake(Scan.nextLine());
//
//        System.out.println("Enter Model for Truck");
//        T1.setModel(Scan.nextLine());
//
//        System.out.println("Enter Number Plate for Truck");
//        T1.setNumPlate(Scan.nextLine());
//
//        System.out.println("Enter model year for Truck");
//        T1.setM_Year(Scan.nextInt());

        T1.setMake("Telsa");
        T1.setModel("2023");
        T1.setNumPlate("Cyber-2521");

        Truck_Data.add(T1);

        Truck_Info T2 = new Truck_Info();

        T2.setMake("Shehzore");
        T2.setModel("1995");
        T2.setNumPlate("ABC-2501");

        Truck_Data.add(T2);

        Truck_Data.removeElement(T1);

        System.out.println(T1.getModel());

//        System.out.println(Truck_Data.getByNumPlate("Cyber-2521").getModel());

    }
}