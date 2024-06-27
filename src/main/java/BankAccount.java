import java.time.LocalDate;

public class BankAccount {

    private int balance = 100;
    private int dailyLimit = 3000;
    private int dailyWithdrawn = 0;
    private LocalDate lastWithdrawnDate = LocalDate.now();

    public int getBalance() {
        return balance;

    }


    public int deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be higher than 0");
            throw new IllegalArgumentException("Deposit must be higher than 0");
        } else {
            return balance += amount;
        }
    }

    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            throw new IllegalArgumentException("Insufficient funds");
        }
        if (amount <= 0) {
            System.out.println("Unsupported operation");
            throw new UnsupportedOperationException("Unsupported operation");
        } else {

            LocalDate currentDate = LocalDate.now();

            //if the current date is different from last withdrawn date then
            //update daily withdrawn to 0 and set last withdrawn date to current date
            if (!currentDate.isEqual(lastWithdrawnDate)) {
                dailyWithdrawn = 0;
                lastWithdrawnDate = currentDate;

            }
            dailyWithdrawn += amount;
            if (dailyWithdrawn > dailyLimit) {
                System.out.println("Daily limit is exceeded.Try again tomorrow.");
                throw new IllegalArgumentException("Daily limit is exceeded");
            }
        }
        return balance -= amount;
    }
}
