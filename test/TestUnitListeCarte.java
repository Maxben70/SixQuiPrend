import static junit.framework.Assert.assertEquals;

public class TestUnitListeCarte {

    ListCarte listCarte = new ListCarte(104);
    private Carte carte = new Carte(55);


    public void testDeposerCarte(){

        assertEquals(104,listCarte.getSize());
        listCarte.deposerCarte(55);
        assertEquals(103,listCarte.getSize());
        listCarte.ajouterCarte(1,carte);
        assertEquals(104,listCarte.getSize());

    }
}