/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author 21277
 */
public class Etudiant {
        private int id;
    private String nom;
    private String prenom;
    private int code;
    private int telephone;
    private String gmail;
    private String ville;
    private String motsDePasse;
    private int brancheid;
    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom, int code, int telephone, String gmail, String ville, String motsDePasse,int brancheid) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.code = code;
        this.telephone = telephone;
        this.gmail = gmail;
        this.ville = ville;
        this.motsDePasse = motsDePasse;
        this.brancheid=brancheid;
    }

    public void setBrancheid(int brancheid) {
        this.brancheid = brancheid;
    }

    public int getBrancheid() {
        return brancheid;
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

    public int getCode() {
        return code;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getGmail() {
        return gmail;
    }

    public String getVille() {
        return ville;
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

    public void setCode(int code) {
        this.code = code;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setMotsDePasse(String motsDePasse) {
        this.motsDePasse = motsDePasse;
    }
    
}
