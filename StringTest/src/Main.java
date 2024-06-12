public class Main {
    public static void main(String[] args) {

        String name = "Vijay";
        String anotherName = "Vijay";
        System.out.println(name == anotherName);

        String thirdName = new String("Vijay");
        System.out.println(name == thirdName);
    }
}