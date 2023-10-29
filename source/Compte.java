public class Compte {
    // Attributs
    private String nom;
    private int solde = 0;
    

    // Constructeur
    public Compte(String nom) {
        this.nom = nom;
    }

    // Méthodes
    public void deposer(int montant) {
        this.solde += montant;
    }

    public void retirer(int montant) {
            this.solde -= montant;
    }

    public void virerVers(int montant, Compte destination) {
        this.retirer(montant);
        destination.deposer(montant);
    }

    public void afficher() {
        System.out.println("Solde du compte " + nom + " : " + this.solde);
    }
}
