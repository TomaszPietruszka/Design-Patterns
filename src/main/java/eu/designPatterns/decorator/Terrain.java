package eu.designPatterns.decorator;

public abstract class Terrain {
    private String desc;
    private Integer fuelCost;

    public Terrain(String desc, Integer fuelCost) {
        this.desc = desc;
        this.fuelCost = fuelCost;
    }
    public abstract Integer getFuelCost() ;

    public String getDesc() {
        return "Teren to podstawa";
    }
}
