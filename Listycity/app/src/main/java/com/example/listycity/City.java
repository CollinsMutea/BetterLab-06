package com.example.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * this is our getter for City
     * @return city
     */
    public String getCity(){
        return city;
    }
    /**
     * this is our getter for province
     * @return province
     */
    public String getProvince(){
        return province;
    }
    @Override
    /**
     * this method compares cities based on the city name field.
     **/
    public  int compareTo(City city){
//        City city = (City) o;
        return this.city.compareTo(city.getCity());
    }
}


