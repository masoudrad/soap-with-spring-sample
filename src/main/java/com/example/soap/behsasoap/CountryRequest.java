package com.example.soap.behsasoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getCountryRequest")
public class CountryRequest{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountryRequest(String name){
        CountryRepository countryRepository = new CountryRepository();
        return countryRepository.findCountry(name);
    }

}
