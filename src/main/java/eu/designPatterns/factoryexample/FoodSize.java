package eu.designPatterns.factoryexample;

public enum FoodSize {
    SMALL("Mała porcja"),
    NORMAL("Zwykła porcja"),
    XXL("Ogromna porcja");

    String description;

    FoodSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
