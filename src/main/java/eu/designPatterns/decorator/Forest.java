package eu.designPatterns.decorator;

public class Forest extends TerrainDecorator {

    public Forest(Terrain terrain) {
        super(terrain);
    }

    public Integer getFuelCost() {
        return terrain.getFuelCost() + 15;
    }
}
