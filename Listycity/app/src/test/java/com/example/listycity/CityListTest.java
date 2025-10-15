package com.example.listycity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


public class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockcity());
        return  cityList;
    }


    private City mockcity(){
        return new City("Edmonton", "AB");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "SK");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
        
    }

    @Test
    void testAddException(){
        CityList cityList =mockCityList();

        City city = new City("Yellowknife","Northwest Territories");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
                cityList.add(city);
    });

    }
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();

        assertEquals(0, mockcity().compareTo(cityList.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0,mockcity().compareTo(cityList.getCities().get(1)));
    }
}
