package Classes;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Volkswagon", "Taigun", "TSI GT", 1496, true);
        System.out.println(myCar.describeCar());

        Car mySecondCar = new Car("Hyundai", "Grand i10", "Asta", 1196, false);
        System.out.println(mySecondCar.describeCar());

        Car thirdCar = new Car();
        System.out.println(thirdCar.describeCar());
    }
}
