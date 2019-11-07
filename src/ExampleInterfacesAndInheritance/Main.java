package ExampleInterfacesAndInheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Kitty"));
        animals.add(new Dog("BBBBBB"));

        for(Animal animal: animals){
            animal.saySomething();
        }
    }
}
