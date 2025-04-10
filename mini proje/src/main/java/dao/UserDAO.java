/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entite.Administrateur;
import entite.Enseignant;
import entite.Etudiant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    Connection connection;
    private int userId; 
    public int getUserId() {
        return userId;
    }
    public UserDAO() {
        this.connection = connexion.getConnection();
    }
        public UserDAO(Connection connection) {
        this.connection = connection; // pour les tests : on injecte un mock ici
    }

    public Administrateur authenticateAdmin(String gmail, String motsDePasse) {
        String query = "SELECT * FROM Administrateur WHERE gmail = ? AND mots_de_passe = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, gmail);
            statement.setString(2, motsDePasse);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Administrateur admin = new Administrateur();
                    admin.setId(resultSet.getInt("id"));
                    admin.setGmail(resultSet.getString("gmail"));
                    admin.setMotsDePasse(resultSet.getString("mots_de_passe"));
                    userId = admin.getId();
                    return admin;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Enseignant authenticateEnseignant(String gmail, String motsDePasse) {
        String query = "SELECT * FROM Enseignant WHERE gmail = ? AND mots_de_passe = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, gmail);
            statement.setString(2, motsDePasse);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Enseignant enseignant = new Enseignant();
                    enseignant.setId(resultSet.getInt("id"));
                    enseignant.setNom(resultSet.getString("nom"));
                    enseignant.setPrenom(resultSet.getString("prenom"));
                    enseignant.setTelephone(resultSet.getInt("telephone"));
                    enseignant.setGmail(resultSet.getString("gmail"));
                    enseignant.setMotsDePasse(resultSet.getString("mots_de_passe"));
                    userId = enseignant.getId();
                    return enseignant;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Etudiant authenticateEtudiant(String gmail, String motsDePasse) {
        String query = "SELECT * FROM Etudiant WHERE gmail = ? AND mots_de_passe = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, gmail);
            statement.setString(2, motsDePasse);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Etudiant etudiant = new Etudiant();
                    etudiant.setId(resultSet.getInt("id"));
                    etudiant.setNom(resultSet.getString("nom"));
                    etudiant.setPrenom(resultSet.getString("prenom"));
                    etudiant.setCode(resultSet.getInt("code"));
                    etudiant.setTelephone(resultSet.getInt("telephone"));
                    etudiant.setGmail(resultSet.getString("gmail"));
                    etudiant.setVille(resultSet.getString("ville"));
                    etudiant.setMotsDePasse(resultSet.getString("mots_de_passe"));
                    userId = etudiant.getId();

                    return etudiant;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
