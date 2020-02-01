package eu.designPatterns.adapterexample;

public class BritishMeatGrinder implements UKDevice {
    @Override
    public void powerOn() {
        System.out.println("Brytyjska maszynka do mięsa zasuwa");
    }
}
