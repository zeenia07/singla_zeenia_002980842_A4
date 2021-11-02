/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Address.House;
import model.Hospital.Encounter;
import model.Hospital.VitalSigns;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Dell
 */
public class Patient extends Person {
    
    public Encounter encounter;
    
    public Patient(String firstName, String lastName, House houseAdd) {
        super(firstName, lastName, houseAdd);
    }
    
    public Patient(String firstName, String lastName, Person p, Encounter enc){
        super(firstName, lastName, p.getHouse(), p.getPersonId());
        this.encounter = enc;
    }
    
    @Override
    public String toString(){
        return getFirstName();
    }
    
    public int getAge(){
        return encounter.getAge();
    }
     
} 