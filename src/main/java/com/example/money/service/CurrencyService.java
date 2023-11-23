package com.example.money.service;

import com.example.money.Repository.CurrencyRepository;
import com.example.money.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.example.money.model.Currency;


@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;
    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository){
        this.currencyRepository = currencyRepository;
    }
    //get all data
    public List<Currency> getCurrency(){
        return currencyRepository.findAll();
    }
    //get item by date
    public List<Currency> findByDate(String date){
        return currencyRepository.findByDate(date);
    }
    //save
    public Currency save(Currency currency){
        return currencyRepository.save(currency);
    }

    //delete
    public void deleteById(Long id){
        currencyRepository.deleteById(id);
}
    public void delete(String date){
        currencyRepository.delete(date);
    }
    //update
    public Currency updateCurrency(Long id, Currency currency){
        Optional<Currency> currency1 = currencyRepository.findById(id);
        if (currency1.isPresent()){
            Currency existingCurrency = currency1.get();
            existingCurrency.setDate(currency.getDate());
            existingCurrency.setRmb_ntd(currency.getRmb_ntd());
            existingCurrency.setUsd_ntd(currency.getUsd_ntd());
            return currencyRepository.save(existingCurrency);
        }
        return null;
    }

}
