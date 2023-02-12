public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Virat";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health is " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health is " + player.healthRemaining());

        //Now the player is knocked out. But what if I do, player.health = 200;
        //I am bypassing all the checks in place.

        player.health = 200;
        System.out.println("Remaining Health is " + player.healthRemaining());

        //Or what if I want to change the name in the Player to fullName;

        PlayerEncapsulated playerEncapsulated = new PlayerEncapsulated("Sachin");
        System.out.println("Remaining Health is " + playerEncapsulated.healthRemaining());

        PlayerEncapsulated rouguePlayer = new PlayerEncapsulated("Rogue",200,"Missile");
        System.out.println("Remaining Health is " + rouguePlayer.healthRemaining());
    }
}
