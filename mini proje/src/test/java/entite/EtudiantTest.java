package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EtudiantTest {

    @Test
    public void testConstructeurEtGetters() {
        Etudiant etd = new Etudiant(1, "Sara", "Ben", 1001, 55555555, "sara.ben@gmail.com", "Casablanca", "motdepasse", 3);
        assertEquals(1, etd.getId());
        assertEquals("Sara", etd.getNom());
        assertEquals("Ben", etd.getPrenom());
        assertEquals(1001, etd.getCode());
        assertEquals(55555555, etd.getTelephone());
        assertEquals("sara.ben@gmail.com", etd.getGmail());
        assertEquals("Casablanca", etd.getVille());
        assertEquals("motdepasse", etd.getMotsDePasse());
        assertEquals(3, etd.getBrancheid());
    }

    @Test
    public void testSetters() {
        Etudiant etd = new Etudiant();
        etd.setId(2);
        etd.setNom("Youssef");
        etd.setPrenom("Hassan");
        etd.setCode(2002);
        etd.setTelephone(44444444);
        etd.setGmail("youssef.hassan@gmail.com");
        etd.setVille("Rabat");
        etd.setMotsDePasse("pass2024");
        etd.setBrancheid(5);

        assertEquals(2, etd.getId());
        assertEquals("Youssef", etd.getNom());
        assertEquals("Hassan", etd.getPrenom());
        assertEquals(2002, etd.getCode());
        assertEquals(44444444, etd.getTelephone());
        assertEquals("youssef.hassan@gmail.com", etd.getGmail());
        assertEquals("Rabat", etd.getVille());
        assertEquals("pass2024", etd.getMotsDePasse());
        assertEquals(5, etd.getBrancheid());
    }
}
