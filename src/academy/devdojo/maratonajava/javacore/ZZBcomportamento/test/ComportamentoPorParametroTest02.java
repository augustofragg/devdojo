package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class carroFiltro implements CarPredicate {
    @Override
    public boolean test(Car car) {
        return car.getColor().equalsIgnoreCase("green");
    }
}

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));

    public static void main(String[] args) {

        //Exemplo 1 Predicate com classe anônima
        List<Car> greenCars = filter(cars,new Predicate<Car>(){
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        });
        System.out.println(greenCars);

        //Exemplo 2 Predicate com classe
        greenCars = filter(cars,(car) -> car.getColor().equalsIgnoreCase("green"));
        List<Car> redCars = filter(cars,(car) -> car.getColor().equalsIgnoreCase("red"));
        List<Car> yearBeforeCars = filter(cars,(car) -> car.getYear() < 2015);
        System.out.println(redCars);
        System.out.println(greenCars);
        System.out.println(yearBeforeCars);

    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filterCars = new ArrayList<>();

        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

}
