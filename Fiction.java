
package up.mi.jgm.tp4.exo3;


public class Fiction extends Programme {
    
    private String titre;
    private String nomReal;
    private boolean rediffusion;
    
    
    public Fiction(String t, String nr, boolean r, Heure d, Heure f){
        this.heureDebut = d;
        this.heureFin = f;
        this.titre = t;
        this.nomReal = nr;
        this.rediffusion = r;
    }
}
