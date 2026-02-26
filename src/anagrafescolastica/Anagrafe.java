/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolastica;

import java.util.*;

/**
 *
 * @author tadde
 */
public class Anagrafe {
    private ArrayList<Studente> listaStudenti;
    private HashSet<String> insiemeMatricole;
    private HashMap<String, Studente> mappaStudenti;

    public Anagrafe() {
        listaStudenti = new ArrayList<>();
        insiemeMatricole = new HashSet<>();
        mappaStudenti = new HashMap<>();
    }

    public boolean aggiungiStudente(Studente s) {
        if (s == null || insiemeMatricole.contains(s.getMatricola())) {
            return false;
        }
        listaStudenti.add(s);
        insiemeMatricole.add(s.getMatricola());
        mappaStudenti.put(s.getMatricola(), s);
        return true;
    }

    public boolean eliminaStudente(String matricola) {
        if (!insiemeMatricole.contains(matricola)) {
            return false;
        }
        Studente s = mappaStudenti.remove(matricola);
        insiemeMatricole.remove(matricola);
        listaStudenti.remove(s);
        return true;
    }
    
    public void svuota() {
        listaStudenti.clear();
        insiemeMatricole.clear();
        mappaStudenti.clear();
    }

    public Studente cercaStudente(String matricola) {
        return mappaStudenti.get(matricola);
    }

    public Collection<Studente> getTuttiStudenti() {
        return Collections.unmodifiableList(listaStudenti);
    }

    public int numeroStudenti() {
        return listaStudenti.size();
    }

    public ArrayList<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public HashSet<String> getInsiemeMatricole() {
        return insiemeMatricole;
    }

    public HashMap<String, Studente> getMappaStudenti() {
        return mappaStudenti;
    }
 
}
