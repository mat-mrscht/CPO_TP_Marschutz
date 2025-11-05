/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur;

import java.util.Scanner;

/**
 *
 * @author mmars
 */
public class TP2_Convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Convertisseur c1 = new Convertisseur();
        Convertisseur c2 = new Convertisseur();

        System.out.println("=== Menu Convertisseur ===");
        System.out.println("1 - Celcius vers Kelvin");
        System.out.println("2 - Kelvin vers Celcius");
        System.out.println("3 - Farenheit vers Celcius");
        System.out.println("4 - Celcius vers Farenheit");
        System.out.println("5 - Kelvin vers Farenheit");
        System.out.println("6 - Farenheit vers Kelvin");
        System.out.print("Choisissez une conversion : ");
        int choix = sc.nextInt();

        System.out.print("Saisissez la température à convertir : ");
        double t = sc.nextDouble();
        double res = 0;

        switch (choix) {
            case 1 -> res = c1.CelciusVersKelvin(t);
            case 2 -> res = c1.KelvinVersCelcius(t);
            case 3 -> res = c1.FarenheitVersCelcius(t);
            case 4 -> res = c1.CelciusVersFarenheit(t);
            case 5 -> res = c1.KelvinVersFarenheit(t);
            case 6 -> res = c1.FarenheitVersKelvin(t);
            default -> System.out.println("Choix invalide !");
        }

        System.out.println("Résultat de la conversion : " + res);
        System.out.println(c1);  
        System.out.println(c2);  
    }
}

    
    

