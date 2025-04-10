package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnseignantTest {

    @Test
    public void testConstructeurEtGetters() {
        Enseignant ens = new Enseignant(1, "Ali", "Omar", 123456789, "ali.omar@gmail.com", "pass123");
        assertEquals(1, ens.getId());
        assertEquals("Ali", ens.getNom());
        assertEquals("Omar", ens.getPrenom());
        assertEquals(123456789, ens.getTelephone());
        assertEquals("ali.omar@gmail.com", ens.getGmail());
        assertEquals("pass123", ens.getMotsDePasse());
    }

    @Test
    public void testSetters() {
        Enseignant ens = new Enseignant();
        ens.setId(2);
        ens.setNom("Karim");
        ens.setPrenom("Zaid");
        ens.setTelephone(987654321);
        ens.setGmail("karim.zaid@gmail.com");
        ens.setMotsDePasse("securepass");

        assertEquals(2, ens.getId());
        assertEquals("Karim", ens.getNom());
        assertEquals("Zaid", ens.getPrenom());
        assertEquals(987654321, ens.getTelephone());
        assertEquals("karim.zaid@gmail.com", ens.getGmail());
        assertEquals("securepass", ens.getMotsDePasse());
    }
}
