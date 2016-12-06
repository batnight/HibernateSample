package model;

import java.util.List;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class Country {
    private int id;
    private String countryName;
    private List<City> cities;

    public Country(int id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public Country() {
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
