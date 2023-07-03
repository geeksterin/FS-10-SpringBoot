package com.geekster.StockApp.controller;


import com.geekster.StockApp.model.Stock;
import com.geekster.StockApp.model.StockType;
import com.geekster.StockApp.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    StockService stockService;

    @GetMapping("stocks")
    public List<Stock> getAllStocks()
    {
        return stockService.getAllStocks();
    }

    @PostMapping("stocks")
    public String createStocks(@RequestBody List<Stock> stockList)
    {
        return stockService.createStocks(stockList);
    }

    @DeleteMapping("stock/{id}")
    public String removeStockById(@PathVariable Long id)
    {
        return stockService.removeStockById(id);
    }

    @GetMapping("stock/type/{type}")
    public List<Stock> getStocksByTypePriceDescSorted(@PathVariable StockType type)
    {
        return stockService.getStocksByTypePriceDescSorted(type);
    }


    @GetMapping("stock/timestamp")
    public List<Stock> getStocksBirthTimeDesc()
    {
        return stockService.getStocksBirthTime();
    }

    @PutMapping("stock/type/{type}/increment/{hike}")
    public String updateStocksByType(@PathVariable StockType type,@PathVariable Float hike)
    {
         stockService.updateStocksByType(type,hike);
        return "Updated";
    }

}
