/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrafescolastica;

import java.util.Objects;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author diego
 */
public class Studente {
    private String matricola,nome,cognome,anno,sezione,indirizzo;
    public Studente(String matricola, String nome, String cognome, String anno,String sezione,String indirizzo){
        this.matricola=matricola;
        this.nome=nome;
        this.cognome=cognome;
        this.anno=anno;
        this.sezione=sezione;
        this.indirizzo=indirizzo;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.matricola);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.cognome);
        hash = 83 * hash + Objects.hashCode(this.anno);
        hash = 83 * hash + Objects.hashCode(this.sezione);
        hash = 83 * hash + Objects.hashCode(this.indirizzo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Studente other = (Studente) obj;
        if (!Objects.equals(this.matricola, other.matricola)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.anno, other.anno)) {
            return false;
        }
        if (!Objects.equals(this.sezione, other.sezione)) {
            return false;
        }
        return Objects.equals(this.indirizzo, other.indirizzo);
    }
    
    @Override
    public String toString() {
        return "Studente{" + "matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", anno=" + anno + ", sezione=" + sezione + ", indirizzo=" + indirizzo + '}';
    }
}
