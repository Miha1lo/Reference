package com.company;

public class CarTest {
    public static void main(String[] args) {

        Car pikcup = new Car();
        pikcup.color = "Gray";
        pikcup.passengers = 6;
        pikcup.power = 250;
        pikcup.speed = 160;
        pikcup.vnCode = "SP24863MJ385PL";

        System.out.println("Characteristics of pickup: ");
        System.out.println("color: " + pikcup.color);
        System.out.println("passengers: " + pikcup.passengers);
        System.out.println("power: " + pikcup.power);
        System.out.println("speed: " + pikcup.speed);
        System.out.println("vnCode: " + pikcup.vnCode);
        System.out.println();

        Car sportCar = new Car();
        sportCar.color = "Red";
        sportCar.passengers = 2;
        sportCar.power = 755;
        sportCar.speed = 290;
        sportCar.vnCode = "LR86173JR512QW";

        System.out.println("Characteristics of sportCar: ");
        System.out.println("color: " + sportCar.color);
        System.out.println("passengers: " + sportCar.passengers);
        System.out.println("power: " + sportCar.power);
        System.out.println("speed: " + sportCar.speed);
        System.out.println("vnCode: " + sportCar.vnCode);
        System.out.println();

        Car truck = new Car();
        truck.color = "Black";
        truck.passengers = 3;
        truck.power = 500;
        truck.speed = 120;
        truck.vnCode = "PW12853KR429MW";

        System.out.println("Characteristics of truck: ");
        System.out.println("color: " + truck.color);
        System.out.println("passengers: " + truck.passengers);
        System.out.println("power: " + truck.power);
        System.out.println("speed: " + truck.speed);
        System.out.println("vnCode: " + truck.vnCode);
        System.out.println();
    }
}
