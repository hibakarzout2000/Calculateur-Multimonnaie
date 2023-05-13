# Calculateur Multimonnaie TDD Maven Project

### Arborescence Du Projet Maven "Calculateur Multimonnaie" :

<p align="center">
 <img  src="https://github.com/MohamedSelimMaazouz993/calculateur-multimonnaie-TDD-project/assets/71633887/9825e7bb-d1e7-454e-9a9f-97c58bafb610">
</p>
<h6 align="center" > Vue Arborescence Du Projet  </h6>

###  Classe Calculateur : 

<p align="center">
 <img  src="https://github.com/MohamedSelimMaazouz993/calculateur-multimonnaie-TDD-project/assets/71633887/d3ec23e8-a075-4aa1-842b-fcbb31dd01cf">
</p>
<h6 align="center" > Classe Calculateur </h6>

- La classe `Calculateur` contient une variable d'instance `tauxDeChange` de type `Map<Monnaie, Double>` pour stocker les taux de change entre différentes devises.
- Le constructeur de la classe initialise la variable `tauxDeChange` avec une nouvelle instance de `HashMap`.
- La méthode `setTauxDeChange()` permet de définir les taux de change entre différentes devises. Elle prend en paramètre un objet de type `Monnaie` qui représente la devise et un taux de change de type `double`. Cette méthode ajoute le taux de change à la variable `tauxDeChange` en utilisant la devise comme clé.
- La méthode `convertir()` permet de convertir un montant d'une devise source vers une devise cible. Elle prend en paramètres le montant à convertir de type `double`, la devise source de type `Monnaie` et la devise cible de type `Monnaie`.
 Cette méthode récupère les taux de change correspondants à la devise source et à la devise cible à partir de la variable `tauxDeChange`, puis effectue le calcul de conversion en utilisant la formule `(montant * tauxCible) / tauxSource`, où `tauxCible` est le taux de change de la devise cible et `tauxSource` est le taux de change de la devise source. La méthode retourne le montant converti.
- la classe `Calculateur` permet de définir les taux de change entre différentes devises à l'aide de la méthode `setTauxDeChange()` et d'effectuer des conversions de devises à l'aide de la méthode `convertir()`.


###  Classe Monnaie  : 

<p align="center">
 <img  src="https://github.com/MohamedSelimMaazouz993/calculateur-multimonnaie-TDD-project/assets/71633887/09d6f88e-0e86-488d-b142-b8bc46e8e075">
</p>
<h6 align="center" > Classe Monnaie </h6>

La classe `Monnaie` est une énumération qui représente les différentes devises disponibles dans le calculateur de conversion. Voici un résumé des éléments clés de cette classe :

- La classe `Monnaie` est définie comme une énumération à l'aide du mot-clé `enum`.
- Elle contient trois valeurs énumérées : `EURO`, `DOLLAR` et `LIVRE_STERLING`, qui représentent respectivement les devises Euro, Dollar et Livre Sterling.
- Chaque valeur énumérée est un identifiant constant qui peut être utilisé pour représenter la devise correspondante dans le calculateur de conversion.

 la classe `Monnaie` fournit une liste prédéfinie des devises disponibles, ce qui permet de spécifier facilement la devise source et la devise cible lors de la conversion dans le calculateur.


###  Classe CalculateurTest :

<p align="center">
 <img  src="https://github.com/MohamedSelimMaazouz993/calculateur-multimonnaie-TDD-project/assets/71633887/48e56e74-3664-4a0b-9698-43d58aafb854">
</p>
<h6 align="center" >  Classe CalculateurTest </h6>


Le fichier `CalculateurTest` contient une classe de test pour la classe `Calculateur` qui vérifie le bon fonctionnement des conversions de monnaie. Voici un résumé des éléments clés de ce fichier :

- La classe `CalculateurTest` est annotée avec `@Test` pour indiquer qu'elle contient des méthodes de test.
- La méthode `setUp()` est annotée avec `@Before` et est exécutée avant chaque méthode de test. Elle crée une instance de la classe `Calculateur` et configure les taux de change pour différentes monnaies.
- Chaque méthode de test est annotée avec `@Test` et contient les étapes suivantes :
  1. Écrire un test simple en appelant la méthode `convertir()` de l'instance de `Calculateur` avec des paramètres spécifiques.
  2. Exécuter le test en vérifiant le résultat attendu à l'aide de la méthode `assertEquals()` de la classe `Assert`. Cette méthode compare la valeur retournée par la conversion avec la valeur attendue, en spécifiant une marge d'erreur de 0.001.

Le fichier `CalculateurTest` contient actuellement trois méthodes de test : `testConversionEuroVersDollar()`, `testConversionDollarVersEuro()` et `testConversionEuroVersLivreSterling()`. Chacune de ces méthodes teste une conversion spécifique et vérifie si le résultat de la conversion correspond au résultat attendu avec une précision de 0.001.

Cependant, il y a des erreurs dans les résultats attendus des tests `testConversionEuroVersDollar()` et `testConversionDollarVersEuro()`. Vous devrez ajuster les valeurs attendues en fonction des taux de change et des conversions que vous souhaitez tester.


###  Comment Lancer Le Test : 

<p align="center">
 <img  src="https://github.com/MohamedSelimMaazouz993/calculateur-multimonnaie-TDD-project/assets/71633887/10d8f3dd-684b-42c4-8542-ce01c830ff7d">
</p>
<h6 align="center" >  Comment Lancer Le Test </h6>


### Resultat de Test  : 

<p align="center">
 <img  src="https://github.com/MohamedSelimMaazouz993/calculateur-multimonnaie-TDD-project/assets/71633887/c5cc0ebd-3ee4-455f-a4eb-725d862131bf">
</p>
<h6 align="center" >  Junit Test Resultat </h6>
