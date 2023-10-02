import java.util.ArrayList;

public class TrucksDatabase {

   public int Choose;

    ArrayList<Truck_Info> Trucks = new ArrayList<>();

    public void add(Truck_Info T1)
    {
        Trucks.add(T1);
        System.out.println("Data Added to Inventory!");
    }

    public  void clearDataAll()
    {
        Trucks.clear();

    }

    public  void removeElement(Truck_Info T1)
    {
        Trucks.remove(T1);
    }
    public Truck_Info getByNumPlate(String numplate)
    {
        for (Truck_Info T1: Trucks) {
            if (T1.getNumPlate() == numplate)
            {
                return T1;
            }

        }
        return new Truck_Info();
    }

}