public class Player {

    private String userClass;
    private int    stamina;
    private int    health;
    private int    mana;
    private int    manaPots;
    private int    healthPots;
    private int    cookedMeat;
    private int    arrows;
    private String[] inventory;

    Player(int userClass) {
	switch (userClass) {
	case 1: this.userClass = "Mage";
	    this.health = 100;
	    this.mana = 150;
	    this.manaPots = 5;
	    this.healthPots = 5;
	    break;
	case 2: this.userClass = "Warior";
	    this.health = 200;
	    this.stamina = 100;
	    this.healthPots = 5;
	    this.cookedMeat = 5;
	    break;
	case 3: this.userClass = "Hunter";
	    this.health = 150;
	    this.stamina = 100;
	    this.healthPots = 5;
	    this.cookedMeat = 5;
	    this.arrows = 50;
	    break;
	case 4: this.userClass = "Rouge";
	    this.health = 100;
	    this.stamina = 150;
	    this.healthPots = 5;
	    this.cookedMeat = 5;
	}
    }

    public void eat() {
	this.cookedMeat --;
	this.stamina += 20;
    }

    public void drinkManaPot() {
	this.manaPots --;
	this.mana += 20;
    }

    public void spell(int cost) {
	this.mana -= cost;
    }

    public String getClass() {
	return this.userClass;
    }
}
