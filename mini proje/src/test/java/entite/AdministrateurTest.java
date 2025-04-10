package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdministrateurTest {

    @Test
    public void testConstructeurParDefautEtSetters() {
        Administrateur admin = new Administrateur();
        admin.setId(1);
        admin.setGmail("admin@example.com");
        admin.setMotsDePasse("secret123");

        assertEquals(1, admin.getId());
        assertEquals("admin@example.com", admin.getGmail());
        assertEquals("secret123", admin.getMotsDePasse());
    }

    @Test
    public void testConstructeurAvecParametres() {
        Administrateur admin = new Administrateur(2, "test@gmail.com", "pwd456");

        assertEquals(2, admin.getId());
        assertEquals("test@gmail.com", admin.getGmail());
        assertEquals("pwd456", admin.getMotsDePasse());
    }
}
