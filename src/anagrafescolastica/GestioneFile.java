/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolastica;

import java.io.*;
import java.util.*;

/**
 *
 * @author diego
 */
public class GestioneFile {

    public ArrayList<Studente> caricaDaFile(String nomeFile) {
        ArrayList<Studente> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;
                String[] parti = linea.split(":");
                if (parti.length == 3) {
                    lista.add(new Studente(parti[0], parti[1], parti[2]));
                }
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
        }
        return lista;
    }

    public void salvaSuFile(String nomeFile, java.util.Collection<Studente> studenti) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile))) {
            for (Studente s : studenti) {
                bw.write(s.getMatricola() + ":" + s.getNome() + ":" + s.getCognome());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
}
