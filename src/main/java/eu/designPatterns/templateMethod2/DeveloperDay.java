package eu.designPatterns.templateMethod2;

public class DeveloperDay {
    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {
        System.out.println("wstalem!");
        System.out.println("jestem gotowy do wyjscia");
        int time = goToWork(typeOfTransport);
        System.out.println("Czas dojazdu mi zajął min :" + time);
        System.out.println("Koduje cały dzien ");
        System.out.println("wracam do domu");
    }

    private int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case CAR: {
                return 10;
            }
            case BIKE: {
                return 50;
            }
            case TRAM: {
                return 30;
            }
            default: {
                return 120;
            }
        }
    }
}
