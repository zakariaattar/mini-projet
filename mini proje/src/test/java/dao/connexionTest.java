package dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.SQLException;

class connexionTest {

    @Test
    void testGetConnection() {
      
        Connection connection = connexion.getConnection();

        assertNotNull(connection, "Connection should not be null");

        try {
            assertTrue(connection.isValid(2), "Connection should be valid");
        } catch (SQLException e) {
            fail("An error occurred while validating the connection: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
