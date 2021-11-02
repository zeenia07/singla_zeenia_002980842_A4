/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;

/**
 *
 * @author Dell
 */
public class VitalSigns {
    
    private int bloodPressure;
    private int age;
    
    public VitalSigns(int bloodPressure, int age){
        this.bloodPressure = bloodPressure;
        this.age = age;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
}
