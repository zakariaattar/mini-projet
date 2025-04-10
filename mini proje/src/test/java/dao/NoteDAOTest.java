package dao;

import entite.Note;
import org.junit.jupiter.api.*;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class NoteDAOTest {

    private Connection connection;
    private note noteDAO;

    @BeforeEach
    public void setUp() throws Exception {
        connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");

        Statement dropStmt = connection.createStatement();
        dropStmt.execute("DROP TABLE IF EXISTS note");

        String createTableSQL = "CREATE TABLE note (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "valeur INT NOT NULL, " +
                "etudiantcode INT NOT NULL, " +
                "matiereid INT NOT NULL)";
        Statement stmt = connection.createStatement();
        stmt.execute(createTableSQL);

        noteDAO = new note();
    }

    @AfterEach
    public void tearDown() throws Exception {
        connection.close();
    }

    @Test
    public void testSaveNote_Success() {
        Note testNote = new Note(0, 15, 101, 1234);
        boolean result = noteDAO.savenote(testNote, connection);
        assertTrue(result);

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM note WHERE etudiantcode = 1234 AND matiereid = 101")) {

            assertTrue(rs.next());
            assertEquals(15, rs.getInt("valeur"));
            assertEquals(1234, rs.getInt("etudiantcode"));
            assertEquals(101, rs.getInt("matiereid"));

        } catch (SQLException e) {
            fail("Erreur de vérification : " + e.getMessage());
        }
    }

    @Test
    public void testSaveNote_Failure_NullConnection() {
        Note testNote = new Note(0, 18, 102, 5678);
        boolean result = noteDAO.savenote(testNote, null);
        assertFalse(result);
    }
}
