import java.util.ArrayList;
public class Car_ArrayList {
        ArrayList<Car_info> list2 = new ArrayList<>();
        public void ADD(Car_info C1)
        {
            list2.add(C1);
        }
        public void remove(Car_info C1)
        {
            list2.remove(C1);
        }

        public Car_info GetByType(String car_type)
        {
            for (Car_info C1:list2)
            {
                if (C1.Car_type== car_type)
                {
                    return C1;
                }
            }
            return new Car_info();
        }

    }
