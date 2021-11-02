/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;
import java.util.Date;
import model.Hospital.VitalSigns;

/**
 *
 * @author Dell
 */
public class Encounter implements Comparable<Encounter>{
    
    private Date encounterDate;
    VitalSigns vitals;
    int personId;
    
    public Encounter(VitalSigns vs, Date encounterDate, int personId){
        this.vitals = vs;
        this.encounterDate = encounterDate;
        this.personId = personId;
    }
    
    public Date getEncounteredDate() {
        return encounterDate;
    }

    public void setEncounteredDate(Date encounteredDate) {
        this.encounterDate = encounteredDate;
    }
    
    public int getAge(){
        return this.vitals.getAge();
    }
    
    public int getBloodPressure(){
        return this.vitals.getBloodPressure();
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.vitals.getAge());
    }
    
    @Override
    public int compareTo(Encounter ec){
       int last = this.encounterDate.compareTo(ec.encounterDate);
       return last;
    }

}
