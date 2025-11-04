/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_decouverte_paradigme;

/**
 *
 * @author mmars
 */
public class TP2_decouverte_paradigme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");
       autreBiere.lireEtiquette();
       
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson") ;
       uneBiere.lireEtiquette();
       
       System.out.println(uneBiere) ;

       
       
       
    }
    
}
