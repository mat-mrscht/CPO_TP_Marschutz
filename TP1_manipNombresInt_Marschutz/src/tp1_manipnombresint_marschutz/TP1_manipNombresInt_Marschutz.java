/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_marschutz;

import java.util.Scanner;

/**
 *
 * @author mmars
 */
public class TP1_manipNombresInt_Marschutz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;
        int nb1;
        
        
        Scanner sc = new Scanner(System.in);
System.out.println("Entrer un nombre :");
nb=sc.nextInt();

System.out.println("Entrer un deuxieme nombre :");
nb1=sc.nextInt();
        

int S = nb + nb1;
        System.out.println("l'addition des deux nombre est " +S);
        
int D = nb - nb1;
        System.out.println("la soustraction des deux nombre est " +D);
        
int M = nb * nb1;
        System.out.println("la multiplication des deux nombre est " +M);
        
int Di = nb / nb1;
        System.out.println("la division des deux nombre est " +Di);
        
double E = nb % nb1;
System.out.println("la division non euclidienne des deux nombre est " +E);

    }
    
}
