package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String listsCar (@RequestParam(value = "value", defaultValue = "5")int numberCars,
                            Model model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("toyota",200,"black"));
        listCar.add(new Car("BMW",250,"white"));
        listCar.add(new Car("Lada",150,"silver"));
        listCar.add(new Car("Nissan",215,"red"));
        listCar.add(new Car("Audi",280,"gold"));
        listCar = CarService.carList(listCar,numberCars);
        model.addAttribute("list",listCar);
        return "cars";
    }
}
