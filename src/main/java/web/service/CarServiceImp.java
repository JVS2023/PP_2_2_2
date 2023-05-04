package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    Car car1 = new Car("Cherry", 3, "white");
    Car car2 = new Car("Gelly", 2, "black");
    Car car3 = new Car("UAZ", 3, "green");
    Car car4 = new Car("Lada", 2121, "blue");
    Car car5 = new Car("KIA", 5, "yellow");
    private final List<Car> carList = new ArrayList<>(List.of(car1, car2, car3, car4, car5));

    @Override
    public List<Car> getCars(int count) {
        return count >= 5 ? carList : carList.subList(0, count);
    }

}
