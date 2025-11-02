/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.statistiques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mmars
 */
public class TP1Statistiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        
        int[] faces = new int[6];

        
        System.out.print("Entrez le nombre de lancers de dé à simuler : ");
        int m = sc.nextInt();

        
        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6); // tire un nombre entre 0 et 5
            faces[tirage]++; // incrémente la case correspondante
        }

        
        System.out.println("\nRésultats après " + m + " lancers :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois");
        }

        
        System.out.println("\nRésultats en pourcentage :");
        for (int i = 0; i < faces.length; i++) {
            double pourcentage = (double) faces[i] / m * 100;
            System.out.printf("Face %d : %.2f %%\n", (i + 1), pourcentage);
        }

        sc.close();
    }
}
    
    

