package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count_cars, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMV", 111, 1));
        cars.add(new Car("Mercedes", 222, 2));
        cars.add(new Car("Toyota", 333, 3));
        cars.add(new Car("Nissan", 444, 4));
        cars.add(new Car("Lada", 555, 5));
        if (count_cars < 1 || count_cars > 4) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", cars.stream().limit(count_cars).collect(Collectors.toList()));
        }
        return "cars";

    }


}
