/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

/**
 *
 * @author Dell
 */
public class City {
    
    private String city;

    public City(String city){
        this.city = city;
    }
    
    public String getCityName() {
        return city;
    }

    public void setCityName(String city) {
        this.city = city;
    }
}
