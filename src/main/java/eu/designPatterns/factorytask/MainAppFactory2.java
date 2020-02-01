package eu.designPatterns.factorytask;

public class MainAppFactory2 {

    public static void main(String[] args) {
        Car hatchback = new Hatchback("2017", "1.4", "diesel", SteeringWheelPosition.LEFT);
    }

}
