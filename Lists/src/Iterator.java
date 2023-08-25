import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

    public static void main(String[] args) {

        String[] team83 = { "Kapil Dev",
                "Mohinder Amarnath",
                "Kirti Azad",
                "Roger Binny",
                "Sunil Gavaskar",
                "Syed Kirmani",
                "Madan Lal",
                "Sandip Patil",
                "Balwinder Sandhu",
                "Yashpal Sharma",
                "Ravi Shastri",
                "Krishnamachari Srikkanth",
                "Sunil Valson",
                "Dilip Vengsarkar"};

        List<String> players = new ArrayList<>();
        players.addAll(List.of(team83));

        ListIterator<String> playerIterator = players.listIterator();//listIterator(3) will start the iterator at position 3.
        // Default is position 0

        while (playerIterator.hasNext()){
            String player = playerIterator.next();
            System.out.println(player);
            if (player.equals("Sunil Valson")) playerIterator.add("Sachin Tendulkar");
        }

        System.out.println(players);

        while (playerIterator.hasPrevious()) {
            String player = playerIterator.previous();
            System.out.println(player);
        }
    }
}
