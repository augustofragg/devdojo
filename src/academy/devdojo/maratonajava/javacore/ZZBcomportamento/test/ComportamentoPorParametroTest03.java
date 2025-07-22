package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));

    public static void main(String[] args) {


        List<Car> greenCars = filter(cars,(car) -> car.getColor().equalsIgnoreCase("green"));
        List<Car> redCars = filter(cars,(car) -> car.getColor().equalsIgnoreCase("red"));
        List<Car> yearBeforeCars = filter(cars,(car) -> car.getYear() < 2015);
        System.out.println(redCars);
        System.out.println(greenCars);
        System.out.println(yearBeforeCars);

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> listFilter = new ArrayList<>();

        for (T t : list) {
            if(predicate.test(t)) {
                listFilter.add(t);
            }
        }

        return listFilter;
    }

}
