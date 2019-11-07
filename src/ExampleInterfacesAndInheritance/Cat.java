package ExampleInterfacesAndInheritance;

public class Cat extends Animal {
    private String color;
    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public Cat(String name){
        super(name);
        this.color = "Black";
    }

    @Override
    public void saySomething() {
        System.out.println(this.color +" " + this.name);
    }
}
