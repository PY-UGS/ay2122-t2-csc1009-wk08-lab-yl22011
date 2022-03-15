
public class CheckingAccount {

    private double balance;
    private double accountno;

    public CheckingAccount(double balance, double accountno) {
        this.balance = balance;
        this.accountno = accountno;
    }


    public void deposit(double amount){
        this.balance =balance + amount;
    }

    public void withdraw(double amount){
        this.balance = balance - amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getNumber(){
        return this.accountno;
    }
}
