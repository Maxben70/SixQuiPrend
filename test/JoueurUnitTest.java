import org.junit.Assert;
import org.junit.Test;


public class JoueurUnitTest {

    @Test
    public void testAppendPoits() {
        Joueur joueur = new Joueur("Bruno");
        int points = joueur.getPoints();
        joueur.appendPoints(50);
        Assert.assertEquals(points + 50, joueur.getPoints());
    }
}

