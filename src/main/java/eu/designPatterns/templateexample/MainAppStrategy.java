package eu.designPatterns.templateexample;

public class MainAppStrategy {

    public static void main(String[] args) {

        HardChef hardChef = new HardChef("Gordon Gessler");
        SoftChef softChef = new SoftChef("Podest Amaro");

        hardChef.cook();
        softChef.cook();

    }


}
