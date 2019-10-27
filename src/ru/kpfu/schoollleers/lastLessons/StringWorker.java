package ru.kpfu.schoollleers.lastLessons;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Scanner;

public class StringWorker {
    public static void main(String[] args) {

        //разделение строки по точке в массив строк
//        String a = new String("aaa;aa.aa;aa");
//        String[] a1 = a.split("\\.");
//        System.out.println(Arrays.toString(a1));

        //считывание строки и вывод в консоль
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//
//        System.out.println(str);

//         String s1 = new String("hello");
//        String s2 = new String("hello");
//        System.out.println(s1.equals(s2));

        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3==s4);
        System.out.println(s3=="hello");
        print111Error("haha","2nderror");
        printError("haha",true,"newError");
        boolean flag = true;
    }
    public static void print111Error(String a,String b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void printError(String a, boolean flag,String b){
        System.out.println(a);
        if(flag){
            System.out.println(b);
        }
    }
}
