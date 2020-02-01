package eu.designPatterns.adapterexample;

public class ContinentalSocket {
    public void plugIn(ContinentalDevice continentalDevice) {
        System.out.println("Urządzenie wpięte do kontynentalnego gniazdka: ");
        continentalDevice.on();
    }
}
