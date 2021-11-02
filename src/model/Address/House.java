/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

import java.util.ArrayList;
import model.Person.Person;

/**
 *
 * @author Dell
 */
public class House {
    
    private int houseNo;
    private String street;
    public ArrayList<Person> personList;
    public Community community;
    public City city;

    public House(int houseNumber, String streetName, Community communityName, City cityName){
        this.houseNo = houseNumber;
        this.city = cityName;
        this.community = communityName;
        this.street = streetName;
        this.personList = new ArrayList<Person>();
    }
    
    public String getCityName(){
        return this.city.getCityName();
    }
    
    public String getCommunityName(){
        return this.community.getCommunityName();
    }
    
    public int getHouseNumber() {
        return houseNo;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNo = houseNumber;
    }

    public String getStreetName() {
        return street;
    }

    public void setStreetName(String streetName) {
        this.street = streetName;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person p){
                personList.add(p);
    }
        
}
