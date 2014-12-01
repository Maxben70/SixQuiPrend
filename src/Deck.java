
public class Deck extends ListCarte{

    public Deck(int nombreDeCarte) {
        super(nombreDeCarte);
    }

    public int getDeckSize(){
        return super.getSize();
    }

    public Carte distribuer(int index) { return super.deposerCarte(index); }

    public void melangerDeck(){
        super.melangerCarte();
    }

    public void printDeck(){
        System.out.println("Affichage du deck");
        super.print();
    }
}
