package com.example.soap.behsasoap;

import javax.xml.bind.annotation.*;

//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getCountryRequest")
public class CountryResponse{

    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }




}
