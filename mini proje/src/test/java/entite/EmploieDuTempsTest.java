package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmploieDuTempsTest {

    @Test
    public void testConstructeurComplet() {
        EmploieDuTemps emploi = new EmploieDuTemps(1, "Lundi", 9, 11, 2, 3, 4, 5);
        
        assertEquals(1, emploi.getId());
        assertEquals("Lundi", emploi.getJour());
        assertEquals(9, emploi.getHeureDebut());
        assertEquals(11, emploi.getHeureFin());
        assertEquals(2, emploi.getClassId());
        assertEquals(3, emploi.getMatiereId());
        assertEquals(4, emploi.getPreProfId());
        assertEquals(5, emploi.getDeProfId());
    }

    @Test
    public void testSettersEtGetters() {
        EmploieDuTemps emploi = new EmploieDuTemps();
        emploi.setId(10);
        emploi.setJour("Mardi");
        emploi.setHeureDebut(8);
        emploi.setHeureFin(10);
        emploi.setClassId(1);
        emploi.setMatiereId(2);
        emploi.setPreProfId(3);
        emploi.setDeProfId(4);

        assertEquals(10, emploi.getId());
        assertEquals("Mardi", emploi.getJour());
        assertEquals(8, emploi.getHeureDebut());
        assertEquals(10, emploi.getHeureFin());
        assertEquals(1, emploi.getClassId());
        assertEquals(2, emploi.getMatiereId());
        assertEquals(3, emploi.getPreProfId());
        assertEquals(4, emploi.getDeProfId());
    }
}
