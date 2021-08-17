package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDAO implements CarIntDAO {

    @Override
    public List<Car> carsList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("toyota",200,"black"));
        carList.add(new Car("BMW",250,"white"));
        carList.add(new Car("Lada",150,"silver"));
        carList.add(new Car("Nissan",215,"red"));
        carList.add(new Car("Audi",280,"gold"));
        return carList;
    }

    @Override
    public List<Car> filterCar(List<Car> cars, int value) {
        if(value < 0) {
            return null;
        }
        if(value == 0 ||value >= 5 ) {
            return cars;
        }
        return cars.stream().limit(value).collect(Collectors.toList());
    }
}
