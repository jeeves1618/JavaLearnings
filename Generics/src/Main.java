public class Main {
    public static void main(String[] args) {
        Greeter<String> greeter = new Greeter<>("Hello Universe, I am Zaphod Beeblebrox");
        greeter.sayGreeting();

        Greeter greeterRaw = new Greeter("And I am a meglomanical, self centered narcissist");
        greeterRaw.sayGreeting();

        Player player = new Player("Sachin Tendulkar", "India", "Opening Batsman");
        /*
        The extends in the public class PlayerRecord <T extends Player> ensures that only a class of type Play
         */
        PlayerRecord<Player> playerPlayerRecord = new PlayerRecord<>(player);
        System.out.println(playerPlayerRecord.toString());

        //PlayerRecord<String> stringPlayerRecord = new PlayerRecord<String>();
    }
}