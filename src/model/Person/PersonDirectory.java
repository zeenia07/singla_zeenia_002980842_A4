/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Person;

import java.util.ArrayList;
import model.Hospital.Encounter;

/**
 *
 * @author Dell
 */
public class PersonDirectory {
 
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }
    
    public void addPerson(Person p){
        personList.add(p);
    }
    
    public void removePerson(Person p){
        personList.remove(p);
    }
    
    public void updatePersonDetails(Person p, int index){
        personList.set(index, p);
    }
    
    public ArrayList<Person> getPersonList(){
        return personList;
    }
    
    public Person getPersonData(int personId){
       int index = 0; 
       for(int i=0; i < this.personList.size(); i++){
            if(personList.get(i).getPersonId() == personId){
                index = i;
                break;
            }
       }
       return personList.get(index);
    }
    
    public void AddEncounter(int personId, Encounter enc){
        int index = 0;

        for(int i=0; i < this.personList.size(); i++){
            if(personList.get(i).getPersonId() == personId){
                index = i;
                break;
            }
        }
        personList.get(index).addEncounter(enc);
    }
    
}
