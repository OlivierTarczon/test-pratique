# Test pratique de Connexence

Notre client (fictif), une société de protection des animaux, nous a demandé d'ajouter des fonctionnalités à son application web.

Actuellement, la page peut afficher une liste de chattons. Afin de faciliter leur travail, ils souhaiteraient pouvoir ajouter les nouveaux chattons dans la liste.

# Fonctionnement

Pour faire le test, nous recommandons l'utilisation de l'IDE Eclipse, mais il ne s'agit pas d'un requis.

Le projet est développé en Java 11. Ce dernier devra être installé sur votre environnement de travail.

Pour importer, copier l'url du répertoire en cliquant sur le bouton vert 'Code' ci-haut.

Dans Eclipse, sous `File` > `Import...`, rechercher `Projects from Git`, puis `Clone URI`. Coller l'URL du répertoire dans le champ `URI`. Suivre les étapes de l'assistant pour terminer l'importation du projet.

Une fois l'importation terminée, cliquer droit sur le projet, puis sous `Configure`, cliquer sur `Convert to Maven Projet`.

Pour lancer le serveur, on peut soit 'Run' la classe TestPratiqueApplication, ou utiliser le 'maven wrapper' en lançant la commande `./mvnw spring-boot:run` dans le répertoire du projet.

Une fois le serveur lancé, il est possible d'accéder à la page web à l'adresse `http://localhost:8080`. 

# Précisions

Si vous avez besoin d'aide pour une quelconque raison, n'hésiter pas à nous contacter.

Pour ce test, tous les travaux 'frontend' sont déjà effectués. Ne pas modifier les fichiers de ce volet (soit index.html, main.js et style.css).

Aucunes restrictions sur les ressources (en ligne ou hors ligne) que l'on peut utiliser.

**Le résultat de vos travaux doit être remis sous la forme d'un répertoire git hébergé sur github afin que nous puissions valider.**

La pondération se fera en fonction des points suivants, dans cet ordre:

- Respect des critères;
- Qualité du code;
- Temps nécessaire pour effectuer la tâche

# Critères

Le formulaire est déjà présent et fonctionnel dans la page, votre tâche consiste alors à développer le service web pour accueillir les chattons!

Le serveur web contenu dans ce répertoire est développé avec les technologies suivantes:

- Spring Boot
- Maven
- H2 (Base de données en mémoire)
- Vue.JS
- Axios 

Il faudra donc maintenir ces technologies et simplement ajouter le service web et les champs nécessaires pour répondre au critère.

Pour répondre aux demandes du client, il faudrait remplir les points suivants:

- Ajouter un service web pour l'ajout de nouveaux chattons, il doit s'agir d'un `POST` avec le chemin `/chattons`;
- Ajouter un champ en base de données dans lequel on pourra stocker une description du chatton, le champ doit se nommer `description`;
- Valider la saisie des champs au niveau de l'API REST, et retourner un statut 400 si les valeurs ne conviennent pas;
- Ne pas autoriser les chattons de plus de 30 ans;
- Ne pas autoriser les chattons sans nom (le champ 'nom' doit être renseigné et non vide);
- Inverser la liste des chattons pour que le plus récent soit en premier, **ne pas trier à la récupération en BD, manuellement inverser la liste reçue**
- Filtrer la liste des chattons pour exclure les chattons qui ont plus de 15 ans, **ne pas filtrer la requête en BD, exclure manuellement de la liste reçue**
