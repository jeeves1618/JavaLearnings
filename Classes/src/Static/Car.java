package Static;

public class Car {

    public static String drivingPostion = "Left Hand Drive";
    private String manufacturer;
    private String model;
    private String variant;
    private int engineVolumeInCC;
    private boolean isTurboCharged;

    public Car(){
        this("Make","Model","Variant",0,false);
        System.out.println("Calling the empty constructor. Assigned defaults using constructor chaining.");
    }

    public Car(String manufacturer, String model, String variant, int engineVolumeInCC, boolean isTurboCharged) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.variant = variant;
        this.engineVolumeInCC = engineVolumeInCC;
        this.isTurboCharged = isTurboCharged;
    }

    public Car(String model, String variant, int engineVolumeInCC, boolean isTurboCharged) {
        this("Volkswagon", model, variant, engineVolumeInCC,isTurboCharged);
        this.model = model;
        this.variant = variant;
        this.engineVolumeInCC = engineVolumeInCC;
        this.isTurboCharged = isTurboCharged;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public int getEngineVolumeInCC() {
        return engineVolumeInCC;
    }

    public void setEngineVolumeInCC(int engineVolumeInCC) {
        this.engineVolumeInCC = engineVolumeInCC;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }

    public String describeCar(){
        return "The " + this.model + " car manufactured by "
                + this.manufacturer + " is of the variant " + this.variant
                + (this.isTurboCharged ? ". It's engine is turbo charged" : ". It's engine is naturally aspirated")
                + " and has a capacity of " + this.engineVolumeInCC + " CC.";
    }

    public static String getDrivingPostion() {
        return drivingPostion;
    }

    public static void setDrivingPostion(String drivingPostion) {

        Car.drivingPostion = drivingPostion;
    }
}
