package entite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoteTest {

    @Test
    public void testConstructeurEtGetters() {
        Note note = new Note(1, 15, 101, 1234);
        assertEquals(1, note.getId());
        assertEquals(15, note.getValeur());
        assertEquals(101, note.getMatierid());
        assertEquals(1234, note.getCode());
    }

    @Test
    public void testSetters() {
        Note note = new Note();
        note.setId(2);
        note.setValeur(18);
        note.setMatierid(102);
        note.setCode(5678);

        assertEquals(2, note.getId());
        assertEquals(18, note.getValeur());
        assertEquals(102, note.getMatierid());
        assertEquals(5678, note.getCode());
    }
}
