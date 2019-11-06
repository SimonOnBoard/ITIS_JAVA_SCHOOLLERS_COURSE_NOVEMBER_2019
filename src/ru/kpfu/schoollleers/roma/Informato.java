package ru.kpfu.schoollleers.roma;

import lesson2410.Car;

import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Informato {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String command = null;
        Car car = null;
        List<Car> cars = new ArrayList<Car>();
        while (true) {
            command = scanner.nextLine();
            if (command.equals("Куплена машина")) {
                car = createCar();
                cars.add(car);
            }
            else if (command.equals("Найти машину")) {
                Car car1 = findCurrentCar(cars);
                if (car1 == null) {
                    System.out.println("Данной машины не существует");
                } else {
                    System.out.println(car.getNumber());
                    System.out.println(car.getMarkaaa());
                    System.out.println(car.getProduction());
                    System.out.println(car.getOwner());
                }
            }
        }
    }
    private static Car findCurrentCar (List < Car > cars) {
        System.out.println("Введите имя клиента");
        String string = scanner.nextLine();
        for (Car car : cars) {
            if (car.getOwner().equals(string)) {
                return car;
            }
        }
        return null;
    }

    private static Car createCar() {
        System.out.println("Введите номер");
        String number = scanner.nextLine();
        System.out.println("Введите марку");
        String markaaa = scanner.nextLine();
        System.out.println("Введите данные покупателя");
        String owner = scanner.nextLine();
        Date production = new Date(System.currentTimeMillis());
        Car car = new Car(number);
        return car;
    }


}