package eu.designPatterns.strategyexample;

public class HardChef {

    private String name;

    public HardChef(String name) {
        this.name = name;
    }

    public void cook(){
        System.out.println(name + " nastawia wodę");
        System.out.println(name + " gotuje jajka na twardo");
        System.out.println(name + " serwuje jajko gościom");
    }
}
