package lesson2810;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Dogovor dogovor = new Dogovor("Alex","Текст родительского договора",
                new Date(System.currentTimeMillis()));
        dogovor.printInfo();
        CompanyDogovor dogovor1 = new CompanyDogovor("Alex","Текст родительского договора",123,
                new Date(System.currentTimeMillis()),"12345","345346");
        dogovor1.printInfo();
    }
}
