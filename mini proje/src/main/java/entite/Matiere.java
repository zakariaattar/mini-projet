/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author 21277
 */
public class Matiere {
    private int id;
    private String nom;
    private int coef;

    public Matiere(int id, String nom, int coef) {
        this.id = id;
        this.nom = nom;
        this.coef = coef;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getCoef() {
        return coef;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }



}
