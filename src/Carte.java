/**
 * Created by RAPH on 16/11/2014.
 */
public class Carte {

    private int valeur;
    private int ptPenalite;

/*

Chaque carte comporte 1, 2, 3, 5 ou 7 tˆetes de taureau. La r´epartition se fait comme suit :
• 2 ”bˆetes `a cornes” pour les cartes ayant un num´ero se terminant pas 5 (hormis le 55)
• 3 ”bˆetes `a cornes” pour les cartes ayant un num´ero se terminant pas 0
• 5 ”bˆetes `a cornes” pour les cartes ayant un num´ero double (11, 22, 33...) (hormis 55)
• 7 ”bˆetes `a cornes” pour la carte 55 (cumule double et 5)
• 1 ”bˆete `a corne” pour les autres

 */
    public Carte(int val) {
        valeur=val;
        ptPenalite=attribuerPtPenalite();
    }

    public int attribuerPtPenalite() {
        if ((valeur % 10 == 5) && (valeur != 55))
            return 2;

        if (valeur % 10 == 0)
            return 3;

        if ((valeur % 11 == 0) && (valeur != 55))
            return 5;

        if (valeur == 55)
            return 7;

        return 1;
    }

    public int getPtPenalite(){
        return ptPenalite;
    }

}
