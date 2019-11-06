package lesson2810;

import java.sql.Date;

public class CompanyDogovor extends Dogovor {

    private String INN;
    private String OGRN;

    public CompanyDogovor(String owner, String text, int cost, Date date, String INN, String OGRN) {
        super(owner, text, cost, date);
        this.INN = INN;
        this.OGRN = OGRN;
    }

    @Override
    public void printInfo(){
        System.out.println(this.INN + " " +  this.OGRN);
    }


    void sendMessage(){
        //какая-то логика своя
        cost = cost + 5;
        System.out.println("I send message to Company");
    }
}
