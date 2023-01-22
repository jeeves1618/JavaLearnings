package Pojo;

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
    }
}
