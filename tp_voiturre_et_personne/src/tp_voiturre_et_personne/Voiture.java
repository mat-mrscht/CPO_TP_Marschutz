/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_voiturre_et_personne;

/**
 *
 * @author mmars
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;

    public Voiture(String mod, String mar, int puissance) {
        modele = mod;
        marque = mar;
        puissanceCV = puissance;
        proprietaire = null; // aucune personne au début
    }

    @Override
    public String toString() {
        String chaine;
        chaine = modele + " " + marque + " (" + puissanceCV + " CV)";
        
        if (proprietaire == null) {
            chaine += ", propriétaire : aucun";
        } else {
            chaine += ", propriétaire : " + proprietaire.prenom + " " + proprietaire.nom;
        }

        return chaine;
    }
}
