import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by RAPH on 16/11/2014.
 */
public class ListCarte {

    List<Carte> liste;

    public ListCarte(int nombreDeCarte) {
        liste = new ArrayList<Carte>();

        for (int i=1 ; i<=nombreDeCarte ; i++){
            liste.add(new Carte(i));
        }
    }

    public ListCarte() {
        liste = new ArrayList<Carte>();
    }

    public Carte deposerCarte(int index) {

        return liste.remove(index);
    }

    public int getSize() {
        return liste.size();
    }

    public void melangerCarte(){

        Collections.shuffle(liste);
    }

    public void print(){
        for (int i = 0 ; i<liste.size();i++ ){
            System.out.print(liste.get(i).getPtPenalite());
        }
    }

    public void ajouterCarte(int index, Carte carte) {
        liste.add(index,carte);
    }
    public void ajouterCarte(Carte carte) {
        liste.add(carte);
    }
}
