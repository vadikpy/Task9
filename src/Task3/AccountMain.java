package Task3;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("Vadym Sonin", 1234, "1");

        System.out.println("Account Owner: " + account.getOwner());
        System.out.println("Initial Balance: " + account.getBalance() + " PLN");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println();

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        } finally {
            System.out.println("Current account balance: " + account.getBalance() + " PLN");
        }
    }
}
