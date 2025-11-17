/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_voiturre_et_personne;

/**
 *
 * @author mmars
 */
public class Personne {
    String prenom;
    String nom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String p, String n) {
        prenom = p;
        nom = n;
        nbVoitures = 0;
        liste_voitures = new Voiture[3]; // max 3 voitures
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " possède " + nbVoitures + " voiture(s)";
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

        // 1. voiture déjà à quelqu’un → refus
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }

        // 2. tableau plein → refus
        if (nbVoitures >= 3) {
            return false;
        }

        // 3. Ajout possible
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;

        // on dit à la voiture qui est son proprio
        voiture_a_ajouter.proprietaire = this;

        return true;
    }
}

