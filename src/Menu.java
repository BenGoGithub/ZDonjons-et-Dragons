// Classe Menu
// Cette classe gère les interactions avec l'utilisateur, elle permet de créer un nouveau personnage,
// afficher les informations d'un personnage, et modifier les informations d'un personnage.

// Méthodes de la classe :
// - creerPersonnage : elle demande à l'utilisateur le type (Guerrier ou Magicien) et le nom du personnage,
//   puis retourne un nouveau personnage créé en fonction des choix de l'utilisateur.
// - afficherPersonnage : elle affiche les informations du personnage en utilisant la méthode toString du personnage.
// - modifierPersonnage : elle permet de modifier le nom et le type d'un personnage déjà créé.

// Scanner : on utilise la classe Scanner pour lire les entrées de l'utilisateur depuis le clavier.
import java.util.Scanner;
public class Menu {

    // Méthode pour créer un personnage
    public Personnage creerPersonnage(Scanner scanner) {
        System.out.println("Quel type de personnage voulez-vous créer ? (Guerrier/Magicien)");
        String type = scanner.nextLine();

        System.out.println("Entrez le nom du personnage : ");
        String nom = scanner.nextLine();

        return new Personnage(nom, type);  // Retourne un nouveau personnage créé
    }

    // Méthode pour afficher les infos du personnage
    public void afficherPersonnage(Personnage personnage) {
        System.out.println(personnage.toString());
    }

    // Méthode pour modifier un personnage
    public void modifierPersonnage(Personnage personnage, Scanner scanner) {
        System.out.println("Modifier le nom du personnage : ");
        String nouveauNom = scanner.nextLine();
        personnage.setName(nouveauNom);

        System.out.println("Modifier le type du personnage (Guerrier/Magicien) : ");
        String nouveauType = scanner.nextLine();
        personnage.setType(nouveauType);
    }
}
