package com.geekster.springbootannotation.Controllers;

import com.geekster.springbootannotation.MyObjects.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CarController {

    @Autowired
    @Qualifier("blue")
    Car c;

    @GetMapping("color")
    public String getCarColor()
    {
        return c.getColor();
    }

    @ResponseBody
    @GetMapping("tree")
    public String getSomething()
    {
        return "Mainak's testing API";
    }

    @GetMapping("test")
    public void testControllerAnnotation()
    {
        System.out.println("testing api with @Controller tag");
    }


}
