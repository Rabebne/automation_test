
@authentification
Feature: Authentification
  ETQ utilisateur je souhaite m'authentifier

  @login-valide
  Scenario: je souhaite tester la page LOGIN
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le login "admin"
    And je clique sur le bouton login
    Then je me redirige vers la page home
    

  @login-invalide
  Scenario: Je souhaite tester la page LOGIN
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "sawssen@yourstore.com"
    And Je saisis le login "sawssen"
    And Je clique sur le bouton Login
    Then Je verifie le message d'erreur