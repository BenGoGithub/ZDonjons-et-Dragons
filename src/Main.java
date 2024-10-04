import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Créer une instance de la classe Game
        Main main = new Main();
        main.startGame();  // Appel à la méthode pour démarrer le jeu
    }

    // Méthode pour lancer le jeu (non statique)
    public void startGame() {
        // Instancier Game et démarrer
        Game game = new Game();
        game.run();  // Appelle la méthode run() pour exécuter la logique du jeu
    }
}


//EquipementOffensif et EquipementDefensif gèrent les équipements d'attaque et de défense.
//Personnage gère les attributs des personnages (guerrier ou magicien).
//Menu gère les interactions utilisateur pour créer, afficher, et modifier les personnages.
//Game est la boucle principale qui gère le déroulement du jeu via le menu.