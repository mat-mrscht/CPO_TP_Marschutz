/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_marschutz;

import java.util.Scanner;

/**
 *
 * @author mmars
 */
public class TP1_convertisseur_MARSCHUTZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     

    

 
        Scanner sc = new Scanner(System.in);

        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        int choix = sc.nextInt();

        double resultat = 0;

        switch (choix) {
            case 1:
                resultat = CelsiusVersKelvin(valeur);
                System.out.println(valeur + " degrés Celsius est égal à " + resultat + " degrés Kelvin");
                break;
            case 2:
                resultat = KelvinVersCelsius(valeur);
                System.out.println(valeur + " degrés Kelvin est égal à " + resultat + " degrés Celsius");
                break;
            case 3:
                resultat = CelsiusVersFahrenheit(valeur);
                System.out.println(valeur + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 4:
                resultat = FahrenheitVersCelsius(valeur);
                System.out.println(valeur + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius");
                break;
            case 5:
                resultat = KelvinVersFahrenheit(valeur);
                System.out.println(valeur + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit");
                break;
            case 6:
                resultat = FahrenheitVersKelvin(valeur);
                System.out.println(valeur + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide !");
        }

        sc.close();
    }

            // Celsius → Kelvin
    public static double CelsiusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    // Kelvin → Celsius
    public static double KelvinVersCelsius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Celsius → Fahrenheit
    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9/5) + 32;
    }

    // Fahrenheit → Celsius
    public static double FahrenheitVersCelsius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5/9;
    }

    // Kelvin → Fahrenheit
    public static double KelvinVersFahrenheit(double tKelvin) {
        double celsius = KelvinVersCelsius(tKelvin);
        return CelsiusVersFahrenheit(celsius);
    }

    // Fahrenheit → Kelvin
    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double celsius = FahrenheitVersCelsius(tFahrenheit);
        return CelsiusVersKelvin(celsius);
    }
}


// TODO code application logic here
    
    
    

