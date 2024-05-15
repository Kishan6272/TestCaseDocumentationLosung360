package TestCase2;

public interface FinancialSystem {
    public static void login(String user, String password) {
    }

    public static void setAccountBalance(long sourceAccount, int i) {
    }

    public default boolean transferFunds(long sourceAccount, long destinationAccount, int amount) {
    }

    public static int getAccountBalance(long sourceAccount) {
        return 0;
    }

    public default String getTransactionHistory() {
        return null;
    }
}
