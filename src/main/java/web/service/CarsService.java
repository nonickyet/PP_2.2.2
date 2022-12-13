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

    public static String getCarsByCount(ModelMap model, int count) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count && i < 5; i++) {
            result.add(web.controller.CarsController.getCars().get(i));
        }
        model.addAttribute("cars", result);
        return "cars";
    }
}
