
package classxm2;

import java.util.ArrayList;


public class Q2Test {
    public static void main(String[] args) {
        Q2SavingsAccount abu= new Q2SavingsAccount(100200,"abu hossian",2500);
        Q2SavingsAccount ema= new Q2SavingsAccount(100325,"ema",1500);
        Q2SavingsAccount prity= new Q2SavingsAccount(10035,"fd",3500);

        prity.transfer(abu, 100);
        System.out.println(prity.balance);
        System.out.println(abu.balance);

        ArrayList<Q2SavingsAccount> s1= new ArrayList<>();
        
        s1.add(abu);
        s1.add(ema);

    }
}
