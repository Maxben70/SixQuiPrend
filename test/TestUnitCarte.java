import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class TestUnitCarte {

    Carte carte = new Carte(55);

    @Test
    public void testPtPenaliteAttribue() {
        assertEquals(7, carte.getPtPenalite());
    }
}