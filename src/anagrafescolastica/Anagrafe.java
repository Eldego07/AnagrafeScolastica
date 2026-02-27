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
    // Attributi
    private ArrayList<Studente> listaStudenti;
    private HashSet<String> insiemeMatricole;
    private HashMap<String, Studente> mappaStudenti;

    /**
     * Costruttore di Anagrafe
     */
    public Anagrafe() {
        listaStudenti = new ArrayList<>();
        insiemeMatricole = new HashSet<>();
        mappaStudenti = new HashMap<>();
    }

    /**
     * Metodo che aggiunge uno studente
     * @param s lo studente da aggiungere
     * @return true se l'operazione è riuscita, false altrimenti
     */
    public boolean aggiungiStudente(Studente s) {
        if (s == null || insiemeMatricole.contains(s.getMatricola())) {
            return false;
        }
        listaStudenti.add(s);
        insiemeMatricole.add(s.getMatricola());
        mappaStudenti.put(s.getMatricola(), s);
        return true;
    }

    /**
     * Metodo che rimuove uno studente usando la matricola
     * @param matricola la matricola dello studente da rimuovere
     * @return true se l'operazione è riuscita, false altrimenti
     */
    public boolean eliminaStudente(String matricola) {
        if (!insiemeMatricole.contains(matricola)) {
            return false;
        }
        Studente s = mappaStudenti.remove(matricola);
        insiemeMatricole.remove(matricola);
        listaStudenti.remove(s);
        return true;
    }
    
    /**
     * Metodo che rimuove tutti gli studenti dall'anagrafe
     */
    public void svuota() {
        listaStudenti.clear();
        insiemeMatricole.clear();
        mappaStudenti.clear();
    }

    /**
     * 
     * @param matricola
     * @return 
     */
    public Studente cercaStudente(String matricola) {
        return mappaStudenti.get(matricola);
    }

    /**
     * 
     * @return 
     */
    public Collection<Studente> getTuttiStudenti() {
        return Collections.unmodifiableList(listaStudenti);
    }

    /**
     * 
     * @return 
     */
    public int numeroStudenti() {
        return listaStudenti.size();
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Studente> getListaStudenti() {
        return listaStudenti;
    }

    /**
     * 
     * @return 
     */
    public HashSet<String> getInsiemeMatricole() {
        return insiemeMatricole;
    }

    /**
     * 
     * @return 
     */
    public HashMap<String, Studente> getMappaStudenti() {
        return mappaStudenti;
    }
 
}
