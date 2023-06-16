package com.geekster.springbootannotation.Controllers;

import com.geekster.springbootannotation.MyObjects.Car;
import com.geekster.springbootannotation.MyObjects.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    @Qualifier("blue")
    Car c;

    @GetMapping("color")
    public String getCarColor()
    {
        return c.getColor();
    }

    @GetMapping("tree")
    public String getSomething()
    {
        return "Mainak's testing API";
    }

    @PostMapping("test")
    public void testControllerAnnotation()
    {
        System.out.println("testing api with @Controller tag");
    }

    @GetMapping("test")
    public void testControllerAnnotationdiff()
    {
        System.out.println("testing api with @Controller tag-different line");
    }

    //understand path variable :
    @PostMapping("testVariables/{id}")
    public void testPathVariable(@PathVariable int id)
    {
        System.out.println("The number passed is :" + id);
    }

    @PostMapping("testVariables/{id1}/mainak/{id2}")
    public void testPathVariables(@PathVariable int id1, @PathVariable String id2)
    {
        System.out.println("The number passed is :" + id1 + " and " + id2 );
    }

    @DeleteMapping("my/personal/details")
    public void testQueryParams(@RequestParam String name, @RequestParam int age)
    {
        System.out.println("The name and age are :" + name + " and " + age );
    }

    @PutMapping("test/both/{name}")
    public String testBothWays(@PathVariable String name,@RequestParam int age)
    {
        return "The name and age are :" + name + " and " + age;
    }

    //todo : homework path variable second and request param first

    //pass whole objects as parameter

    @PostMapping("testing/parameters/object")
    public void printStudent(@RequestBody Student s)
    {
        System.out.println(s);
    }


}
