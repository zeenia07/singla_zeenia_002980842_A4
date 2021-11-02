/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.swing.JOptionPane;
import model.Hospital.Encounter;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Dell
 */
public class PatientDirectory {
    
    public ArrayList<Patient> patientDirectory;
    PersonDirectory personDirectory;
    public final int minValidBloodPressure = 50;
    public final int maxValidBloodPressure = 180;
    
     public PatientDirectory(PersonDirectory personDirectory){
        patientDirectory = new ArrayList<Patient>();
        this.personDirectory = personDirectory;
    }
     
    public void addPatient(Patient p){
        patientDirectory.add(p);
    }
    
    public void removePatient(Patient p){
        patientDirectory.remove(p);
    }
    
    public void updatePatientDetails(Patient p, int index){
        patientDirectory.set(index, p);
    }
    
    public ArrayList<Patient> getPatientDirectory(){
        LinkedHashSet<Patient> setPatient = new LinkedHashSet<>(patientDirectory);
        ArrayList<Patient> uniqueList = new ArrayList<>(setPatient);
        return uniqueList;
    }
    
    public void populatePatients(){

        for(Person p : personDirectory.getPersonList()){
            System.out.println(p);
            ArrayList<Encounter> encounterArr = p.getEncounterHistory(); 
            Collections.sort(encounterArr);
            int encounterHistorySize = encounterArr.size();
            Encounter enc;
            if(encounterHistorySize == 0){
            continue;
            }
                      
            enc = encounterArr.get(encounterHistorySize-1);
            
      
                if(enc.getBloodPressure() >= maxValidBloodPressure || 
                      enc.getBloodPressure() <= minValidBloodPressure){
                        this.removePersonFromPatient(p);
                        patientDirectory.add(new Patient(p.getFirstName(),
                                            p.getLastName(),
                                            p, enc)
                        );
                }
                else{
                    this.removePersonFromPatient(p);
                }

        }

    }
    
    private void removePersonFromPatient(Person p){
        Iterator<Patient> itr = patientDirectory.iterator();            
                    while(itr.hasNext()){
                        int personId = itr.next().getPersonId();
                        if(personId== p.getPersonId()){
                            itr.remove();
                        }
                    }
    }
    
}
