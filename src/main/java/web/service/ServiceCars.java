package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class ServiceCars implements Service {
    private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("BMV", 111, 1),
            new Car("Mercedes", 222, 2),
            new Car("Toyota", 333, 3),
            new Car("Nissan", 444, 4),
            new Car("Lada", 555, 5)
    ));

    @Override
    public List<Car> getCars(int count_cars) {
        System.out.println(cars);
        return (count_cars < 1 || count_cars > 4 ? cars :
                cars.stream().limit(count_cars).collect(Collectors.toList()));

    }
}
