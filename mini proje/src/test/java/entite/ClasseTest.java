package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClasseTest {

    @Test
    public void testConstructeurEtGetters() {
        Classe classe = new Classe(1, "TD1", 2024);
        assertEquals(1, classe.getId());
        assertEquals("TD1", classe.getNom());
        assertEquals(2024, classe.getAnnee());
    }

    @Test
    public void testSetters() {
        Classe classe = new Classe(0, null, 0);
        classe.setId(2);
        classe.setNom("TD2");
        classe.setAnnee(2025);

        assertEquals(2, classe.getId());
        assertEquals("TD2", classe.getNom());
        assertEquals(2025, classe.getAnnee());
    }
}
