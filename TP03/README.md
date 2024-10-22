# Introduction
## Spring Data JPA
Spring Data JPA simplifie l'accès aux bases de données en offrant une abstraction au-dessus de JPA. Il permet de créer des interfaces de repositories pour effectuer des opérations CRUD sans écrire de code SQL. Cela facilite la gestion des données et améliore la productivité.

## Hibernate
Hibernate est une implémentation de JPA qui assure le mapping objet-relationnel (ORM). Il permet de mapper des objets Java à des tables de base de données, générant automatiquement les requêtes SQL. Hibernate gère aussi les transactions et le cache des données.

## Services dans Spring Boot
Les services, contiennent la logique métier d'une application. Ils interagissent avec les repositories pour manipuler les données et isolent la logique métier des autres couches comme les contrôleurs ou les repositories.

# Project Structure
<img src="./screenshots/structure.png"/>

# Entity
<img src="./screenshots/entity.png"/>

# Repositorie
<img src="./screenshots/Repo.png"/>

# Service
<img src="./screenshots/Service.png"/>

# Application properties
<img src="./screenshots/app.prop.png"/>

# Testing
## select all products
<img src="./screenshots/get.png"/>

## Select product by id
<img src="./screenshots/get2.png"/>

## Select product by name
<img src="./screenshots/get3.png"/>

## Select product where price greater than a num
<img src="./screenshots/get4.png"/>

## Add a product
<img src="./screenshots/post.png"/>

