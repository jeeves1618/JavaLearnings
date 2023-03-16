import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird sparrow = new Bird("Sparrow",5, "Carnivore");
        Animal flyingSmallAnimal = sparrow;
        FlyBehaviour flier = sparrow;
        /*
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
        */
        List<FlyBehaviour> flyBehaviourList = new ArrayList<>();
        flyBehaviourList.add(sparrow);
        flyBehaviourList.add(new Bird("Eagle", 35, "Carnivore"));
        flyBehaviourList.add(new Bird("Crow", 12, "Carnivore"));
        flyBehaviourList.add(new Bird("Vulture", 75, "Carnivore"));
        flyBehaviourList.add(new Aircraft("Boeing 747", "GE Jet Engines"));
        flyBehaviourList.add(new Aircraft("Airbus A380", "Rolls Royce Turbine Engines"));
        flyBehaviourList.add(new Aircraft("Cessna Skycraft", "Propeller Powered"));

        flyingStuff(flyBehaviourList);
    }

    static void flyingStuff(List<FlyBehaviour> flyBehaviours){
        for (FlyBehaviour flyBehaviour: flyBehaviours){
            flyBehaviour.takeOffProcess();
            flyBehaviour.flight();
            flyBehaviour.speedMaintainance();
            flyBehaviour.landing();
            System.out.println("---------------------------------- END OF SECTION ----------------------------------------");
        }
    }
}