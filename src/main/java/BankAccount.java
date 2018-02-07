//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
@SuppressWarnings({"checkstyle:all", "unused"})
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        setOwnerName(name);
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public void setAccountBalance(double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
    public void setOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }
    public double getInterestEarned() {
        return this.interestEarned;
    }
    public void setInterestEarned(double newInterestEarned) {
        this.interestEarned = newInterestEarned;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
