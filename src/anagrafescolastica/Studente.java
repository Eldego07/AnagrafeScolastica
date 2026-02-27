/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolastica;

/**
 *
 * @author diego
 */
public class Studente {
    // Attributi
    private String matricola;
    private String nome;
    private String cognome;

    /**
     * Costruttore di Studente
     * @param matricola
     * @param nome
     * @param cognome 
     */
    public Studente(String matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     * Metodo get di matricola
     * @return matricola
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Metodo get di nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get di cognome
     * @return cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Metodo set di matricola
     * @param matricola 
     */
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    /**
     * Metodo set di nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo set di cognome
     * @param cognome 
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Override del metodo toString
     * @return Una stringa con gli attributi di Studente
     */
    @Override
    public String toString() {
        return matricola + " - " + nome + " " + cognome;
    }
}
