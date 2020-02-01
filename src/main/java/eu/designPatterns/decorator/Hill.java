package eu.designPatterns.decorator;

public class Hill extends Terrain {
    public Hill() {
        super("Wzgorze", 20);
    }

    public Integer getFuelCost() {
        return 20;
    }
}
