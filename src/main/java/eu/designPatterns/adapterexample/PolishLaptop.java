package eu.designPatterns.adapterexample;

public class PolishLaptop implements ContinentalDevice {
    @Override
    public void on() {
        System.out.println("Polski laptop juz działa");
    }
}
