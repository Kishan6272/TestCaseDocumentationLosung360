package DemoPrachi;

import java.util.Objects;

public class Transaction {

    private final long sourceAccount;
    private final long destinationAccount;
    private final int amount;

    public Transaction(long sourceAccount, long destinationAccount, int amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public long getSourceAccount() {
        return sourceAccount;
    }

    public long getDestinationAccount() {
        return destinationAccount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return sourceAccount == that.sourceAccount &&
                destinationAccount == that.destinationAccount &&
                amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceAccount, destinationAccount, amount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sourceAccount=" + sourceAccount +
                ", destinationAccount=" + destinationAccount +
                ", amount=" + amount +
                '}';
    }
}
