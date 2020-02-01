package eu.designPatterns.templateMethod2;

public class EconomistDay {
    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {
        System.out.println("wstalem!");
        System.out.println("jestem gotowy do wyjscia");
        int time = goToWork(typeOfTransport);
        System.out.println("Czas dojazdu mi zajął min :" + time);
        System.out.println("Trejduję cały dzien");
        System.out.println("wracam do domu");
    }

    public int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case CAR: {
                return 7;
            }
            case BIKE: {
                return 30;
            }
            case TRAM: {
                return 50;
            }
            default: {
                return 100;
            }
        }
    }
}
