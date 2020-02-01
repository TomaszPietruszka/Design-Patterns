package eu.designPatterns.templateMethodTask;

public class AutomaticCarStartingSequence {

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
        System.out.println("");
    }

    public void startTheIgnition() {
        System.out.println("nacisnij przycisk");
    }

}
