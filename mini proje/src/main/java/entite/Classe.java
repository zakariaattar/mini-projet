/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author 21277
 */
public class Classe {
    private int id;
    private String nom;
    private int annee;

    public Classe(int id, String nom, int annee) {
        this.id = id;
        this.nom = nom;
        this.annee = annee;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAnnee() {
        return annee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
}
