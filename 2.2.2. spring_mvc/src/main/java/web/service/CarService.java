package web.service;

import web.DAO.CarDAO;
import web.DAO.CarIntDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private CarDAO carIntDAO = new CarDAO();

    public List<Car> listCar() {
        return carIntDAO.carsList();
    }


    public List<Car> filter(List<Car> cars, int value) {
       return carIntDAO.filterCar(cars,value);
    }

}
