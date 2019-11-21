package lesson1811;

import sun.util.resources.ro.CurrencyNames_ro_RO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();
        Node start = null;
        Node current = null;
        String command = null;
        String value = null;
        while(true){
            command = scanner.nextLine();
            if(command.equals("add")){
                value = scanner.nextLine();
                list.add(value);
            }
            else {
                start = list.getHead();
                if(start != null){
                    System.out.println(start.getValue());
                    current = start.getNext();
                    while (current != null) {
                        System.out.println(current.getValue());
                        Integer a = 5;
                        System.out.println(a.toString());
                        current = current.getNext();

                    }
                }
                else{
                    System.out.println("В списке нет ничего");
                }
            }
        }
    }
}
