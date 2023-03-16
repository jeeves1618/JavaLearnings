public class Main {
    public static void main(String[] args) {

        Bird sparrow = new Bird(5, "Carnivore");
        Animal flyingSmallAnimal = sparrow;
        FlyBehaviour flier = sparrow;

        sparrow.ambulate();
        sparrow.takeOffProcess();
        sparrow.flight();
        sparrow.speedMaintainance();
        sparrow.landing();

        flyingSmallAnimal.ambulate();

        flier.takeOffProcess();
        flier.flight();
        flier.speedMaintainance();
        flier.landing();
    }
}