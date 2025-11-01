/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guess_my_number;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mmars
 */
public class TP1_guess_my_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("=== Bienvenue dans le jeu Guess My Number ! ===");
        System.out.println("Choisissez votre niveau de difficulté :");
        System.out.println("1) Facile (nombre entre 0 et 50)");
        System.out.println("2) Normal (nombre entre 0 et 100)");
        System.out.println("3) Difficile (nombre entre 0 et 200)");

        int choix = sc.nextInt();
        int borneMax;
        int essaisMax;

        // Définition des paramètres selon la difficulté choisie
        if (choix == 1) {
            borneMax = 50;
            essaisMax = 10;
        } else if (choix == 3) {
            borneMax = 200;
            essaisMax = 7;
        } else {
            borneMax = 100;
            essaisMax = 10;
        }

        int nombreMystere = generateurAleat.nextInt(borneMax + 1);
        int tentative;
        int compteur = 0;
        boolean trouve = false;

        System.out.println("\nJ'ai choisi un nombre entre 0 et " + borneMax + ". À vous de le deviner !");
        System.out.println("Vous avez " + essaisMax + " essais maximum.");

        // Boucle principale du jeu
        while (!trouve && compteur < essaisMax) {
            System.out.print("\nEntrez un nombre : ");
            tentative = sc.nextInt();
            compteur++;

            if (tentative < nombreMystere) {
                if (Math.abs(tentative - nombreMystere) > 20)
                    System.out.println("Trop petit !");
                else
                    System.out.println("Vraiment trop petit !");
            } else if (tentative > nombreMystere) {
                if (Math.abs(tentative - nombreMystere) > 20)
                    System.out.println("Trop grand !");
                else
                    System.out.println("Vraiment trop grand !");
            } else {
                trouve = true;
                System.out.println("\n🎉 Bravo ! Vous avez trouvé le nombre " + nombreMystere + " en " + compteur + " coups !");
            }
        }

        if (!trouve) {
            System.out.println("\n😢 Vous avez perdu ! Le nombre mystère était " + nombreMystere + ".");
        }

        System.out.println("Merci d'avoir joué !");
        sc.close();
    }
}
    
    

