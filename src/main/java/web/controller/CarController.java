package web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;


@Controller
public class CarController {

    private final Service carService;

    public CarController(Service carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count_cars, Model model) {
        model.addAttribute("cars", carService.getCars(count_cars));
        return ("cars");

    }


}
