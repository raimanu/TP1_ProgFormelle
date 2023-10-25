public class TesteCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte("Jean", 1000);
        Compte compte2 = new Compte("Pierre", 500);
        compte1.deposer(500);
        compte2.deposer(1000);
        compte2.retirer(10);
        compte1.virerVers(75, compte2);
        compte1.afficher();
        compte2.afficher();
        
        //Question 3 :
        Compte[] comptes = new Compte[10];
        for (int i = 0; i < 10; i++) {
            comptes[i] = new Compte("Compte " + (i+1), 0);
        }
        //Déposer 200 euros plus une somme égale à 100 fois l'indice du compte
        for (int i = 0; i < comptes.length; i++) {
            comptes[i].deposer(200 + 100 * i);
        }
        //Faire un virement de 20 euro pour chaque compte suivant le compte dans le tableau
        for (int i = 0; i < comptes.length - 1; i++) {
            for (int j = i; j < comptes.length - 1; j++){
                comptes[i].virerVers(20, comptes[j+1]);
            }
        }

        //Afficher le solde de chaque compte
        for (int i = 0; i < comptes.length; i++) {
            comptes[i].afficher();
        }
    }
}
