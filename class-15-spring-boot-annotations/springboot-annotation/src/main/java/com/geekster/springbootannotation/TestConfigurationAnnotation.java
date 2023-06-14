package com.geekster.springbootannotation;

import com.geekster.springbootannotation.MyObjects.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfigurationAnnotation {



   @Bean("blue")
    //@Bean
    public Car getCarObject1()
    {
        System.out.println("Inside bean method getCarObject1" );
        return new Car("Blue");
    }

    @Bean("red")
    //@Bean
    //@Primary
    public Car getCarObject2()
    {
        System.out.println("Inside bean method getCarObject2" );
        return new Car("Red");
    }

}
