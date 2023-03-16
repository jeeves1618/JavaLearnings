public class Suv extends Car{
    public Suv(int engineCapacity, String make, String model) {
        super(engineCapacity, make, model);
    }

    @Override
    public void driveCar() {
        System.out.println(String.format("The %s has high ground clearence and it amplifies the body roll to a great extend.",this.getClass().getSimpleName()));
    }

    @Override
    public void listSpecs() {
        System.out.println("Make : " + this.make + ", Model : " + this.make +", Type : " + this.getClass().getSimpleName() + ", Engine CC : " + this.engineCapacity);
    }
}
