package Static;

class Main{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drivingPostion = "Will this work?";

        Car otherCar = new Car();
        System.out.println(otherCar.drivingPostion);
    }
}