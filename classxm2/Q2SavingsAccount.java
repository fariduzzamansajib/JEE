
package classxm2;

public class Q2SavingsAccount extends Q2Bank_trn {
    int accNumber;
    String accName;
    double balance;
      public void transfer(Q2SavingsAccount to, double amount){
      this.balance=this.balance-amount;
      to.balance=to.balance+amount;
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
    }
    public void withdrow(double amount){
        this.balance=this.balance-amount; 
    }

    public Q2SavingsAccount() {
    }

    public Q2SavingsAccount(int accNumber, String accName, double balance) {
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }
    
    
}
