package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrancheTest {

    @Test
    public void testConstructeurEtGetters() {
        Branche branche = new Branche(1, "Informatique");
        assertEquals(1, branche.getId());
        assertEquals("Informatique", branche.getNom());
    }

    @Test
    public void testSetters() {
        Branche branche = new Branche(0, null);
        branche.setId(2);
        branche.setNom("Gestion");

        assertEquals(2, branche.getId());
        assertEquals("Gestion", branche.getNom());
    }
}
