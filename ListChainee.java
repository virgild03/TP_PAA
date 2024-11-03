

public class ListChainee<E> {

    Noeud<E> premier;

    public ListChainee(Noeud<E> premier) {
        this.premier = premier;
    }

    public void add(E valeur) {
        Noeud<E> nouveauNoeud = new Noeud<>(valeur);
        if (premier == null) { // Si la liste est vide
            premier = nouveauNoeud;
        } else {
            Noeud<E> actuel = premier;
            while (actuel.getSuivant() != null) { // Parcours jusqu'au dernier nœud
                actuel = actuel.getSuivant();
            }
            actuel.setSuivant(nouveauNoeud) ; // Ajout du nouveau nœud à la fin
        }
    }
}
