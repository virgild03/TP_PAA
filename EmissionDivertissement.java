
package up.mi.jgm.tp4.exo3;


public class EmissionDivertissement extends Programme {
    
    private String presentateur;
    private String nom;
    
    public EmissionDivertissement(String p, String nom, Heure d){
        this.heureDebut = d;
        this.heureFin = d;
        this.heureFin.heure += 2;
    }
    
}
