package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars;
    static {
        cars = List.of(new Car("BMW", 2000, "black"),
                new Car("Mercedes", 2001, "blue"),
                new Car("Volvo", 2002, "red"),
                new Car("Audi", 2003, "green"),
                new Car("Toyota", 2004, "yellow"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
