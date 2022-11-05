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
        String line = in.readLine();
        RentACarInterface rentACar = new RentACar();
        
        while (line != null) {
            
            System.out.println(line);
             line = in.readLine();
        }
        return rentACar;
        
    }

    
}