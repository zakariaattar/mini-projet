package dao;

import entite.EmploieDuTemps;
import org.junit.jupiter.api.*;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class CreerEmploieEnsTest {

    private Connection connection;
    private creeremploiedao emploiDAO;

    @BeforeEach
    public void setUp() throws SQLException {
        connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "sa", "");
        emploiDAO = new creeremploiedao();

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE TABLE IF NOT EXISTS emploie (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "jour VARCHAR(20) NOT NULL, " +
                "heuredebut INT NOT NULL, " +
                "heurefin INT NOT NULL, " +
                "classid INT NOT NULL, " +
                "matiereid INT NOT NULL, " +
                "preprofid INT NOT NULL, " +
                "deprofid INT NOT NULL)");
        stmt.close();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.execute("DROP TABLE IF EXISTS emploie");
        stmt.close();
        connection.close();
    }

    @Test
    public void testSaveEmploi_Success() {
        EmploieDuTemps emploi = new EmploieDuTemps(0, "Lundi", 9, 11, 101, 201, 301, 401);
        boolean result = emploiDAO.saveemploi(emploi, connection);
        assertTrue(result);
    }

    @Test
    public void testSaveEmploi_Failure_NullConnection() {
        EmploieDuTemps emploi = new EmploieDuTemps(0, "Mardi", 10, 12, 102, 202, 302, 402);
        boolean result = emploiDAO.saveemploi(emploi, null);
        assertFalse(result);
    }
}
