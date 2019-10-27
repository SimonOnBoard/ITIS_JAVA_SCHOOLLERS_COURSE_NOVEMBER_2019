package ru.kpfu.schoollleers.lastLessons;

import java.util.Scanner;

public class Calculator {
    public static Scanner scanner;
    final double p = (double) 3.14;
    public static void main(String[] args){
        hello();
        scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Введите по одной переменные");
        a = scanner.nextInt();
        b = scanner.nextInt();
        char c;
        c = scanner.next().charAt(0);
        int result = -1;
        float result1 = (float)0;
        boolean flag = false;
        if(c == '+'){
            result = plus(a,b);
            if(c=='+'){
                System.out.println("hello");
            }
        }
        else if(c == '-'){
            result = minus(a,b);
        }
        else if(c == '*'){
            result = multiple(a,b);
        }
        else if(c == '/'){
            result1 = div(a,b);
            flag = true;
        }

        //напечатать ответ
        if(flag == true)
        {
            System.out.println(result1);
        }
        else{
            System.out.println(result);
        }
    }
    public static void hello(){
        System.out.println("Привет ребята как дела");
    }
    private static float div(int a, int b) {
        float k = a / b;
        return k;
    }

    private static int multiple(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int plus(int a, int b) {
        return a + b;
    }

}
