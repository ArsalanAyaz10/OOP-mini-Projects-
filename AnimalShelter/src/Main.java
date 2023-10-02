public class Main {
    public static void main(String[] args){


        Cat cat = new Cat();
        cat.name = "cat123";

        Lion lion = new Lion();
        lion.name = "lion123";

        AnimalDatabase db = new AnimalDatabase();

        db.add(cat);
        db.add(lion);

        Animal foundAnimal = db.searchAnimal("cat123");
        foundAnimal.makeNoise();
        System.out.println(foundAnimal.toString());


    }
}
