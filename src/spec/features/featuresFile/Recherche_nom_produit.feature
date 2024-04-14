@productname
Feature: Recherche nom produit
  ETQ utilisateur je souhaite chercher le nom du produit

  @productName
  Scenario: Je souhaite chercher le nom du produit
 Given je visite l'application NopCommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le login "admin"
    And je clique sur le bouton login
    Then je me redirige vers la page home
    When Je clique sur Catalog
    And Je clique sur Products
    And Je saisis le nom du produit "parfum"
    And Je clique sur le bouton search
