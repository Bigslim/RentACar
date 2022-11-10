/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Diego
 */
public class RentACar implements RentACarInterface {
    
    ArrayList<RentACar> Car;
    private List<CarInterface> cars;
    private String name;
    private int id;
    private int NumberOfCars;

    public RentACar(ArrayList<RentACar> Car, List<CarInterface> cars, String name, int Id, int NumberOfCars) {
        this.Car = Car;
        this.cars = cars;
        this.name = name;
        this.id = this.id;
        this.NumberOfCars = NumberOfCars;
    }
      
    public RentACar(){
        Car = new ArrayList<>();
    
    }

    @Override
    public List<CarInterface> getCars() {
        
        return cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        
        this.cars = cars; 
    
    }

    @Override
    public String getName() {
        
        return name = "Espresso N' Cigarretes"; 
    
    }

    @Override
    public void setName(String name) {
        // Following the teacher comments on RentACarInterface.java,
        // the name of the Rent-a-Car company has been inserted here 
        // but the console do not print it.
        // It is printed only when changed above.
        this.name = "Espresso N' Cigarretes";
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        //Code has to be inserted here
        
        System.out.println(month + ":" + day + ":" + make + ":" + lengthOfRent);
        return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        //Code has to be inserted here
        System.out.println(month + ":" + day + ":" + make + ":" + lengthOfRent);
        return id;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        //Code has to be inserted here
        
        return true;
    }

    @Override
    public int getNumberOfCars() {
        //Code has to be inserted here
        
        /**
         * A loop is likely required here to pass through the car rentals file 
         * and sum-up the number of cars avaliable in the service. 
         */
        return NumberOfCars;
    }
}
