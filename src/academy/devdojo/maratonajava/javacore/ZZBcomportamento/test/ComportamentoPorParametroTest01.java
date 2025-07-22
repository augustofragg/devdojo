package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));

    public static void main(String[] args) {

        System.out.println(filterCarByColor(cars,"green"));
        System.out.println(filterCarByColor(cars,"red"));

        System.out.println(filterCarByYearBefore(cars,2020));
        System.out.println(filterCarByYearBefore(cars,2015));

    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filterCars = new ArrayList<>();

        for (Car car : cars) {
            if(car.getColor().equalsIgnoreCase(color)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars,int year) {
        List<Car> filterCars = new ArrayList<>();

        for (Car car : cars) {
            if(car.getYear() < year) {
                filterCars.add(car);
            }
        }

        return filterCars;
    }


}
