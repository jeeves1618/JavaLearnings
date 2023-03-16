package Super;

interface Organism {

    public void eatingHabits();
    public void breathingHabits();
}

class Fish implements Organism {

    @Override
    public void eatingHabits() {
        System.out.println("I eat plankton");
    }

    @Override
    public void breathingHabits() {
        System.out.println("I take in water and get the oxygen out of it");
    }
}
public class Interface {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.breathingHabits();
        fish.eatingHabits();
    }
}
