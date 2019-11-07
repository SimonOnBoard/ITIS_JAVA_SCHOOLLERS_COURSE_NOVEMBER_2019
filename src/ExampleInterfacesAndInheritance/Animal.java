package ExampleInterfacesAndInheritance;

public class Animal implements CanSaySomenting {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void saySomething() {
        System.out.println(this.name);
    }
}
