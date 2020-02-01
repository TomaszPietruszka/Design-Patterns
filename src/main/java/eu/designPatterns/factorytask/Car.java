package eu.designPatterns.factorytask;

/**
 * @author pl008sengrze, 27.01.2019
 * CRIF IT Solutions Poland
 */
public abstract class Car {

private String productionYear;
private String engine;
private String fuel;
private SteeringWheelPosition position;

    public Car(String productionYear, String engine, String fuel, SteeringWheelPosition position) {
        this.productionYear = productionYear;
        this.engine = engine;
        this.fuel = fuel;
        this.position = position;
    }

    @Override public String toString() {
        return "Car{" + "productionYear='" + productionYear + '\'' + ", engine='" + engine + '\'' + ", fuel='" + fuel + '\'' + ", position=" + position + '}';
    }
}


