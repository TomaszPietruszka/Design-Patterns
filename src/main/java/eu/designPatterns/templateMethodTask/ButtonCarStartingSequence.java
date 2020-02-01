package eu.designPatterns.templateMethodTask;

public class ButtonCarStartingSequence {

    public void startTheCar() {

        fastenSeatBelt();
        startTheIgnition();
        setTheGear();
        go();
    }

    public void fastenSeatBelt() {
        System.out.println("Zapnij pasy");
    }

    public void go() {
        System.out.println("nacisnij pedal gazu");
    }

    public void setTheGear() {
        System.out.println("wrzuc bieg");
    }

    public void startTheIgnition() {
        System.out.println("nacisnij przycisk");
    }


}
