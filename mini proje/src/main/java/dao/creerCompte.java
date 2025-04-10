/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entite.Etudiant;
import entite.Enseignant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class creerCompte {
    

    private Connection connection;

    public creerCompte() {
        this.connection = connexion.getConnection();
    }
    public creerCompte(Connection connection) {
        this.connection = connection;
    }
    public boolean creerEtudiant(Etudiant etudiant, Connection conn) {
    PreparedStatement stmt = null;
    boolean success = false;
    
    try {
        // Use the provided connection instead of creating a new one
        String query = "INSERT INTO etudiant (nom, prenom, gmail, mots_de_passe, telephone, code, ville, brancheid) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        stmt = conn.prepareStatement(query);
        stmt.setString(1, etudiant.getNom());
        stmt.setString(2, etudiant.getPrenom());
        stmt.setString(3, etudiant.getGmail());
        stmt.setString(4, etudiant.getMotsDePasse());
        stmt.setInt(5, etudiant.getTelephone());
        stmt.setInt(6, etudiant.getCode());
        stmt.setString(7, etudiant.getVille());
        stmt.setInt(8, etudiant.getBrancheid());
        
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
    
    public boolean creerEnseignant(Enseignant enseignant) {
        String sql = "INSERT INTO enseignant (nom, prenom, telephone, gmail, mots_de_passe) " +
                     "VALUES (?, ?, ?, ?, ?)";
        
        try (
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            
            pstmt.setString(1, enseignant.getNom());
            pstmt.setString(2, enseignant.getPrenom());
            pstmt.setInt(3, enseignant.getTelephone());
            pstmt.setString(4, enseignant.getGmail());
            pstmt.setString(5, enseignant.getMotsDePasse());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // You might want to add validation methods to check if email or code already exists
    public boolean isEmailExists(String email) {
        String sql = "SELECT COUNT(*) FROM etudiant WHERE gmail = ? " +
                     "UNION ALL " +
                     "SELECT COUNT(*) FROM enseignant WHERE gmail = ?";
        
        try (
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            
            pstmt.setString(1, email);
            pstmt.setString(2, email);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                int count = 0;
                while (rs.next()) {
                    count += rs.getInt(1);
                }
                return count > 0;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean isCodeExists(int code) {
        String sql = "SELECT COUNT(*) FROM etudiant WHERE code = ?";
        
        try (
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            
            pstmt.setInt(1, code);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
                return false;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
