/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_quiz_marschutz;


public class question {
private String intitule;
private String proposition1;
private String proposition2;
private String proposition3;
private String proposition4;
private int index;   
    
    
    
public question(String intitule, String p1, String p2, String p3, String p4, int index) {
 this.intitule = intitule;
 this.proposition1 = p1;
 this.proposition2 = p2;
 this.proposition3 = p3;
 this.proposition4 = p4;
 this.index = index;
 
}
public String getintitule() {
        return intitule;
    }

    public String getp1() {
        return proposition1;
    }

    public String getp2() {
        return proposition2;
    }

    public String getp3() {
        return proposition3;
    }

    public String getp4() {
        return proposition4;
    }

    public int getindex() {
        return index;
    }




}
