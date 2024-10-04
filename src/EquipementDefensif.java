// Classe EquipementDefensif
// Cette classe modélise un équipement défensif pour un personnage (comme un bouclier ou un philtre).
// Elle fonctionne de manière similaire à la classe EquipementOffensif, mais concerne la défense.
// Elle contient trois attributs : le type (ex. : "Bouclier" ou "Philtre"), le nom de l'équipement,
// et le niveau de défense (un entier qui représente la puissance de défense).
//
// Utilise un constructeur pour initialiser les valeurs des attributs lors de la création de l'équipement défensif.
// Les getters et setters permettent de lire et modifier les valeurs de ces attributs.
// La méthode toString donne une représentation en texte de l'équipement.
public class EquipementDefensif {

    private String type;
    private int niveauDefense;
    private String nom;


    public EquipementDefensif(String type, int niveauDefense, String nom) {
        this.type = type;
        this.niveauDefense = niveauDefense;
        this.nom = nom;
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

    public int getNiveauDefense() {
        return niveauDefense;
    }
    @Override
    public String toString() {
        return type + " " + nom + "(Défense:  " + niveauDefense + ")";
    }
}