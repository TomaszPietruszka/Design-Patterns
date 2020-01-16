package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.addition.Addition;
import eu.marcinszewczyk.factoryexample.sauces.Sauce;

public class Pork extends Food {

    public Pork(Sauce sauce, Addition addition, FoodSize size, String additionalDescription, int calories) {
        super(sauce, addition, size, additionalDescription, calories);
    }

    @Override
    public String getBaseDescription() {
        return "wieprzowina";
    }
}
