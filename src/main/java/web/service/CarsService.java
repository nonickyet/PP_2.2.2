package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarsService {
    private List<Car> cars = new ArrayList<>();;
    public CarsService() {
        cars.add(new Car("test1", 249, 1600));
        cars.add(new Car("test2", 249, 1600));
        cars.add(new Car("test3", 249, 1600));
        cars.add(new Car("test4", 249, 1600));
        cars.add(new Car("test5", 249, 1600));
    }
    public List<Car> getCarsByCount(int count) {
        if(count <= 5){
        return  cars.subList(0, count);
        }
        return cars;
    }
}
