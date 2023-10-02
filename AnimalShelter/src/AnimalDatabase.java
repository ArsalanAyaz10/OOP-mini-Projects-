import java.util.ArrayList;

public class AnimalDatabase {
    public ArrayList<Animal> animals = new ArrayList<>();


    public void add(Animal animal){
        animals.add(animal);
    }


    public Animal searchAnimal(String name){
        for (Animal a: animals) {
            if(a.equals(name)){
                return a;
            }
        }
        return null;
    }

}
