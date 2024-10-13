
package up.mi.jgm.tp4;


public class TestFigures {
    public static void main(String[] args) {
        Disque d = new Disque(new Point(3.5, 4), 4);
        Losange l = new Losange(new Point(0, 0),
                                new Point(2, 0),
                                new Point(2, 2),
                                new Point(0, 2));
        System.out.println(d);
        System.out.println(l);
        Vecteur v = new Vecteur(new Point(2, 2), new Point(3, 3));
        System.out.println(d.translation(v));
        System.out.println(l.translation(v));
    }
}
