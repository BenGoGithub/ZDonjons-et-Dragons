// Classe Menu
// Cette classe gère les interactions avec l'utilisateur, elle permet de créer un nouveau personnage,
// Scanner : on utilise la classe Scanner pour lire les entrées de l'utilisateur depuis le clavier.
import java.util.Scanner;
public class Menu {

    // Méthode pour afficher le menu principal
    public void afficherMenuPrincipal() {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Créer un nouveau personnage");
        System.out.println("2. Afficher les infos du personnage");
        System.out.println("3. Modifier les infos du personnage");
        System.out.println("4. Démarrer la partie");
        System.out.println("5. Quitter le jeu");
        System.out.print("Choisissez une option : ");
    }

    // Méthode pour créer un personnage
    public Personnage creerPersonnage(Scanner scanner) {
        System.out.println("=== Création d'un nouveau personnage ===");
        System.out.print("Entrez le nom du personnage : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le type du personnage (Guerrier/Magicien) : ");
        String type = scanner.nextLine();

        return new Personnage(nom, type);
    }

    // Méthode pour afficher les informations d'un personnage
    public void afficherPersonnage(Personnage personnage) {
        System.out.println("=== Informations du personnage ===");
        System.out.println("Nom : " + personnage.getNom());
        System.out.println("Type : " + personnage.getType());
        System.out.println("Point de vie : " + personnage.getLife());
        System.out.println("Attaque : " + personnage.getAttack() );
        System.out.println("Defense : " + personnage.getEquipementDefensif());
        System.out.println("Equipement offensif : " + personnage.getEquipementOffensif());
    }

    // Méthode pour modifier les informations d'un personnage
    public void modifierPersonnage(Personnage personnage, Scanner scanner) {
        System.out.println("=== Modification des informations du personnage ===");
        System.out.println("Nom actuel : " + personnage.getNom());
        System.out.print("Entrez le nouveau nom : ");
        String nouveauNom = scanner.nextLine();
        personnage.setNom(nouveauNom);

        System.out.println("Type actuel : " + personnage.getType());
        System.out.print("Entrez le nouveau type (Guerrier/Magicien) : ");
        String nouveauType = scanner.nextLine();
        personnage.setType(nouveauType);

        System.out.println("Les informations du personnage ont été mises à jour.");
    }

    // Méthode pour afficher un message d'erreur si aucun personnage n'a été créé
    public void afficherErreurAucunPersonnage() {
        System.out.println("Aucun personnage n'a été créé.");
    }

    // Méthode pour afficher un message de démarrage du jeu
    public void afficherDebutJeu(int positionJoueur) {
        System.out.println("Le jeu commence ! Vous êtes sur la case " + positionJoueur + ".");
    }

    // Méthode pour indiquer que l'utilisateur peut lancer le dé
    public void demanderJeterDe() {
        System.out.println("\nAppuyez sur Entrée pour jeter le dé.");
    }

    // Méthode pour afficher le résultat du lancer de dé
    public void afficherResultatDe(int de) {
        System.out.println("Vous avez jeté un " + de + "!");
    }

    // Méthode pour afficher la nouvelle position du joueur
    public void afficherPosition(int positionJoueur, int NB_CASES) {
        System.out.println("Vous êtes maintenant sur la case " + positionJoueur + " / " + NB_CASES);
    }

    // Méthode pour afficher le message de fin de jeu
    public void afficherVictoire(int positionJoueur) {
        System.out.println("Vous avez atteint la case " + positionJoueur + " ! Félicitations, vous avez gagné !");
    }

    // Méthode pour proposer à l'utilisateur de recommencer une partie
    public void demanderRecommencer() {
        System.out.println("\nVoulez-vous recommencer une partie ? (y/n)");
    }

    // Méthode pour afficher un message de remerciement quand l'utilisateur quitte le jeu
    public void afficherMessageQuitter() {
        System.out.println("Merci d'avoir joué !");
    }

    // Méthode pour afficher un message d'erreur pour un choix invalide
    public void afficherErreurChoixInvalide() {
        System.out.println("Choix invalide, veuillez réessayer.");
    }
}
