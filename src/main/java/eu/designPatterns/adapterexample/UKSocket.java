package eu.designPatterns.adapterexample;

public class UKSocket {

    public void plugIn(UKDevice ukDevice){
        System.out.println("Urządzenie wpięte do brytyjskiego gniazdka: ");
        ukDevice.powerOn();
    }

}
