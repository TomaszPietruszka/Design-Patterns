package eu.designPatterns.facade;

public class BankLogin {
    public boolean authorize(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            System.out.println("zalogowano poprawnie");
            return true;
        }
        System.out.println("Niepoprawne dane do logowania");
        return false;
    }

    public boolean logOut() {
        System.out.println("Wylogowano");
        return true;
    }


}
