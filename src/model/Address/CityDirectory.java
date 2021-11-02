/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CityDirectory {
    
    ArrayList<City> city;
    
    public CityDirectory(){
        city = new ArrayList();
    }
    
    public CityDirectory(ArrayList<City> cityList){
        city = cityList;
    }
    
    public void addCity(String cityList){
        city.add(new City(cityList));
    }
    
   public ArrayList<String> getCityNames(){
       ArrayList<String> cityList = new ArrayList<String>();
       for (City name : city){
           cityList.add(name.getCityName());
       }
       return cityList;
   }
    
}
