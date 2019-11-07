package lesson2810;

import lesson2410.Car;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dogovor dogovor = new Dogovor("Alex","Текст родительского договора",
                new Date(System.currentTimeMillis()));
        dogovor.printInfo();
        Dogovor dogovor1 = new CompanyDogovor("Alex","Текст родительского договора",123,
                new Date(System.currentTimeMillis()),"12345","345346");
        dogovor1.printInfo();
        System.out.println(dogovor1 instanceof CompanyDogovor);
    }
}
