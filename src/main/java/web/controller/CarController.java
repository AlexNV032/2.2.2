package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servis.CarServis;

import java.util.List;

@Controller
public class CarController {
    private CarServis carServis;

    @Autowired
    public CarController(CarServis carServis) {
        this.carServis = carServis;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = carServis.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
