/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author mmars
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        int operateur;
        int operande1;
        int operande2;
        int resultat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre entre 1 et 5 pour l'operation :");
       operateur= sc.nextInt();
       
       Scanner sb;
        sb = new Scanner(System.in);
       System.out.println("Entrer un premier nombre :");
       operande1=sb.nextInt();
       
        Scanner ss;
        ss = new Scanner(System.in);
       System.out.println("Entrer un deuxieme nombre :");
       operande2=ss.nextInt();
       
       
      if (operateur == 1){
          resultat = operande1+operande2;
          System.out.println("le resultat est ",resultat, );
      }
      if (operateur == 2){
          resultat = operande1-operande2;
          System.out.println("le resultat est ",resultat, );
     
          
      if (operateur == 3 ){
          resultat = operande1*operande2;
          System.out.println("le resultat est ",resultat, );
          }
      if (operateur == 4){
          resultat = operande1/operande2;
          System.out.println("le resultat est ",resultat, );
          
      }
      if (operateur == 5){
          resultat = operande1%operande2;
          System.out.println("le resultat est ",resultat, );
          
       
      }
    }
    
}
