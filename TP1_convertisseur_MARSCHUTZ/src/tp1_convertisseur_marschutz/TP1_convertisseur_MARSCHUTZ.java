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
    System.out.println("entrez une temperature en degres celcius");
    double nb_celcius =sc.nextDouble();
    
        System.out.println("votre temperature en celcius est " +nb_celcius);
        
        double nb_kelvin = nb_celcius+273;
        
        System.out.println("votre temperature en kelvin est " +nb_kelvin);
    }
    public static double CelciusVersKelvin (double nb_celcius) {
    double temp_K = nb_celcius+273.00;
        return temp_K;
 // à completer
}

// TODO code application logic here
    
    
    
}
