// Classe EquipementOffensif
// Cette classe modélise un équipement offensif pour un personnage (comme une arme ou un sort).
// Elle contient trois attributs : le type (ex. : "Arme" ou "Sort"), le nom de l'équipement,
// et le niveau d'attaque (un entier qui représente la puissance d'attaque).

// Constructeur : il est utilisé pour initialiser les attributs lors de la création d'un équipement offensif.
// Getters et setters : ils permettent de récupérer ou de modifier les valeurs des attributs de manière contrôlée.
// toString : cette méthode permet d'afficher les informations de l'équipement sous forme de texte.


public  class EquipementOffensif {
    private String type;
    private String nom;
    private int niveauAttaque;

    public EquipementOffensif(String type, String nom, int niveauAttaque) {
        this.type = type;
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return type + " " + nom + "(Attaque: " + niveauAttaque + ")";
    }
}