package lesson0710;


public abstract class Animal
{
    String name;
    int age;
    String nameOfClass = getClass().getSimpleName();
    public void eat(){
        System.out.println(nameOfClass + ": Omnomnom");
    }
    public void sleep(){
        System.out.println(nameOfClass + ": Z-z-z-z");
    }
}