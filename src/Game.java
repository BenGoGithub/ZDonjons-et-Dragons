// Classe Game
// Cette classe contient la boucle principale du jeu.
// Elle affiche un menu à l'utilisateur avec plusieurs options : créer un personnage, afficher ses informations,
// modifier ses informations ou quitter le jeu.

// Logique du jeu :
// 1. Initialiser un objet Personnage à null au début, car le joueur n'a pas encore créé de personnage.
// 2. Afficher le menu en utilisant une boucle while (tant que l'utilisateur ne choisit pas de quitter).
// 3. Utiliser un switch-case pour traiter les choix de l'utilisateur.
//    - Si l'utilisateur choisit de créer un personnage, appeler la méthode creerPersonnage.
//    - Si l'utilisateur veut afficher ou modifier un personnage, vérifier d'abord s'il a déjà créé un personnage.
//    - Si l'utilisateur choisit de quitter, sortir de la boucle et terminer le programme.

import java.util.Scanner;

public class Game {

private Personnage personnage;
private Scanner scanner;
private Menu menu;

    // Constructeur de la classe Game
public Game() {
    // Initialisation
    this.scanner = new Scanner(System.in);
    this.personnage = null;
    this.menu = new Menu();
}
public void run() {
    boolean running = true;

    while (running) {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Créer un nouveau personnage");
        System.out.println("2. Afficher les infos du personnage");
        System.out.println("3. Modifier les infos du personnage");
        System.out.println("4. Quitter le jeu");
        System.out.print("Choisissez une option : ");
        // Lit le choix de l'utilisateur sous forme d'entier
        int choix = scanner.nextInt();

        scanner.nextLine();
        // Consomme la ligne vide laissée par nextInt()
        // Cela évite des problèmes de lecture pour les prochaines entrées

        // Switch pour gérer les choix de l'utilisateur
        switch (choix) {
            case 1:
                // Option 1 : Création d'un nouveau personnage
                // Appelle la méthode creerPersonnage de la classe Menu
                // en passant le Scanner pour lire les entrées utilisateur
                personnage = menu.creerPersonnage(scanner);
                break;
            case 2:
                // Option 2 : Affichage des informations du personnage
                if (personnage != null) {
                    // Si un personnage existe, affiche ses informations
                    menu.afficherPersonnage(personnage);
                } else {
                    // Si aucun personnage n'a été créé, affiche un message d'erreur
                    System.out.println("Aucun personnage n'a été créé.");
                }
                break;
            case 3:
                // Option 3 : Modification du personnage existant
                if (personnage != null) {
                    // Si un personnage existe, permet sa modification
                    menu.modifierPersonnage(personnage, scanner);
                } else {
                    // Si aucun personnage n'a été créé, affiche un message d'erreur
                    System.out.println("Aucun personnage n'a été créé.");
                }
                break;
            case 4:
                // Option 4 : Quitter le programme
                running = false; // Met fin à la boucle principale du programme
                System.out.println("Merci d'avoir joué !");
                break;
            default:
                // Gère les choix invalides (non compris entre 1 et 4)
                System.out.println("Choix invalide, veuillez réessayer.");
                break;
        }
    }
}
}
