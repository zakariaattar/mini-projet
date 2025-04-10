/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author 21277
 */
public class Enseignant {
    private int id;
    private String nom;
    private String prenom;
    private int telephone;
    private String gmail;
    private String motsDePasse;

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom, int telephone, String gmail, String motsDePasse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.gmail = gmail;
        this.motsDePasse = motsDePasse;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getGmail() {
        return gmail;
    }

    public String getMotsDePasse() {
        return motsDePasse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setMotsDePasse(String motsDePasse) {
        this.motsDePasse = motsDePasse;
    }
    
}
