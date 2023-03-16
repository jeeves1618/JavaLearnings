public class Sedan extends Car{
    public Sedan(int engineCapacity, String make, String model) {
        super(engineCapacity, make, model);
    }

    @Override
    public void driveCar() {
        System.out.println(String.format("The %s has a low ground clearence and it reduces the body roll to a great extend.",this.getClass().getSimpleName()));
    }

    @Override
    public void listSpecs() {
        System.out.println("Make : " + this.make + ", Model : " + this.make +", Type : " + this.getClass().getSimpleName() + ", Engine CC : " + this.engineCapacity);
    }

    public void commentary(){
        System.out.println("Sedans are going out of style in India");
    }
}
