package eu.designPatterns.templateMethod2;

public class MainAppTemplateMethod {

    public static void main(String[] args) {
        DeveloperDay developerDay = new DeveloperDay();
        developerDay.everyDayIsExactlyTheSame(TypeOfTransport.CAR);

        EconomistDay economistDayDay = new EconomistDay();
        economistDayDay.everyDayIsExactlyTheSame(TypeOfTransport.WALK);
    }

}
