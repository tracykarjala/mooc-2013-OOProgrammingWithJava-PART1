
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A", 100.00);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);
        transfer(A, B, 50.00);
        transfer(B, C, 25.00);
    }

    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }

}
