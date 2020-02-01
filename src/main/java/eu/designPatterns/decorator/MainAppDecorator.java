package eu.designPatterns.decorator;

public class MainAppDecorator {

    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain plain = new Plain();
        Terrain hill = new Hill();

        final Terrain terrain = new Forest(plain);

        System.out.println(terrain.getDesc() + " Bagnista rownina przez las :"  + terrain.getFuelCost());

    }

}
