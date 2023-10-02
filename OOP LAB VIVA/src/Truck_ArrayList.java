import java.util.ArrayList;
import java.util.List;
public class Truck_ArrayList {

    ArrayList<Truck_info> List = new ArrayList<>();
 public void ADD(Truck_info TRUCK)
 {
     List.add(TRUCK);
 }
    public void remove(Truck_info T1)
    {
        List.remove(T1);
    }

    public Truck_info GetByNumplate(String numplate)
    {
        for (Truck_info TRUCK:List)
        {
            if (TRUCK.getNumplate()== numplate)
            {
                return TRUCK;
            }
        }
        return new Truck_info();
    }






















}
