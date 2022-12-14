package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsService {

    private static List<Car> cars = createCar();

    public static List<Car> getCars() {
        return cars;
    }


    private static List<Car> createCar() {
        List<Car> carsBuff = new ArrayList<>();
        carsBuff.add(new Car("test1", 249, 1600));
        carsBuff.add(new Car("test2", 249, 1600));
        carsBuff.add(new Car("test3", 249, 1600));
        carsBuff.add(new Car("test4", 249, 1600));
        carsBuff.add(new Car("test5", 249, 1600));
        return carsBuff;
    }

    public static List<Car> getCarsByCount(int count) {
        if(count <= 5){
        return  cars.subList(0, count);
        }
        return cars;
    }
}
