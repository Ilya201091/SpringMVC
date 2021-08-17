package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carList(List<Car> cars,int value) {
        if(value == 0 || value > 5) {
            return cars;
        }
        return cars.stream().limit(value).collect(Collectors.toList());
    }
}
