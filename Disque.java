
package up.mi.jgm.tp4;


public class Disque extends Figure{
    
    private Point centre;
    private double rayon;
    
    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    
    @Override
    public double perimetre(){
        return 2 * Math.PI * rayon;
    }
    @Override
    public double surface(){
        return Math.PI * rayon;
    }
    
    @Override
    public Figure translation(Vecteur v) {
        Point nouveauCentre = new Point(
            centre.getAbscisse() + v.getCible().getAbscisse() - v.getOrigine().getAbscisse(),
            centre.getOrdonnee() + v.getCible().getOrdonnee() - v.getOrigine().getOrdonnee()
        );
        return new Disque(nouveauCentre, rayon);
    }
}
