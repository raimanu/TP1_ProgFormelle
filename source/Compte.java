public class Compte {
    // Attributs
    private int solde = 0;
    private String nom;

    // Constructeur
    public Compte(String nom, int solde) {
        this.nom = nom;
        this.solde = solde;
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
