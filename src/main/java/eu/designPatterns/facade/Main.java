package eu.designPatterns.facade;

public class Main {

    public static void main(String[] args) {
        BankLogin bankLogin = new BankLogin();
        BankAccountDataSystem bankAccountDataSystem = new BankAccountDataSystem();
        BankTransferSystem bankTransferSystem = new BankTransferSystem(bankAccountDataSystem);

        int transferAmount = 900;
        String receiverAccountNumber = "11133552544355";

        if (bankLogin.authorize("admin", "admin")) {
            int amountOnAccount = bankAccountDataSystem.checkAmountOnAccount();
            if (transferAmount <= amountOnAccount) {
                bankTransferSystem.makeTransfer(transferAmount, receiverAccountNumber);
            }
        }
        bankLogin.logOut();
    }


}
