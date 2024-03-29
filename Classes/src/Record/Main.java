package Record;

import Pojo.Player;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            Player player = new Player(
                    switch (i){
                        case 0 -> "Tom Moody";
                        case 1 -> "David Boon";
                        case 2 -> "Geoff Marsh";
                        case 3 -> "Mark Taylor";
                        case 4 -> "Dean Jones";
                        case 5 -> "Allen Border";
                        default -> "Undefined";
                    }, "Australia", "Top Order Batsman"
            );
            System.out.println(player);
        }
        System.out.println("---------------------------USING RECORD --------------------");

        for (int i = 0; i < 5; i++){
            Aussie player = new Aussie(
                    switch (i){
                        case 0 -> "Tom Moody";
                        case 1 -> "David Boon";
                        case 2 -> "Geoff Marsh";
                        case 3 -> "Mark Taylor";
                        case 4 -> "Dean Jones";
                        case 5 -> "Allen Border";
                        default -> "Undefined";
                    }, "Team Australia", "Top Order Batsman"
            );
            System.out.println(player);
            //Now if you want to print the getter for name, you have to use like this.
            System.out.println(player.name());
            //So, in records we use getters by dropping the get. But, records do not have any setters.
            //Because, records are predominantly for immutable records.
        }
    }
}
