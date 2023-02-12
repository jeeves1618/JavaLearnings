package Composition;

public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String manufacturer, String make, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(manufacturer, make);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel(10,200, "Blue");
    }

    private void loadStartUp(){
        motherboard.loadProgram("Windows OS");
    }

    public void powerUpMyPC(){
        computerCase.pressPowerButton();
        loadStartUp();
        drawLogo();
    }
}
