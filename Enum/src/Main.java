import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int planetNumber = new Random().nextInt(8);
        //Define a variable on Enum and assign a value.
        Planets myPlanetName = Planets.Earth;
        //We can not assign values, even from Planets enumeration, to the variable created of type Enum.
        //It is immutable. myPlanetName = "Earth"; will not work
        System.out.printf("Hello people of %s! ", myPlanetName);
        //The function ordinal will act on the value of Enum
        System.out.printf("My favorite planet is %s and it is in oribit %d from the Sun", Planets.values()[planetNumber], Planets.values()[planetNumber].ordinal()+1);
        System.out.println();
        //Using Enum in a switch statement
        switch (myPlanetName){
            case Mercury -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Venus -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Earth -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Mars -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Jupiter -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Saturn -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Uranus -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            case Neptune -> System.out.printf("I am planet No. %d%n", myPlanetName.ordinal() + 1);
            default -> System.out.println("Unknown Planet");
        }

        //Enums with functions
        PlanetsFunction planetsFunction = PlanetsFunction.values()[new Random().nextInt(8)];
        int planetPosition = PlanetsFunction.getPosition(planetsFunction);

        System.out.printf("The planet %s is in positon %d%n", planetsFunction, planetPosition);

        //We can also loop through the values of Enum.
        //here we are using name function to get the constant value in String format
        for(PlanetsFunction planet: PlanetsFunction.values()){
            System.out.printf("The planet %s is in positon %d%n", planet.name(), PlanetsFunction.getPosition(planet));
        }

        System.out.println("------------------------------------------------");
        System.out.println(PlanetsFunction.getPlanet(1, "9"));
    }
}