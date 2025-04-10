/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entite.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class creeremploiedao {
        private Connection connection;

    public creeremploiedao() {
        this.connection = connexion.getConnection();
    }

        public boolean saveemploi(EmploieDuTemps emploi, Connection conn) {
        if (conn == null) {
            System.out.println("Connexion nulle !");
            return false;
        }

        PreparedStatement stmt = null;
        boolean success = false;

        try {
            String query = "INSERT INTO emploi_du_temps (jour, heureDebut, heurefin, classid, matiere, preprofid, deprofid) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, emploi.getJour());
            stmt.setInt(2, emploi.getHeureDebut());
            stmt.setInt(3, emploi.getHeureFin());
            stmt.setInt(4, emploi.getClassId());
            stmt.setInt(5, emploi.getMatiereId());
            stmt.setInt(6, emploi.getPreProfId());
            stmt.setInt(7, emploi.getDeProfId());

            int rowsAffected = stmt.executeUpdate();
            success = rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return success;
    }
}

