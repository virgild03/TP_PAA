
package up.mi.jgm.tp4;


public abstract class Quadrilatere extends Figure {
    
    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;
    
    public Quadrilatere(Point s1, Point s2, Point s3, Point s4) {
        this.sommet1 = s1;
        this.sommet2 = s2;
        this.sommet3 = s3;
        this.sommet4 = s4;
    }
    
    @Override
    public abstract double surface();
    
    @Override
    public double perimetre() {
        return sommet1.distance(sommet2) +
               sommet2.distance(sommet3) +
               sommet3.distance(sommet4) +
               sommet4.distance(sommet1);
    }
    
}
