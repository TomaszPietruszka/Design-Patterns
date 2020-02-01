package eu.designPatterns.templateexample;

public class SoftChef {

    private String name;

    public SoftChef(String name) {
        this.name = name;
    }

    public void cook(){
        System.out.println(name + " nastawia wodę");
        System.out.println(name + " gotuje jajka na miękko");
        System.out.println(name + " serwuje jajko gościom");
    }
}
