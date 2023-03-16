public class Bird extends Animal implements FlyBehaviour{

    public Bird(String speciesName, double weightInKgs, String diet) {
        super(speciesName, weightInKgs, diet);
    }

    @Override
    public void takeOffProcess() {
        System.out.println("An initial thrust from the jump is carried forward through the flapping wings of " + super.speciesName);
    }

    @Override
    public void flight() {
        System.out.println(super.speciesName + " maintains flight through occassional pushing down of air and spreading the wings to maximum to enable glide");
    }

    @Override
    public void speedMaintainance() {
        System.out.println(super.speciesName + " maintains speed by adjusting the angle of wings");
    }

    @Override
    public void landing() {
        System.out.println(super.speciesName + " places the wing at almost an right angle to the direction of fligh to reduce the speed enough to land on its feet");
    }
}
