package ru.kpfu.schoollleers.karim;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Homework {
    static Scanner Scanner;
    public static void main(String[] args) {
        Scanner  = new Scanner(System.in);
        String command = null;
        Mail mail = null;
        List<Mail> mails = new ArrayList<Mail>();
        while(true){
            command = Scanner.nextLine();
            if(command.equals("Начать")){
                mail = createMail();
                mails.add(mail);
            }
            else if(command.equals("просмотреть нахождение товара")){
                Mail mail1 = findCurrentMail(mails);
                if(mail1 == null){
                    System.out.println("Ошибка. Попробуйте еще раз");
                }
                else {
                    System.out.println(mail1.getOrderNumber());
                    System.out.println(mail1.getOwner());
                    System.out.println(mail1.getWeight());
                }
            }
            else if(command.equals("изменить")){
                changeOrdernumber(mail);
            }
        }
    }


    private static Mail findCurrentMail(List<Mail> mails) {
        System.out.println("Введи владельца");
        String string = Scanner.nextLine();
        for(Mail mail : mails){
            if(mail.getOwner().equals(string)) {
                return mail;
            }
        }
        return null;
    }

    private static void changeOrdernumber(Mail mail) {
        System.out.println("введи новое описание");
        String weight = Scanner.nextLine();
        mail.setWeight(Double.parseDouble(weight));
    }

    private static Mail createMail() {
        System.out.println("Введи номер заказа");
        String ordernumber = Scanner.nextLine();
        System.out.println("Введи имя получателя");
        String owner = Scanner.nextLine();
        Mail mail = new Mail(ordernumber,owner,23, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis() + 573745734));
        return mail;
    }
}
