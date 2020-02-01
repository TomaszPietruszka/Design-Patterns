package eu.designPatterns.facade;

public class BankTransferSystem {

    private BankAccountDataSystem bankAccountDataSystem;


    public BankTransferSystem(BankAccountDataSystem bankAccountDataSystem) {
        this.bankAccountDataSystem = bankAccountDataSystem;
    }

    public void makeTransfer(int amount, String destAccountNumber) {
        bankAccountDataSystem.withdraw(amount);
        System.out.println("Wykonano przelew na kwotę: " + amount + " na numer konta" + destAccountNumber);
    }
}
