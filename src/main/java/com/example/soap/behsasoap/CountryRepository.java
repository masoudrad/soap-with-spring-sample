package com.example.soap.behsasoap;


import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;



import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setPopulation(46704314);
        spain.setCurrency(Currency.EUR);


        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setPopulation(38186860);
        poland.setCurrency(Currency.PLN);


        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setPopulation(63705000);
        uk.setCurrency(Currency.GBP);


        countries.put(uk.getName(), uk);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
}