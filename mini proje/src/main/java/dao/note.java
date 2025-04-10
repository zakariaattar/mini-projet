/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entite.Note;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class note {
    
        private Connection connection;

    public note () {
        this.connection = connexion.getConnection();
    }

public boolean savenote(Note note, Connection conn) {
    if (conn == null) {
        System.err.println("Connexion null !");
        return false; // ✅ Empêche l'erreur si la connexion est null
    }

    PreparedStatement stmt = null;
    boolean success = false;

    try {
        String query = "INSERT INTO note (valeur, etudiantcode, matiereid) VALUES (?, ?, ?)";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, note.getValeur());
        stmt.setInt(2, note.getCode());
        stmt.setInt(3, note.getMatierid());

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
