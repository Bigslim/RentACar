/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Diego
 */
public class BookingSystem implements BookingSystemInterface {

        
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String line = in.readLine(); // delcare string 
        //String line1 = in.readLine();
        /*
        while((s = in.readLine()) != null){

        String[] var = s.split(":");
             //var[0]=MALE etc etc
        addGender.add(var[0]);
        */
        
//        String make[] = line.split(":");
//        for(String a : make){
//            System.out.println(a);
//        }
        
        
        RentACarInterface rentACar = new RentACar();
//        while ((line = in.readLine()) != null ) { // loops infinite if it is not 0
//            String[] var = line.split(":");
//        }
            
        while (line != null) {
            System.out.println(line);
            line = in.readLine(); // read line by line until it finish
        }
    
        return rentACar;
        
    }
    
}

    
