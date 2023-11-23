package com.example.money.api;

import com.example.money.model.Currency;
import com.example.money.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/vi/money")
public class MoneyController {
    @Autowired
    private final CurrencyService currencyService;

    public MoneyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }
    @GetMapping
    public List<Currency> getCurrency(){
        return currencyService.getCurrency();
    }
    //create new
    @PostMapping
    public Currency createOne(@RequestBody Currency currency){
        return currencyService.save(currency);
    }
    //update
    @PutMapping
    public Currency updateOne(@RequestBody Currency currency){
        return currencyService.save(currency);
    }
    //delete
    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Long id){
        currencyService.deleteById(id);
    }
    //search
    @GetMapping
    public List<Currency> findByDate(@PathVariable String date){
        return currencyService.findByDate(date);
    }




}
