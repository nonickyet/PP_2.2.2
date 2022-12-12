package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private static final List<Car> cars = createCar();

    private static List<Car> createCar() {
        List<Car> carsBuff = new ArrayList<>();
        carsBuff.add(new Car("test1", 249, 1600));
        carsBuff.add(new Car("test2", 249, 1600));
        carsBuff.add(new Car("test3", 249, 1600));
        carsBuff.add(new Car("test4", 249, 1600));
        carsBuff.add(new Car("test5", 249, 1600));
        return carsBuff;
    }

    public static List<Car> getCars() {
        return cars;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        CarsService.getCars(model, count);
        return "cars";
    }
}
