package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatiereTest {

    @Test
    public void testConstructeurEtGetters() {
        Matiere mat = new Matiere(1, "Maths", 5);
        assertEquals(1, mat.getId());
        assertEquals("Maths", mat.getNom());
        assertEquals(5, mat.getCoef());
    }

    @Test
    public void testSetters() {
        Matiere mat = new Matiere(0, null, 0);
        mat.setId(2);
        mat.setNom("Physique");
        mat.setCoef(4);

        assertEquals(2, mat.getId());
        assertEquals("Physique", mat.getNom());
        assertEquals(4, mat.getCoef());
    }
}
