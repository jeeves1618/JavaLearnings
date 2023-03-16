public class Main {
    public static void main(String[] args) {
        Greeter<String> greeter = new Greeter<>("Hello Universe, I am Zaphod Beeblebrox");
        greeter.sayGreeting();
    }
}