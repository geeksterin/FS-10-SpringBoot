package com.geekster.simpleecommerce.factory;

import com.geekster.simpleecommerce.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    public Map<Integer, Product> getProductMap()
    {
        return new HashMap<>();
    }
}
