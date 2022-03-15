import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        CheckingAccount account = new CheckingAccount(1000, 1);
        double withdraw = s.nextDouble();
        try{
            if(withdraw <= account.getBalance()){
                account.withdraw(withdraw);
                System.out.println("The balance after withdrawal is:" + account.getBalance());
            }
            else{
                throw new InsufficientFunds(account.getBalance());
            }
        }catch(InsufficientFunds e){
            System.out.println("Sorry but your account is short by:" + (withdraw - e.getAmount()));
        }
        

    }
    
}
