package dao;

import entite.Administrateur;
import entite.Enseignant;
import entite.Etudiant;
import org.junit.jupiter.api.*;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserDAOTest {

    private static Connection connection;
    private static UserDAO userDAO;

    @BeforeAll
    public static void setupDatabase() throws Exception {
        connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1","sa", "");
        userDAO = new UserDAO(connection);

        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE administrateur (id INT PRIMARY KEY, gmail VARCHAR(255), mots_de_passe VARCHAR(255))");
            stmt.execute("INSERT INTO administrateur VALUES (1, 'admin@gmail.com', 'admin123')");

            stmt.execute("CREATE TABLE enseignant (id INT PRIMARY KEY, nom VARCHAR(255), prenom VARCHAR(255), telephone INT, gmail VARCHAR(255), mots_de_passe VARCHAR(255))");
            stmt.execute("INSERT INTO enseignant VALUES (2, 'Ali', 'Ahmed', 12345678, 'enseignant@gmail.com', 'pass123')");

            stmt.execute("CREATE TABLE etudiant (id INT PRIMARY KEY, nom VARCHAR(255), prenom VARCHAR(255), code INT, telephone INT, gmail VARCHAR(255), ville VARCHAR(255), mots_de_passe VARCHAR(255))");
            stmt.execute("INSERT INTO etudiant VALUES (3, 'Sara', 'Ben', 111, 99999999, 'etudiant@gmail.com', 'Tunis', 'etu123')");
        }
    }

    @AfterAll
    public static void closeConnection() throws Exception {
        connection.close();
    }

    @Test
    public void testAuthenticateAdmin_Success() throws Exception {
        Administrateur admin = userDAO.authenticateAdmin("admin@gmail.com", "admin123");
        assertNotNull(admin);
        assertEquals("admin@gmail.com", admin.getGmail());
    }

    @Test
    public void testAuthenticateEnseignant_Success() throws Exception {
        Enseignant enseignant = userDAO.authenticateEnseignant("enseignant@gmail.com", "pass123");
        assertNotNull(enseignant);
        assertEquals("Ali", enseignant.getNom());
    }

    @Test
    public void testAuthenticateEtudiant_Success() throws Exception {
        Etudiant etudiant = userDAO.authenticateEtudiant("etudiant@gmail.com", "etu123");
        assertNotNull(etudiant);
        assertEquals("Sara", etudiant.getNom());
    }

    @Test
    public void testAuthenticateAdmin_Fail() throws Exception {
        Administrateur admin = userDAO.authenticateAdmin("wrong@gmail.com", "wrong");
        assertNull(admin);
    }
}
