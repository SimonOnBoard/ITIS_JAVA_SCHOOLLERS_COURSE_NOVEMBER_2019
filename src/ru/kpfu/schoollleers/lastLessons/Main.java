package ru.kpfu.schoollleers.lastLessons;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        byte a = 100;
        byte b = 120;
        switch (a){
            case 100:
                System.out.println("a = 100");
                break;
            default:
                System.out.println("default case");
                break;
        }

//        while(a >= 95){
//            System.out.println("Hello");
//            a--;
//        }
//        for (int i = 3;i > 0; i--) {
//            System.out.println(i);
//        }
        int kamila[];
        kamila = new int[10];
        Random random = new Random();
        for(int i = 0; i < kamila.length;i++){
            kamila[i] = random.nextInt();
        }
        float array1[] = new float[100];
        double array2[] = new double[200];
        for(int i = 0; i < array1.length;i++){
            array1[i] = random.nextFloat();
        }
        Arrays.sort(kamila);
        //printArray(kamila);
        int ruslan[] = new int[5];
        ruslan = kamila;
        //printArray1(ruslan);
        System.out.println(Arrays.toString(kamila));
        int n = 8;
        double exampleInicialize[][] = new double[n][n];
        int counter = 0;
        for(int i = 0;i < n;i++){
            for(int i1 = 0;i1 < n;i1++){
                exampleInicialize[i][i1] =
                        (double) counter;
                counter++;
            }
        }
        for(int i = 0;i < n;i++){
            for(int i1 = 0;i1 < n;i1++){
                System.out.print(exampleInicialize[i][i1] + " ");
            }
            System.out.println();
        }
        int array3[] = new int[5];
        int x = 5;
        init(x);
        System.out.println(x);
        System.out.println(Arrays.toString(array3));
    }
    public static void init(int x){
        x += 5;
        System.out.println(x);
    }
    public static void printArray(int[] ildar){
        for(int i = 0; i < ildar.length; i++){
            System.out.println(ildar[i]);
        }
    }

    public static void printArray1(int[] Albert){
        for(int i: Albert){
            System.out.println(i);
        }
    }
}
