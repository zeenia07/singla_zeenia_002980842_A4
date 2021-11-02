/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class EncounterHistory {
    
    public ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        encounterHistory = new ArrayList<>();
    }
    
    public void addEncounter(Encounter ec){
        encounterHistory.add(ec);
    }
    
    public void deleteEncounter(Encounter ec){
        encounterHistory.remove(ec);
    }
    
    public void updateEncounterDetails(Encounter ec, int index){
        encounterHistory.set(index, ec);
    }
    
    public ArrayList<Encounter> viewAllEncounters(){
        return encounterHistory;
    }
    
}
