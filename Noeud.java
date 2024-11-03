
// Classe générique Noeud qui représente un nœud dans une liste chaînée
public class Noeud<E> {
    private E valeur;           // La valeur de type générique E stockée dans le nœud
    private Noeud<E> suivant;   // Référence vers le nœud suivant

    // Constructeur pour initialiser la valeur et le nœud suivant
    public Noeud(E valeur) {
        this.valeur = valeur;
        this.suivant = null; // Par défaut, le nœud suivant est null
    }

    // Getter pour la valeur du nœud
    public E getValeur() {
        return valeur;
    }

    // Setter pour la valeur du nœud
    public void setValeur(E valeur) {
        this.valeur = valeur;
    }

    // Getter pour le nœud suivant
    public Noeud<E> getSuivant() {
        return suivant;
    }

    // Setter pour le nœud suivant
    public void setSuivant(Noeud<E> suivant) {
        this.suivant = suivant;
    }
}
