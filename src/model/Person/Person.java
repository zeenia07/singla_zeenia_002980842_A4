/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Person;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import model.Address.City;
import model.Address.House;
import model.Hospital.Encounter;
import model.Hospital.EncounterHistory;

/**
 *
 * @author Dell
 */
public class Person {
    static AtomicInteger atomicInteger = new AtomicInteger(101);
    private String firstName;
    private String lastName;
    private House houseAddress;
    private int personId;
    private EncounterHistory encounterHist;
    
    public Person(String firstName, String lastName, House address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseAddress = address;
        this.personId = atomicInteger.getAndIncrement();
        this.encounterHist = new EncounterHistory();
    }
    
    public Person(String firstName, String lastName, House address, int personId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseAddress = address;
        this.personId = personId;
        this.encounterHist = new EncounterHistory();
    }

    public int getPersonId(){
        return this.personId;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public House getAddress() {
        return houseAddress;
    }

    public void setAddress(House address) {
        this.houseAddress = address;
    }
    
    public String getCityName(){
        return this.houseAddress.getCityName();
    }
    
    public String getCommunityName(){
        return this.houseAddress.getCommunityName();
    }
    
    public int getHouseNumber(){
        return this.houseAddress.getHouseNumber();
    }
    
    public String getStreetName(){
        return this.houseAddress.getStreetName();
    }
    
    public House getHouse(){
        return this.houseAddress;
    }
    
    public ArrayList<Encounter> getEncounterHistory(){
        return this.encounterHist.viewAllEncounters();
    }
    
    public void setEncounterHistory(ArrayList<Encounter> ec){
        this.encounterHist.encounterHistory = ec;
    }
    
    public void addEncounter(Encounter ec){
        this.encounterHist.addEncounter(ec);
    }
    
    public void deleteEncounter(Encounter ec){
        this.encounterHist.deleteEncounter(ec);
    }
    
    @Override
    public String toString(){
        return firstName;
    }
    
    
    
}
