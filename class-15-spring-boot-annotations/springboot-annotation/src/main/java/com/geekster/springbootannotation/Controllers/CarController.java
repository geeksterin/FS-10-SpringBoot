package com.geekster.springbootannotation.Controllers;

import com.geekster.springbootannotation.MyObjects.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    @Qualifier("mainak")
    Car c;
    
    @GetMapping("color")
    public String getCarColor()
    {
        return c.getColor();
    }


}
