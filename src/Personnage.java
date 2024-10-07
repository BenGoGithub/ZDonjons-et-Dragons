public class Personnage {

    private String name;
    private String type;
    private int life;
    private int attack;
    private EquipementDefensif equipementDefensif;
    private EquipementOffensif equipementOffensif;

    public Personnage() {

        this("John");
        //Todo: appeller le constructeur en créant un name par défaut
    }

    public Personnage(String name){
        //Donner une valeur par défaut au type, par exemple "Guerrier".
        this(name, "Guerrier");
    }


    public Personnage(String name, String type){
        //TODO: intialisé name et type et ensuite intialisé les valeurs
        //Initialiser les valeurs de name et type.
        this.name = name;
        this.type = type;

        //Initialiser les valeurs par défaut de life et attack en fonction du type.
        if (type.equals("Guerrier")) {
            this.life = 10;
            this.attack = 10;
            this.equipementDefensif = new EquipementDefensif("Bouclier",2,"BouclierEnBois");
            this.equipementOffensif = new EquipementOffensif("Arme","couteau",3);
        } else if (type.equals("Magicien")) {
            this.life = 6;
            this.attack = 15;
            this.equipementDefensif = new EquipementDefensif("Philtre",3,"Brouillard");
            this.equipementOffensif = new EquipementOffensif("Sort","Feu",3);
        } else {
            this.type = "Voleur";
            this.life = 8;
            this.attack = 8;
            this.equipementDefensif = new EquipementDefensif("Bouclier",2,"BouclierEnBois");
            this.equipementOffensif = new EquipementOffensif("Arme","couteau",3);
        }

    }    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public EquipementOffensif getEquipementOffensif() {
        return equipementOffensif;
    }

    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    public EquipementDefensif getEquipementDefensif() {
        return equipementDefensif;
    }

    public void setEquipementDefensif(EquipementDefensif equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }

    @Override
    public String toString() {
        return "Personnage: " + name + " | Type: " + type + " | Vie: " + life +
                " | Attaque: " + attack + " | Equipement Offensif: " + equipementOffensif +
                " | Equipement Défensif: " + equipementDefensif;
    }
}