package com.example.money.Repository;


import com.example.money.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    List<Currency> findByDate(String date);


    void delete(String date);
}
