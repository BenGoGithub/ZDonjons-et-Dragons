// Classe Game
// Cette classe contient la boucle principale du jeu.
// Elle affiche un menu à l'utilisateur avec plusieurs options : créer un personnage, afficher ses informations,
// modifier ses informations ou quitter le jeu.

import java.util.Scanner;

public class Game {

    private Personnage personnage;
    private Scanner scanner;
    private Menu menu;

    // Constructeur de la classe Game
    public Game() {
        this.scanner = new Scanner(System.in);
        this.personnage = null;
        this.menu = new Menu();
    }

    // Méthode principale pour gérer le déroulement du jeu
    public void run() {
        boolean running = true;

        // Boucle principale du jeu
        while (running) {
            // Affichage du menu principal via le menu
            menu.afficherMenuPrincipal();

            // Lecture du choix de l'utilisateur
            int choix = scanner.nextInt();
            scanner.nextLine();

            // Condition Switch pour gérer les différentes options du menu
            switch (choix) {
                case 1:
                    // Création d'un nouveau personnage
                    personnage = menu.creerPersonnage(scanner);
                    break;
                case 2:
                    // Affichage des informations du personnage
                    if (personnage != null) {
                        menu.afficherPersonnage(personnage);
                    } else {
                        menu.afficherErreurAucunPersonnage();
                    }
                    break;
                case 3:
                    // Modification des informations du personnage
                    if (personnage != null) {
                        menu.modifierPersonnage(personnage, scanner);
                    } else {
                        menu.afficherErreurAucunPersonnage();
                    }
                    break;
                case 4:
                    // Démarrage de la partie
                    if (personnage != null) {
                        demarrerPartie();
                    } else {
                        menu.afficherErreurAucunPersonnage();
                    }
                    break;
                case 5:
                    // Quitter le jeu
                    running = false;
                    menu.afficherMessageQuitter();
                    break;
                default:
                    // Choix invalide
                    menu.afficherErreurChoixInvalide();
                    break;
            }
        }
    }

    // Méthode pour démarrer la partie
    public void demarrerPartie() {
        final int NB_CASES = 64;
        int positionJoueur = 1;
        boolean partieEnCours = true;

        // Affichage du début de la partie
        menu.afficherDebutJeu(positionJoueur);

        // Boucle de jeu pour faire avancer le joueur case par case
        while (partieEnCours) {
            menu.demanderJeterDe();
            scanner.nextLine();  // Attend l'appui sur Entrée

            int de = (int) (Math.random() * 6) + 1;
            menu.afficherResultatDe(de);

            positionJoueur += de;

            // Si le joueur atteint ou dépasse la dernière case
            if (positionJoueur >= NB_CASES) {
                positionJoueur = NB_CASES;
                menu.afficherVictoire(positionJoueur);
                partieEnCours = false;
            } else {
                menu.afficherPosition(positionJoueur, NB_CASES);
            }
        }

        // Proposition de recommencer une partie
        menu.demanderRecommencer();
        String choix = scanner.nextLine();

        if (choix.equalsIgnoreCase("y")) {
            demarrerPartie();
        } else {
            menu.afficherMessageQuitter();
        }
    }
}
