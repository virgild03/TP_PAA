
package up.mi.jgm.tp4.exo2;


public class DVD extends Produit {
    private String titre;
    private String realisateur;

    public DVD(String titre, String realisateur, double prixHT) {
        super(prixHT, TauxTVA.NORMAL); // TVA normale pour un DVD
        this.titre = titre;
        this.realisateur = realisateur;
    }

   
    public String getDescription() {
        return "DVD: " + titre + ", Réalisateur: " + realisateur;
    }
}
