public class Player {
    //Class without encapsulation
    public String name;
    public int health;
    public String weapon;

    //Public is used on purpose.

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
