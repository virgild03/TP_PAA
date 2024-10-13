
package up.mi.jgm.tp4.exo3;


public class Reportage {

    

    private Theme theme;  
    private String nom;
    
    public enum Theme {
        HISTOIRE, ACTU, CULTURE
    }
    // Constructeur
    public Reportage(Theme theme, String nom) {
        this.theme = theme;
        this.nom = nom;
    }
}
