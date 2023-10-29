public class Compteur {
    // Attributs
    int valeur;
    
    // Constructeur
    public Compteur(int valeur) {
        this.valeur = valeur;
    }

    // Méthodes
    Compteur incrementer() {
        valeur++;
        return this;
    }

    public int getValeur() {
        return valeur;
    }
}
