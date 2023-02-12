package Composition;

public class Main {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("3502","Dell", "240 Watts");
        Monitor theMonitor = new Monitor("27 inch Ultra 4HD", "Samsung", 27,"3840 X 2160");
        Motherboard theBoard = new Motherboard("5000 Series Ryzen 9","AMD",4,6,"Flashback");

        PersonalComputer thePC = new PersonalComputer("3502","Dell",theCase, theMonitor, theBoard);

        thePC.getComputerCase().pressPowerButton();
        thePC.getMotherboard().loadProgram("Mac OS");
        thePC.getMonitor().drawPixel(10,100,"Red");
        /*
        Do we want the main to access the computer case, motherboard or monitor?
         */
        thePC.powerUpMyPC();
    }
}
