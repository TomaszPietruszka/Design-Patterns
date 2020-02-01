package eu.designPatterns.facade;

public class BankAccountDataSystem {

    private int amount;

    public int checkAmountOnAccount() {
        amount = 1000;
        return amount;
    }

    public void withdraw(int amountToWithDraw) {
        amount -= amountToWithDraw;
        System.out.println("Wycofano " + amountToWithDraw + " z konta");
        System.out.println("Pozostało " + amount);
    }
}
