package Super;

public class Main {

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle(4,996,"Petrol",false,true,"Small");
        System.out.println(myCar.toString());
        describeVehicle(myCar);

        Car myNewCar = new Car(4,1496,"Petrol",false,true,"Volkswagon","Taigun","TSI GT");
        System.out.println(myNewCar.toString());
        describeVehicle(myNewCar);

        Vehicle myBike = new Bike(2,125,"Petrol",false,false,"Honda","Activa","LX");
        System.out.println(myBike.toString());
        describeVehicle(myBike);

        Auto myAuto = new Auto(3,470,"Diesel", false, false, "Bajaj","RE","RE");
        System.out.println(myAuto.toString());
        describeVehicle(myAuto);
    }


    public static void describeVehicle(Vehicle vehicle){
        System.out.println(vehicle);
        vehicle.moveForward();
    }
}

class Auto extends Vehicle{
    private String make;
    private String model;
    private String variant;

    public Auto(int numberOfWheels, int engineVolumeInCC, String fuelType, boolean isHybrid, boolean isTurboCharged, String make, String model, String variant) {
        super(numberOfWheels, engineVolumeInCC, fuelType, isHybrid, isTurboCharged, engineVolumeInCC > 500 ? "Large":"Small");
        this.make = make;
        this.model = model;
        this.variant = variant;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", variant='" + variant + '\'' +
                "} " + super.toString();
    }
}

