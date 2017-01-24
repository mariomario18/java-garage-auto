/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.ArrayList;
import java.util.Scanner;

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
        
        Vehicule vehicule = new Vehicule("clio", true);
        Panne panne = new Panne("pneu crevé");
        ArrayList tab = new ArrayList();
        tab.add(panne);
        
        
        VehiculeImmobilise v = new VehiculeImmobilise(vehicule, tab);
        //VehiculeImmobilise a = new VehiculeImmobilise();
        
        //g.add(a);
        g.add(v);
        
        System.out.println(g);
        
        int choix = -1;
        
        while(choix != 0){
            System.out.println("\n\n--- MENU ---");
            System.out.println("0. Quitter");
            System.out.println("1. Voir le garage");
            System.out.println("2. Ajouter un véhicule");

            Scanner reader = new Scanner(System.in);
            choix = reader.nextInt();
            
            switch(choix){
                case 1:
                    System.out.println(g);
                    break;
                case 2:
                    System.out.println("\n--- Ajout d'un véhicule ---");
                    System.out.println("Nom:");
                    String nom = new Scanner(System.in).nextLine();
                    System.out.println("Panne");
                    String nomPanne = new Scanner(System.in).nextLine();
                    
                    Panne newPanne = new Panne(nomPanne);
                    Vehicule a = new Vehicule(nom, true);
                    ArrayList p = new ArrayList();
                    p.add(newPanne);
                    VehiculeImmobilise i = new VehiculeImmobilise(a, p);
                    
                    
                    System.out.println(g);
                    break;
            }
        }
        
    }
    
}
