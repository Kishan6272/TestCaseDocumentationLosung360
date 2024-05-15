package TestCase2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FinancialTransaction implements FinancialSystem {

    @Test
    public void testSuccessfulTransaction() throws Exception, InsufficientFundsException {
        // Arrange
        long sourceAccount = 123456;
        long destinationAccount = 654321;
        int amount = 10000;
        // Mock financial system (replace with actual implementation)
        MockFinancialSystem financialSystem = new MockFinancialSystem();
        financialSystem.login("user", "password");
        ((MockFinancialSystem) financialSystem).setAccountBalance(sourceAccount, 20000);

        // Act
        boolean success = financialSystem.transferFunds(sourceAccount, destinationAccount, amount);

        // Assert
        assertTrue(success, "Transaction failed");
        assertEquals(financialSystem.getAccountBalance(sourceAccount), 10000, "Source account balance incorrect");
        assertEquals(financialSystem.getAccountBalance(destinationAccount), 10000, "Destination account balance incorrect");
        assertTrue(financialSystem.getTransactionHistory().contains(new Transaction(sourceAccount, destinationAccount, amount)), "Transaction not recorded in history");
    }

    @Test
    public void testInsufficientFunds() throws Exception {
        // Arrange
        long sourceAccount = 123456;
        long destinationAccount = 654321;
        int amount = 10000;
        // Mock financial system (replace with actual implementation)
        FinancialSystem financialSystem = new FinancialSystem() {
            @Override
            public void login(String user, String password) {

            }

            @Override
            public void setAccountBalance(long sourceAccount, int i) {

            }

            @Override
            public boolean transferFunds(long sourceAccount, long destinationAccount, int amount) {
                return false;
            }

            @Override
            public int getAccountBalance(long sourceAccount) {
                return 0;
            }

            @Override
            public String getTransactionHistory() {
                return null;
            }
        };
        financialSystem.login("user", "password");
        financialSystem.setAccountBalance(sourceAccount, 5000);

        // Act
        boolean success = financialSystem.transferFunds(sourceAccount, destinationAccount, amount);

        // Assert
        assertFalse(success, "Transaction should have failed");
        assertEquals(financialSystem.getAccountBalance(sourceAccount), 5000, "Source account balance should not change");
        assertEquals(financialSystem.getAccountBalance(destinationAccount), 0, "Destination account balance should not change");
        assertFalse(financialSystem.getTransactionHistory().contains(new Transaction(sourceAccount, destinationAccount, amount)), "Transaction should not be recorded in history");
    }

    @Test
    public void testInvalidAccountNumber() throws Exception {
        // Arrange
        long sourceAccount = 123456;
        long invalidAccount = 999999;
        int amount = 10000;
        // Mock financial system (replace with actual implementation)
        FinancialSystem financialSystem = new MockFinancialSystem();
        financialSystem.login("user", "password");
        financialSystem.setAccountBalance(sourceAccount, 20000);

        // Act
        boolean success = financialSystem.transferFunds(sourceAccount, invalidAccount, amount);

        // Assert
        assertFalse(success, "Transaction should have failed");
        assertEquals(financialSystem.getAccountBalance(sourceAccount), 20000, "Source account balance should not change");
        // No assertion needed for destination account as transaction shouldn't reach there
        assertFalse(financialSystem.getTransactionHistory().contains((CharSequence) new Transaction(sourceAccount, invalidAccount, amount)), "Transaction should not be recorded in history");
    }


    @Override
    public void login(String user, String password) {

    }

    @Override
    public void setAccountBalance(long sourceAccount, int i) {

    }

    @Override
    public boolean transferFunds(long sourceAccount, long destinationAccount, int amount) {
        return false;
    }

    @Override
    public int getAccountBalance(long sourceAccount) {
        return 0;
    }

    @Override
    public String getTransactionHistory() {
        return null;
    }
}
