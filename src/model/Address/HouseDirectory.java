/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

import java.util.ArrayList;
import java.util.List;
import model.Person.Person;

/**
 *
 * @author Dell
 */
public class HouseDirectory {
 
    ArrayList<House> house;
    
    public HouseDirectory(){
        house = new ArrayList();
    }
    
    public void addNewHouse(House h){
        house.add(h);
    }
    
    public void deleteNewHouse(int delete){
        house.remove(delete);
    }
    
    public void updateHouseDetails(int index, House updatedAddress){
        house.set(index, updatedAddress);
      }
}
