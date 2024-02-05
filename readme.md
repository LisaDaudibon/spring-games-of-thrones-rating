# Games of thrones Rating API

Based on the Games of Thrones API : [An API of Ice And Fire](https://github.com/joakimskoog/AnApiOfIceAndFire)  
Test the API [Here](https://anapioficeandfire.com/)

## Dependencies : 
- Spring Starter Web
- Spring Starter Test
- Spring Starter Hibernate Validator
- Swagger UI
- Lombok
- DataFaker

## Specs
### 1. Créer le premier Endpoint
Créer un endpoint `/books` dans un `BookController` pour récupérer tous les livres.

### 2. Créer un model Books
Créer un model `Book` pour permettre de récupérer les données qui nous intéressent comme `name`, `author`, `isbn`, `number of pages`, `publisher` et `country`. Créer autant de models que nécessaire.

### 3. Créer un controller et un modèle User
Créer un controller `UserController` qui va permettre de gérer des utilisateurs avec un attribut `id` et `name` qui seront prédéfini dans un modèle. Implémenter un CRUD complet sur ce controller

### 4. Mock des données utilisateurs
Créer un dossier Mock et utiliser datafaker pour mocker des données. 

### 5. Créer des tests pour le controller User
Créer des tests pour valider les méthodes du `UserController`.

### 6. Implémenter des validations
Vérifier que le nom est bien rempli pour la méthode Add et Update.

### 7. Gérer les exceptions et les codes HTTP
Rajouter une gestion des codes HTTP (CREATED for Add et update par exemple) et une gestion des exceptions/cas d'erreur

### 8. Permettre de rajouter un commentaire sur chaque livre
Implémenter un CRUD qui permette de rajouter un commentaire et un avis sur 10 sur chaque livre. Les avis seront liés aux utilisateurs et aux livres qu'ils concernent.  

  
### Optionnel
#### I. Créer un controller Character
Créer un endpoint `/characters` dans un `CharacterController` pour récupérer tous les livres et ajouter des paramètres optionnels `page`, `pageSize` et `culture` pour permettre de gérer la taille de liste retournée.

#### II. Créer un model Character
Créer un model `Character` pour permettre de récupérer les données des personnages de Games of Thrones qui nous intéressent comme `name`, `gender`, `culture`, `aliases`, `tvseries` et `playedBy`. Créer autant de models que nécessaire.
