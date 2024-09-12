package ThreadsLab;

import java.util.function.IntUnaryOperator;

public class BankAccount {
    private double  balance; //Balance variable to store the account balance

    //Constructor initializing the balance to a certain value:
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    //Synchronized method to deposit money:
    public synchronized void deposit(double amount) {
        if(amount>0){
            balance += amount;
            System.out.print("Deposited " +amount+ " and the new balance is " +balance);
            System.out.println(" ");
        }else{
            System.out.print("Deposit amount should be greater than 0");
        }
    }

    //Synchronized method to withdraw money:
    public synchronized void withdraw(double amount){
        if(amount > 0){
            if(balance >= amount){
                balance -= amount;
                System.out.print("Withdrawn amount: " +amount+ " New balance: " +balance);
                System.out.println(" ");
            }else{
                System.out.println("Insufficient funds. Current Balance: " + balance);
            }
        }else{
            System.out.println("Withdrawal amount must be more than zero please.");
        }
    }

    public synchronized double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        DepositThread deposit1 = new DepositThread(account, 500);
        DepositThread deposit2 = new DepositThread(account, 300);

        Thread withdraw1 = new Thread(new WithdrawThread(account, 200));
        Thread withdraw2 = new Thread(new WithdrawThread(account, 400));

        deposit1.start();
        deposit2.start();
        withdraw1.start();
        withdraw2.start();

        try {

            deposit1.join();
            deposit2.join();
            withdraw1.join();
            withdraw2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Balance: " + account.getBalance());
    }
}
