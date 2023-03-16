package Super;

abstract class Animal {

    public abstract void eatingHabit();

    public void breathingHabit(){

        System.out.println("I, being an animal, take in oxygen and expel carbon dioxide");
    }
}

class Lion extends Animal{

    @Override
    public void eatingHabit() {
        System.out.println("I am lion, I eat meat and stay away from plants");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.eatingHabit();
        animal.breathingHabit();
    }
}