public class Exo12_4 {
    public static void main(String[] args) {
        Compteur c1,c2,c3;
        c1 = new Compteur(0);
        c1.incrementer();
        c2 = new Compteur(1);
        c3=c1;
        //c3 pointe sur le même objet que c1 
        if (c1==c3) {
            System.out.println("c1 et c3 sont identiques");
        } else {
            System.out.println("c1 et c3 sont différents");
        }
        if(c1.getValeur()==c2.getValeur()) {
            System.out.println("c1 et c2 ont la même valeur");
        } else {
            System.out.println("c1 et c2 n'ont pas la même valeur");
        }
        if(c1==c2) {
            System.out.println("c1 et c2 sont identiques");
        } else {
            System.out.println("c1 et c2 sont différents");
        }
        if(c1.getValeur()==c1.incrementer().getValeur()) {
            System.out.println("c1 et c1.incrementer() ont la même valeur");
        } else {
            System.out.println("c1 et c1.incrementer() n'ont pas la même valeur");
        }
        if(c1==c1.incrementer()) {
            System.out.println("c1 et c1.incrementer() sont identiques");
        } else {
            System.out.println("c1 et c1.incrementer() sont différents");
        }
    }
}