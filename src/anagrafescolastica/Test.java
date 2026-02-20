/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolastica;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author diego
 */
public class Test {
    public void Avvia(){
        Scanner input=new Scanner(System.in);
        FileWriter fw = null;
        PrintWriter pw = null;
        Studente s;
        int scelta=0;
        while(scelta!=3){
            System.out.println("Inserisci Studenti[1]\n");
            System.out.println("Leggi Studenti[2]\n");
            System.out.println("Esci[3]\n");
            scelta=input.nextInt();
            if(scelta==1){
                s.CreaStudente();
            }
        }
    }
}
