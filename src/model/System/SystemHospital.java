/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.System;

import java.util.ArrayList;
import model.Address.City;
import model.Address.CityDirectory;
import model.Patient.PatientDirectory;
import model.Person.PersonDirectory;
import model.Address.HouseDirectory;
import model.Hospital.EncounterHistory;
/**
 *
 * @author Dell
 */
public class SystemHospital {
    
    public PatientDirectory patientDirec;
    public PersonDirectory personDirec;
    public HouseDirectory houseDirec;
    public CityDirectory cityDirec;
    
    public SystemHospital(){
    
        
        personDirec = new PersonDirectory();
        patientDirec = new PatientDirectory(personDirec);
        houseDirec = new HouseDirectory();
        ArrayList<City> cityList = new ArrayList<City>();
        cityList.add(new City("Boston"));
        cityList.add(new City("Waltham"));
        cityList.add(new City("Quincy"));
        cityDirec = new CityDirectory(cityList);
    }
    
}
