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
    
    ArrayList<CarInterface> Car;
    private List<CarInterface> cars;
    private Make make;
    private Month month;
    private String name;
    private int Id;
    private int NumberOfCars;
    private Iterable<CarInterface> carss;
    
    /*
    Constructor of our attribute
    */
    
    public RentACar(ArrayList<CarInterface> Car, List<CarInterface> cars, Make make, Month month, String name, int Id, int NumberOfCars, Iterable<CarInterface> carss) {
        this.Car = Car;
        this.cars = cars;
        this.make = make;
        this.month = month;
        this.name = name;
        this.Id = Id;
        this.NumberOfCars = NumberOfCars;
        this.carss = carss;
    }
    
    /*
    Getters and setters of mehtods
    */
    
    public ArrayList<CarInterface> getCar() {
        return Car;
    }

    public void setCar(ArrayList<CarInterface> Car) {
        this.Car = Car;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Iterable<CarInterface> getCarss() {
        return carss;
    }

    public void setCarss(Iterable<CarInterface> carss) {
        this.carss = carss;
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
        
        this.cars.add(Id, (CarInterface) cars);
    
    }

    @Override
    public String getName() {
        
        for (Make make : Make.values()){
            System.out.println(make);
            
        }     
    return name;
        
    }

    @Override
    public void setName(String name) {
        // Following the teacher comments on RentACarInterface.java,
        // the name of the Rent-a-Car company has been inserted here 
        // but the console do not print it.
        // It is printed only when changed above.
        this.name = "Expresso N' Cigarretes";
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        //COde has to be inserted here: check the FileReaderSampleSolution exercise
        for (Month s : Month.values() ){
            System.out.println(s);
        }
        return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        //Code has to be inserted here: check the FileReaderSampleSolution
        
        return Id;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        //Code has to be inserted here: check the FileReaderSampleSolution
        return true;
    }

    @Override
    public int getNumberOfCars() {
   
        
        //Code has to be inserted here: check the FileReaderSampleSolution
        return NumberOfCars;
    }
}
