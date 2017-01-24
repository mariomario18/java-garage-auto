/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author youma
 */
public class Vehicule {
    
    private String nom;
    private boolean enPanne;
    
    public Vehicule(String nom, boolean enPanne){
        this.nom = nom;
        this.enPanne = enPanne;
    }

    String getNom() {
        return this.nom;
    }

    boolean demarrer() {
        if (enPanne)
            return false;
        else
            return true;
    }
}
