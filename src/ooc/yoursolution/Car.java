/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Diego
 */
public class Car implements CarInterface {
    private Make make;
    private double rate;
    private boolean avaliability;
    private int id;
    
    @Override
    public Map<Month, boolean[]> createAvailability() {
        return this.createAvailability(avaliability); 
    // Will create avaliability based on the days of month, called from Month.java.
    // and overwritten from CarInterface.java
    
    /**
     * Note that in the CarInterface.java the enums have been imported, which might mean
     * that CarInterface interacts with Make and Month.
     */
    }

    @Override
    public Make getMake() {
         return this.make;
    // Will make the car model, overwritten from CarInterface.java 
    
    /**
     * Same as above, this class implements the interface coded in the CarInterface.java.
     */
         
    }

    @Override
    public void setMake(Make make) {
    //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public double getRate() {
        return this.rate; 
    //It gets the rate of the car, whetever it means
    }

    @Override
    public void setRate(double rate) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return this.getAvailability();
    //Will return the avaliability calendar for this car
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return this.id; 
    //Will get the car ID
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        return this.isAvailable(month, day); 
    //Will check the avaliability for a given month and day
        
    }

    @Override
    public boolean book(Month month, int day) {
        return this.book(month, day); 
    //To book a room after avaliability is checked
    }

    private Map<Month, boolean[]> createAvailability(boolean avaliability) {
        return this.createAvailability(avaliability); 
    //It will create a calendar of days avaiable for a given car
    }
    
}
