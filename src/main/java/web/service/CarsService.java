package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsService {
    public static String getCars(ModelMap model, int count) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count && i < 5; i++) {
            result.add(web.controller.CarsController.getCars().get(i));
        }
        model.addAttribute("cars", result);
        return "cars";
    }
}
