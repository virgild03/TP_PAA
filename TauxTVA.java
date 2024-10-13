public enum TauxTVA {
    NORMAL(20),
    INTERMEDIAIRE(10),
    REDUIT(5.5),
    PARTICULIER(2.1);

    private final double valeur;

    TauxTVA(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }
}
