Nom Etudiant 1: REGNARD Mathieu

Nom Etudiant 2: MARCHAND Simon

Qu'est ce qu'un test boite noire ?
> Un test boite noire est un test qui vérifie une fonctionalité sur une classe sans connaître 
l'implémentation de la classe.

Qu'est ce qu'un test boite blanche ?
> Un test boite blanche au contraire, connait la structure interne d'une fonctionalité et va tester précisement cette structure.

Comment pourriez vous définir l'approche TDD ? Comment avez-vous travaillé ? Qu'en pensez-vous ?
> L'approche TDD demande de créer un test pour une fonctionalité avant de l'implémenter. Ensuite, on construit la fonctionalité 
de sorte à faire passer les tests. Tant que les tests ne passent pas, on continue de coder. Enfin, on peut faire des grosses modifications dans le code pour refactor et améliorer sans avoir peur de break le projet.
Nous avons travaillé exactement comme ça et nous pensons que c'est la meilleure méthode pour la programmation. Les tests prennent un peu de temps au début mais permettent de gagner énormement de temps dans le dévoloppement du projet. De plus cela permet de montrer un 
exemple d'utilisation du code. Les tests peuvent donc servir de documentation.

Qu'apporte l'usage de tests dans cet exercice ?
> Cet exercice demande de créer des régles sur les entiers naturels, en prenant en compte le fait qu'une nouvelle règle va surcharger les anciennes règles. Sans tests, c'est exercice est rapidement faux et nous aurait fait perdre beaucoup de temps pour régler les soucis. (Surtout à la fin avec le switch de règle).

Si on a la volonté de faire des tests unitaires, cette situation est-elle normale ? Pourquoi ?
> Cette situation est normale car certaines fois le code n'est pas le notre (librairie tierce, pull requests ect..) et les tests dépendent d'implémentations sur des fonctionalités non testés. Par soucis de simplicité, on suppose que les librairies sont testées et valides afin de ne pas passer sa vie à tester. Cependant, les tests pour des classes ayant des dépendances internes ne devraient pas dépendre de ces implémentations. Pour cela, il est possible de mocker des classes afin de tester séparèment chaque fonctionalité. Cela rends les tests indépendants ce qui est primordial pour pouvoir lancer tous les tests en même temps sans avoir à les ordonner. 

Mockito permet de faire ici trois choses, lesquels ?
> Mock, Stub et Spy.
Le mock permet de simuler les instances d'une classe pour pouvoir l'utiliser dans le test. 
Le stub va permettre de forcer la valeur de retour d'une méthode afin de tester son utilisation dans la classe courante. 
Le spy va pouvoir vérifier si une méthode est appelée et combien de fois. On peut par exemple s'assurer qu'une fonction de log est bien appelée.
