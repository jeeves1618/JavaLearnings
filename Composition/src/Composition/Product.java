package Composition;

public class Product {

    private String manufacturer;
    private String make;
    private int height;
    private int depth;
    private int width;

    public Product(String manufacturer, String make) {
        this.manufacturer = manufacturer;
        this.make = make;
    }
}

class Monitor extends Product {
    private int size;
    private String resolution;

    public Monitor(String manufacturer, String make) {
        super(manufacturer, make);
    }

    public Monitor(String manufacturer, String make, int size, String resolution) {
        super(manufacturer, make);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d, %d in color %s",x,y,color));
    }
}

class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private  String bios;

    public Motherboard(String manufacturer, String make) {
        super(manufacturer, make);
    }

    public Motherboard(String manufacturer, String make, int ramSlots, int cardSlots, String bios) {
        super(manufacturer, make);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println(programName + " is loading");
    }
}

class ComputerCase extends Product {
    private String powerSupply;

    public ComputerCase(String manufacturer, String make) {
        super(manufacturer, make);
    }

    public ComputerCase(String manufacturer, String make, String powerSupply) {
        super(manufacturer, make);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button is Pressed");
    }
}

