package eu.designPatterns.templateMethodTask;

/**
 * @author pl008sengrze, 26.01.2019
 * CRIF IT Solutions Poland
 */
public class MainAppTemplateMethod {
    public static void main(String[] args) {
        ClassicCarStartingSequence car = new ClassicCarStartingSequence();
        car.startTheCar();

        System.out.println("\n");

        ButtonCarStartingSequence buttonCar = new ButtonCarStartingSequence();
        buttonCar.startTheCar();

        System.out.println("\n");

        AutomaticCarStartingSequence automaticCar = new AutomaticCarStartingSequence();
        automaticCar.startTheCar();


    }


}
