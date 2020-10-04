# LibraryPartition

## Description 
Cette librairie permet de partitionner une liste en sous-liste de taille prédéfinie.
Elle contient une fonction partition prenant en paramètre une liste d'entiers et un entier "taille".
Elle retourne une liste contenant des sous-listes avec "taille" éléments.
```java
MyLibrary.partition(Arrays.asList(1,2,3,4,5), 2);
//Retourne un List<List<Integer>> avec chaque sous-liste ayant une taille maximum de 2
//Résultat : [[1,2],[3,4],[5]]
```
## Comment utiliser cette librairie dans mon projet?
Récupérer le projet LibraryPartition en téléchargeant l'archive ou en clonant ce repository.

    git clone https://github.com/kilick93/LibraryPartition.git

Compiler le jar avec la commande 

    mvn package

Importer le jar créé dans votre projet pour avoir accès à la fonction "partition".

Pour appeler la fonction : 
```java
MyLibrary.partition(Arrays.asList(1,2,3,4,5), 2);
```
