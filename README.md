# Application d'Inscription à une Formation

## Description
Cette application Android permet aux utilisateurs de s'inscrire à une formation via une interface mobile simple. L'utilisateur saisit ses informations personnelles dans un formulaire, puis en cliquant sur le bouton *Envoyer*, il est redirigé vers une nouvelle activité qui affiche un récapitulatif des informations saisies.

## Objectifs de l'exercice :
1. Créer une interface utilisateur permettant aux utilisateurs de saisir leurs informations personnelles dans un formulaire.
2. Rediriger l'utilisateur vers une autre activité qui affiche un récapitulatif des informations saisies après avoir cliqué sur le bouton *Envoyer*.

## Fonctionnalités
- Un *formulaire* avec les champs suivants :
  - *Nom*
  - *Prénom*
  - *Adresse email*
  - *Téléphone*
  - *Formation choisie* (sous forme de champ texte ou de liste déroulante)
  - *Date de naissance*
- Un *bouton Envoyer* qui redirige vers une nouvelle activité.
- Une nouvelle activité qui affiche le *récapitulatif des données saisies* par l'utilisateur.

## XML pour l'interface graphique

L'interface utilisateur est définie dans un fichier XML, qui comprend :
- Des *EditText* pour permettre à l'utilisateur de saisir son nom, prénom, adresse email, numéro de téléphone, et date de naissance.
- Un *Spinner*  pour permettre à l'utilisateur de choisir une formation parmi une liste de formations disponibles.
- Un *Button* nommé *Envoyer*, qui soumet les informations et redirige vers l'activité de récapitulatif.

## Java pour la logique

1. *Récupération des données saisies :*
   - Lorsque l'utilisateur remplit le formulaire et clique sur le bouton *Envoyer, les données saisies sont collectées et envoyées à la nouvelle activité via une **Intent*.

2. *Affichage des données dans la nouvelle activité :*
   - La nouvelle activité reçoit les données transmises via l'Intent et les affiche dans des *TextView* pour offrir un récapitulatif des informations saisies par l'utilisateur.



## Technologies utilisées
- *Langage* : Java (Android SDK)
- *Interface utilisateur* : XML (pour la mise en page Android)
- *Plateforme* : Android

## Instructions d'installation
1. Clonez ce dépôt GitHub.
2. Ouvrez le projet dans Android Studio.
3. Exécutez l'application sur un émulateur Android ou un appareil physique.

## Utilisation
1. Remplissez le formulaire d'inscription avec vos informations personnelles.
2. Cliquez sur *Envoyer* pour voir le récapitulatif de vos informations dans une nouvelle activité.
## Video demonstratif
https://github.com/user-attachments/assets/c5b3fe87-a66f-485b-a7b5-5bcbf1094143
