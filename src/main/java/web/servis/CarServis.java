package web.servis;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServis {
    private List<Car> cars = Arrays.asList(
    new Car("Fiat","Red",2020),
    new Car("BMW","White",2019),
    new Car("Audi","Black",2018),
    new Car("Kia","Blue",2021),
    new Car("Honda","Yellow",2022)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
