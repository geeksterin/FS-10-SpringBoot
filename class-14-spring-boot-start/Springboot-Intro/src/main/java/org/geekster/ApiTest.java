package org.geekster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

    String name = "Mainak";

    @Autowired
    Car c ;
    @GetMapping("name")
    public String getName()
    {

        //return name
        return c.getColour();

    }

    @PutMapping("name")
    public void clearName()
    {
        name = "";
    }

}
