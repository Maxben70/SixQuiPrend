import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestUnitJeu {

    //A l'avenir, listeJoueur sera initialiser dans la classe Partie.
    // nbJoueurs représentera la longueur de la liste
    List<Joueur> listeJoueurs = new ArrayList<Joueur>();
    int nbjoueurs=3;

    for(int i=0 ; i<3 ; i++)
    {
        listeJoueurs.add(new Joueur("joueur"+i));
    }
    //---------------------------------------------------------------

}
