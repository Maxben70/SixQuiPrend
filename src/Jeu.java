import java.util.ArrayList;
import java.util.List;

public class Jeu {

    public List listeJoueur;
    public Deck deck;

    public Jeu(ArrayList<Joueur> listeJoueurs, int nbCartes) {
        listeJoueur=listeJoueurs;
        deck = new Deck(nbCartes);

    }
}
