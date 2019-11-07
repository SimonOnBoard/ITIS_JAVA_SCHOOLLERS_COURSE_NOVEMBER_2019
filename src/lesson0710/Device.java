package lesson0710;

public interface Device
{
    void on();
    String k = "Hello";
    default void print(String k){
        System.out.println(k);
    }
}
