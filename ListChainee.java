// Classe générique ListChainee qui représente une liste chaînée
public class ListChainee<E> {

    private Noeud<E> premier; // Référence vers le premier nœud de la liste

    // Constructeur pour initialiser une liste vide
    public ListChainee() {
        this.premier = null;
    }

    // Méthode pour ajouter un élément à la fin de la liste
    public void add(E valeur) {
        Noeud<E> nouveauNoeud = new Noeud<>(valeur);
        if (premier == null) { // Si la liste est vide
            premier = nouveauNoeud;
        } else {
            Noeud<E> actuel = premier;
            while (actuel.getSuivant() != null) { // Parcours jusqu'au dernier nœud
                actuel = actuel.getSuivant();
            }
            actuel.setSuivant(nouveauNoeud); // Ajout du nouveau nœud à la fin
        }
    }

    // Méthode pour obtenir le nœud à l'indice spécifié
    public Noeud<E> get(int index) {
        if (index < 0) return null;
        Noeud<E> actuel = premier;
        int compteur = 0;
        while (actuel != null) {
            if (compteur == index) {
                return actuel;
            }
            actuel = actuel.getSuivant();
            compteur++;
        }
        return null; // Si l'indice est hors des limites
    }

    // Méthode pour insérer un élément à une position donnée
    public void insert(int index, E valeur) {
        Noeud<E> nouveauNoeud = new Noeud<>(valeur);
        if (index <= 0 || premier == null) { // Insertion en tête si l'indice est <= 0 ou si la liste est vide
            nouveauNoeud.setSuivant(premier);
            premier = nouveauNoeud;
        } else {
            Noeud<E> actuel = premier;
            int compteur = 0;
            while (actuel != null && compteur < index - 1) { // Parcours jusqu'à la position
                actuel = actuel.getSuivant();
                compteur++;
            }
            if (actuel == null) {
                System.out.println("Erreur : Indice hors des limites");
            } else {
                nouveauNoeud.setSuivant(actuel.getSuivant());
                actuel.setSuivant(nouveauNoeud);
            }
        }
    }

    // Méthode pour supprimer un élément à une position donnée
    public void remove(int index) {
        if (index < 0 || premier == null) {
            System.out.println("Erreur : Indice hors des limites ou liste vide");
            return;
        }
        if (index == 0) { // Suppression du premier élément
            premier = premier.getSuivant();
        } else {
            Noeud<E> actuel = premier;
            int compteur = 0;
            while (actuel.getSuivant() != null && compteur < index - 1) {
                actuel = actuel.getSuivant();
                compteur++;
            }
            if (actuel.getSuivant() == null) {
                System.out.println("Erreur : Indice hors des limites");
            } else {
                actuel.setSuivant(actuel.getSuivant().getSuivant()); // Suppression de l'élément
            }
        }
    }

    // Méthode pour afficher la liste sous forme de chaîne de caractères
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noeud<E> actuel = premier;
        while (actuel != null) {
            sb.append(actuel.getValeur()).append(" → ");
            actuel = actuel.getSuivant();
        }
        sb.append("FIN");
        return sb.toString();
    }

    // Méthode principale pour tester la liste chaînée
    public static void main(String[] args) {
        ListChainee<String> liste = new ListChainee<>();
        liste.add("premier");
        liste.add("deuxième");
        liste.add("troisième");
        System.out.println(liste); // Affiche : premier → deuxième → troisième → FIN

        liste.insert(1, "nouveau"); // Insère "nouveau" à l'indice 1
        System.out.println(liste); // Affiche : premier → nouveau → deuxième → troisième → FIN

        liste.remove(2); // Supprime l'élément à l'indice 2
        System.out.println(liste); // Affiche : premier → nouveau → troisième → FIN

        System.out.println(liste.get(1).getValeur()); // Affiche : nouveau
    }
}
