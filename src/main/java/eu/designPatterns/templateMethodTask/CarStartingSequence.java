package eu.designPatterns.templateMethodTask;

public abstract class CarStartingSequence {

    final public void startTheCar() {

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

    abstract public void setTheGear();

    abstract public void startTheIgnition();


}
