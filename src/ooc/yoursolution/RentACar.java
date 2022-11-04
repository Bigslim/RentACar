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
    private int Id;
    private int NumberOfCars;

    public RentACar(ArrayList<RentACar> Car, List<CarInterface> cars, String name, int Id, int NumberOfCars) {
        this.Car = Car;
        this.cars = cars;
        this.name = name;
        this.Id = Id;
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
        
        return name = "Expresso N' Cigarretes"; 
    
    }

    @Override
    public void setName(String name) {
        
        name = "Expresso N' Cigarretes";
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        
        return true;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        
        return Id;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
       
        return true;
    }

    @Override
    public int getNumberOfCars() {
        
        return NumberOfCars;
    }
}
