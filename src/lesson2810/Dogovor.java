package lesson2810;

import java.sql.Date;

public class Dogovor {
    protected String owner;
    String text;
    protected int cost;
    Date date;

    public Dogovor(String owner, String text, int cost, Date date) {
        this.owner = owner;
        this.text = text;
        this.cost = cost;
        this.date = date;
    }

    public Dogovor(String owner, String text, Date date) {
        this.owner = owner;
        this.text = text;
        this.date = date;
    }
    public void printInfo(){
        System.out.println(this.text +  " " + this.cost);
    }
}
