package eu.designPatterns.adapterexample;

public class MainAppAdapter {

    public static void main(String[] args) {

        UKSocket ukSocket = new UKSocket();
        UKDevice britishMeatGrinder = new BritishMeatGrinder();
        ukSocket.plugIn(britishMeatGrinder);

        ContinentalSocket continentalSocket = new ContinentalSocket();
        ContinentalDevice laptop = new PolishLaptop();
        continentalSocket.plugIn(laptop);
    }
}
