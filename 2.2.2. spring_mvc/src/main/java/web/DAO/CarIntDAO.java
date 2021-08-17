package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarIntDAO {

    List<Car> carsList();
    List<Car> filterCar(List<Car> cars, int value);
}
