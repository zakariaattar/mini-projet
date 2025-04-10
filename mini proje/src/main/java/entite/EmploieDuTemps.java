/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author 21277
 */
public class EmploieDuTemps {
    private Integer id;
    private String jour;
    private Integer heureDebut;
    private Integer heureFin;
    private Integer classId;
    private Integer matiereId;
    private Integer preProfId;
    private Integer deProfId;

    public EmploieDuTemps() {
    }

    public EmploieDuTemps(Integer id, String jour, Integer heureDebut, Integer heureFin, Integer classId, Integer matiereId, Integer preProfId, Integer deProfId) {
        this.id = id;
        this.jour = jour;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.classId = classId;
        this.matiereId = matiereId;
        this.preProfId = preProfId;
        this.deProfId = deProfId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public void setHeureDebut(Integer heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(Integer heureFin) {
        this.heureFin = heureFin;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public void setMatiereId(Integer matiereId) {
        this.matiereId = matiereId;
    }

    public void setPreProfId(Integer preProfId) {
        this.preProfId = preProfId;
    }

    public void setDeProfId(Integer deProfId) {
        this.deProfId = deProfId;
    }

    public Integer getId() {
        return id;
    }

    public String getJour() {
        return jour;
    }

    public Integer getHeureDebut() {
        return heureDebut;
    }

    public Integer getHeureFin() {
        return heureFin;
    }

    public Integer getClassId() {
        return classId;
    }

    public Integer getMatiereId() {
        return matiereId;
    }

    public Integer getPreProfId() {
        return preProfId;
    }

    public Integer getDeProfId() {
        return deProfId;
    }
    
    

}
