package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.List;

@Controller
public class CarsController {
    private static final List<Car> cars = CarsService.getCars();

    public static List<Car> getCars() {
        return cars;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        CarsService.getCarsByCount(model, count);
        return "cars";
    }
}
