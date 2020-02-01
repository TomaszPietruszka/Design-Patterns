package eu.designPatterns.decorator;

public class Swamp extends TerrainDecorator {

    public Swamp(Terrain terrain) {
        super(terrain);
    }

    public Integer getFuelCost() {
        return terrain.getFuelCost() + 20;
    }
}
