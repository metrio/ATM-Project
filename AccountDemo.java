public class AccountDemo {
    String accountdemo;

    double bal = 0;

    void Account(String name){
        this.accountdemo = name;
    }

    void Deposit(double deposit){
        this.bal += deposit;
        System.out.printf("Deposited $%.2f\n", deposit);
    }

    void Withdraw(double withdraw){
        if( withdraw > this.bal){
            System.out.printf("Insufficient funds, your account does not have $%f available", bal);
            System.out.printf("Your account cannot be zero, you must deposit more money first.");
        } else {
            this.bal -= withdraw;
            System.out.printf("You have Withdraw $%.2f, withdraw");
        }
    }

    double balance()
    {
        return this.bal;
    }
}
