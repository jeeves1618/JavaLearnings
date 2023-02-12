public class PlayerEncapsulated {

    private String name;
    private int health;
    private String weapon;

    public PlayerEncapsulated(String name) {
        this(name, 100, "Sword");
    }
    //Even if we change the name to fullName everywhere in this class, the calling classes don't have to change.
    public PlayerEncapsulated(String name, int health, String weapon) {
        if (health <= 0) health = 1;
        else if (health > 100) health = 100;
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health < 0){
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

    public void restoreHealth(int extraHealth){
        this.health = this.health + extraHealth;

        if (this.health > 100){
            System.out.println("Player restored to 100% health");
            this.health = 100;
        }
    }
}
