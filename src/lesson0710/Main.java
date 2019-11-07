package lesson0710;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(new Cat());
        allAnimals.add(new Wolf());
        allAnimals.add(new Fox());
        allAnimals.add(new YorkshireTerrier());
        for (Animal animal : allAnimals)
        {
            animal.eat();
            animal.sleep();
        }
    }
}
