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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Garage g = new Garage();
        
        Vehicule vehicule = new Vehicule();
        Panne panne = new Panne();
        ArrayList tab = new ArrayList();
        tab.add(panne);
        
        
        VehiculeImmobilise v = new VehiculeImmobilise(vehicule, tab, true);
        //VehiculeImmobilise a = new VehiculeImmobilise();
        
        //g.add(a);
        g.add(v);
        
        System.out.println(g.toString());
    }
    
}
