public class Bird extends Animal implements FlyBehaviour{
    public Bird(double weightInKgs, String diet) {
        super(weightInKgs, diet);
    }


    @Override
    public void takeOffProcess() {
        System.out.println("An initial thrust from the jump is carried forward through the flapping wings");
    }

    @Override
    public void flight() {
        System.out.println("Maintains flight through occassional pushing down of air and spreading the wings to maximum to enable glide");
    }

    @Override
    public void speedMaintainance() {
        System.out.println("Enabled by the angle of wings");
    }

    @Override
    public void landing() {
        System.out.println("Place the wing at almost an right angle to the direction of fligh to reduce the speed enough to land on its feet");
    }
}
