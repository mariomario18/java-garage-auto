/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.ArrayList;

/**
 *
 * @author youma
 */
public class Garage extends ArrayList<VehiculeImmobilise>{
    
    public toString(){
        return this.getSimpleName(); 
    }
}
