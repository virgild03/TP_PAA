
package up.mi.jgm.tp4;


public class Losange extends Quadrilatere {
    
    
    public Losange(Point s1, Point s2, Point s3, Point s4){
        super(s1, s2, s3, s4);
    }
    
    @Override
    public double surface() {
        // Implémentation du calcul de la surface du losange
        double diagonale1 = sommet1.distance(sommet3);
        double diagonale2 = sommet2.distance(sommet4);
        return 0.5 * diagonale1 * diagonale2;
    }
    
    @Override
    protected Quadrilatere creerQuadrilatere(Point s1, Point s2, Point s3, Point s4){
        
        return new Losange(sommet1, sommet2, sommet3, sommet4 );
    }
    
    @Override
    public String toString() {
        return "Losange[sommet1=" + sommet1 + ", sommet2=" + sommet2 + 
                ", sommet3=" + sommet3 + ", sommet4=" + sommet4 + "]";
    }
    
}
