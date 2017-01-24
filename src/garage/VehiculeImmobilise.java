/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class VehiculeImmobilise{
    
    private Vehicule vehicule;    
    private ArrayList<Panne> pannes;
    private boolean enPanne;
    
    public VehiculeImmobilise(Vehicule vehicule, ArrayList<Panne> pannes, boolean enPanne){
        this.vehicule = vehicule;
        this.pannes = pannes;
        this.enPanne = enPanne;
    }
    
    @Override
    public String toString() {
        return "Le véhicule est un(e) " + this.getNom()/* + " et la panne est: " + this.getPanne()*/;
    }

    private String getNom() {
        return this.vehicule.getNom();
    }

    /*private String getPanne() {
        
    }*/
}
