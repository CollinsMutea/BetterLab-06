package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * @param city
     * This checks if the city is in list and returns true or false
     * @return cities.contains(city)
     */

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * @param city
     * This checks if the city we are about to delete is in the list.
     * If not we
     *
     * @throws IllegalArgumentException
     * else we remove city
     */
     public void delete(City city) {
         if (!cities.contains(city)) {
             throw new IllegalArgumentException("City does not exist");
         }
         cities.remove(city);
     }

    /**
     * Return how many cities are in the list
     *
     * @return cities.size
     */
     public int countCities(){
        return cities.size();
     }

}

