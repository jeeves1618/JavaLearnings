public class Greeter <T>{

    private T greeting;

    public Greeter(T greeting) {
        this.greeting = greeting;
    }

    public void sayGreeting(){
        System.out.println(this.greeting);
    }
}
