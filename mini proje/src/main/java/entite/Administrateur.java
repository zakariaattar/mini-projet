/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author 21277
 */
public class Administrateur {
    private int id;
    private String gmail;
    private String motsDePasse;

    public Administrateur() {
    }

    public Administrateur(int id, String gmail, String motsDePasse) {
        this.id = id;
        this.gmail = gmail;
        this.motsDePasse = motsDePasse;
    }

    public int getId() {
        return id;
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

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setMotsDePasse(String motsDePasse) {
        this.motsDePasse = motsDePasse;
    }
    
}
