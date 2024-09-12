package ThreadsLab;

    public class WithdrawThread implements Runnable {
        private BankAccount account;
        private double amount;


        public WithdrawThread(BankAccount account, double amount) {
            this.account = account;
            this.amount = amount;
        }


        @Override
        public void run() {
            account.withdraw(amount);
        }
}
