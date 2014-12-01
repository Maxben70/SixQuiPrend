import java.util.ArrayList;

public class Joueur {
    private String name;
    private int points;
    private ListCarte main;
    // un joueur doit posséder des cartes


    public Joueur(String name) {
        this.name = name;
        points = 0;
        main = new ListCarte();    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appendPoints(int points) {
        this.points += points;
    }

    public int getPoints () {
        return points;
    }

}
