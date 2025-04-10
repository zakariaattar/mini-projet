/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

public class Note {
    private int id;
    private int valeur;
    private int matierid;
    private int code;

    public Note() {
    }

    public Note(int id, int valeur, int matierid, int code) {
        this.id = id;
        this.valeur = valeur;
        this.matierid = matierid;
        this.code = code;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setMatierid(int matierid) {
        this.matierid = matierid;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getValeur() {
        return valeur;
    }

    public int getMatierid() {
        return matierid;
    }

    public int getCode() {
        return code;
    }


    


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


    
    
}
