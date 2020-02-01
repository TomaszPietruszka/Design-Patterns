package eu.designPatterns.decorator;

public class Plain extends Terrain {
    public Plain() {
        super("Rownina", 10);
    }

    public Integer getFuelCost() {
        return 10;
    }
}
