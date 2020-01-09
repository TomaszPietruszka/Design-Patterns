package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.addition.Rice;
import eu.marcinszewczyk.factoryexample.sauces.SweetAndSourSauce;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witamy w chińskiej restauracji! Klient nasz pan!");

        Food food = new Chicken(new SweetAndSourSauce(), new Rice(), FoodSize.XXL, "smażony", 650);

        System.out.println(food.getDescription());
    }

}
