package dao;

import entite.Enseignant;
import entite.Etudiant;
import org.junit.jupiter.api.*;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class CreerCompteTest {

    private Connection conn;
    private creerCompte creerCompteInstance;

    @BeforeEach
    public void setUp() throws SQLException {
        conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
        creerCompteInstance = new creerCompte(conn);

        Statement stmt = conn.createStatement();

        stmt.execute("CREATE TABLE IF NOT EXISTS enseignant (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nom VARCHAR(255), " +
                "prenom VARCHAR(255), " +
                "telephone INT, " +
                "gmail VARCHAR(255), " +
                "mots_de_passe VARCHAR(255))");

        stmt.execute("CREATE TABLE IF NOT EXISTS etudiant (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nom VARCHAR(255), " +
                "prenom VARCHAR(255), " +
                "code INT, " +
                "telephone INT, " +
                "gmail VARCHAR(255), " +
                "ville VARCHAR(255), " +
                "mots_de_passe VARCHAR(255), " +
                "brancheid INT)");
    }

    @AfterEach
    public void tearDown() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE IF EXISTS enseignant");
        stmt.execute("DROP TABLE IF EXISTS etudiant");
        conn.close();
    }

    @Test
    public void testCreerEnseignantSuccess() throws SQLException {
        Enseignant enseignant = new Enseignant(1, "Sami", "Mehdi", 612345678, "sami@gmail.com", "motdepasse");
        boolean result = creerCompteInstance.creerEnseignant(enseignant);
        assertTrue(result);
    }

    @Test
    public void testCreerEtudiantSuccess() throws SQLException {
        Etudiant etudiant = new Etudiant(
                1, "Ali", "Benali", 1234, 612345678,
                "ali@gmail.com", "Casablanca", "pass123", 5
        );
        boolean result = creerCompteInstance.creerEtudiant(etudiant, conn);
        assertTrue(result);
    }

    @Test
    public void testIsEmailExistsReturnsTrue() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO enseignant (nom, prenom, telephone, gmail, mots_de_passe) VALUES (?, ?, ?, ?, ?)");
        stmt.setString(1, "Sami");
        stmt.setString(2, "Mehdi");
        stmt.setInt(3, 612345678);
        stmt.setString(4, "sami@gmail.com");
        stmt.setString(5, "motdepasse");
        stmt.executeUpdate();

        boolean result = creerCompteInstance.isEmailExists("sami@gmail.com");
        assertTrue(result);
    }

    @Test
    public void testIsEmailExistsReturnsFalse() throws SQLException {
        boolean result = creerCompteInstance.isEmailExists("nouveau@gmail.com");
        assertFalse(result);
    }

    @Test
    public void testIsCodeExistsReturnsTrue() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO etudiant (nom, prenom, code, telephone, gmail, ville, mots_de_passe, brancheid) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setString(1, "Ali");
        stmt.setString(2, "Benali");
        stmt.setInt(3, 1234);
        stmt.setInt(4, 612345678);
        stmt.setString(5, "ali@gmail.com");
        stmt.setString(6, "Casa");
        stmt.setString(7, "pass");
        stmt.setInt(8, 5);
        stmt.executeUpdate();

        boolean result = creerCompteInstance.isCodeExists(1234);
        assertTrue(result);
    }

    @Test
    public void testIsCodeExistsReturnsFalse() throws SQLException {
        boolean result = creerCompteInstance.isCodeExists(9999);
        assertFalse(result);
    }
}
