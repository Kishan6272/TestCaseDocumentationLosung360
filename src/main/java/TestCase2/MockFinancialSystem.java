package TestCase2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockFinancialSystem {
    private Map<Long, Integer> accountBalances = new HashMap<>(); // Map to store account balances
    private List<Transaction> transactions = new ArrayList<>();  // List to store transaction history

    // Simulate user login (replace with actual implementation)
    public boolean login(String username, String password) {
        // Implement login logic here (e.g., check username and password)
        return true; // Assuming successful login for testing
    }

    // Simulate setting account balance (replace with actual implementation)
    public void setAccountBalance(long accountNumber, int balance) {
        accountBalances.put(accountNumber, balance);
    }

    // Simulate getting account balance (replace with actual implementation)
    public int getAccountBalance(long accountNumber) {
        return accountBalances.getOrDefault(accountNumber, 0); // Return 0 for non-existent accounts
    }

    // Simulate transferring funds (replace with actual implementation)
    public boolean transferFunds(long sourceAccount, long destinationAccount, int amount) throws InsufficientFundsException {
        if (getAccountBalance(sourceAccount) < amount) {
            throw new InsufficientFundsException("Insufficient funds in source account");
        }
        accountBalances.put(sourceAccount, getAccountBalance(sourceAccount) - amount);
        accountBalances.put(destinationAccount, getAccountBalance(destinationAccount) + amount);
        transactions.add(new Transaction(sourceAccount, destinationAccount, amount));
        return true;
    }

    // Getter for transaction history
    public List<Transaction> getTransactionHistory() {
        return transactions;
    }
}
