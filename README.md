# TP1_ProgFormel
 Exercice 2.1.1 :

 Question 1 :
 La méthode virerVers(int montant, Compte destination) utilise la méthode retirer(int montant), 
 pour retirer du compte actuel (le compte utilisant la méthode) le montant en paramètre, 
 et ensuite rajouter ce montant dans le compte 'destination'.

 Elle fait intervenir 2 comptes

 Exercice 2.1.2 constructeurs
 
 Question 3 :
 Oui, il faut prévoir des méthodes permettant de changer le nom d'un compte.
 Il est souvent nécessaire.

 Exercice 2.1.3 : méthodes statiques ou non
 Dans la classe suivante, les méthodes pouvant être statiques 
 sont les méthodes qui ne font pas intervenir d'objet, donc les méthodes :

 void afficher();
 La fonction afficher() utilise Terminal.ecrireString() qui est une méthode statique.

 nouveau(int n); 
 Nouveau créer un objet de la classe, il n'est donc pas néccessaire de créer un objet pour l'utiliser.

 Exercice 2.1.4 : Egalité
 Je déduis que :
 1er if : renvoie qu'ils sont identiques, car c3 pointe vers le même objets que c1
 2eme if : renvoie qu'ils ne sont pas identiques
 3eme if : renvoie qu'ils ne sont pas identiques, car ils ne sont pas le même objet.
 4eme if : renvoie qu'ils ne sont pas identiques, car ils n'ont pas la même valeur
 5eme if : renvoie qu'ils ne sont pas identiques, car ils n'ont pas la même valeur

 Malgré que c1 et c1.incrementer() sont différents par leur variable valeur,
 ils sont identiques car ils pointent vers le même objet.

 Exercice 2.1.5 : Conception

Question : quelles classes faut-il créer ? Quelles informations faut-il dans chaque classe ? 

Il faut créer une classe bar, une classe Bouteille, une classe Shaker, une classe Recette et une classe Cocktail. 

Quelles méthodes faut-il écrire, et dans quelle classe les mettre ? Pour chaque méthode, précisez le type des paramètres et de la valeur de retour.

Les méthodes de types setters et getters sont considérés comme créé par défaut.

Dans la classe bar, il y aura la quantité de bouteille et de shaker.
Il y aura les méthodes :
- void ajouterBouteille(Bouteille bouteille) qui permet d'ajouter une bouteille au bar.
- void ajouterShaker(Shaker shaker) qui permet d'ajouter un shaker au bar.
- void retirerBouteille(Bouteille bouteille) qui permet de retirer une bouteille au bar.
- void retirerShaker(Shaker shaker) qui permet de retirer un shaker au bar.

Dans la classe Bouteille, il y aura la quantité de liquide dans la bouteille.
Ce qu'il y a dedans aussi, si c'est un alcool, un soda ou un jus de fruit.
Il y aura les méthodes :
- void verserDansShaker(int quantite, Shaker shaker) qui permet de verser le liquide dans le shaker.
- void jetter() qui permet de jeter la bouteille, qui utilisera la méthode retirerBouteille(Bouteille bouteille).

Dans la classe shaker, il y aura la quantité de liquide dans le shaker.
Il y aura aussi la contenance du shaker.
Il y aura les méthodes :
- void secouer() qui permet de secouer le shaker.
- void vider() qui permet de vider le shaker.
- void laver() qui permet de laver le shaker.
- Cocktail verserDansVerre(Recette recette, int quantite) qui permet de verser le liquide dans le verre, pour créer le ou les cocktails.

Dans la classe Recette, il y aura les proportions de chaque liquide pour faire le cocktail. La classe sera utilisée pour faire un cocktail.
Il y aura les méthodes :
- void modifierProportion(int quantite, String liquide) qui permet de modifier la proportion d'un liquide dans la recette.

Dans la classe Cocktail, il y aura le nom du cocktail,
qui permettra de savoir les cocktails qui sont créés.
Il y aura les méthodes :
- void boire() qui permet de boire le cocktail.
- void jeter() qui permet de jeter le cocktail.
