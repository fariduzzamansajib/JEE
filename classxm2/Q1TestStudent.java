
package classxm2;

import java.util.ArrayList;


public class Q1TestStudent {
    public static void main(String[] args) {
        Q1Student s1= new Q1Student(101,"sa@gmail.com",57,"Dhaka");
        Q1Student s2= new Q1Student(102,"dd@gmail.com",57,"Gazipur");
        
        ArrayList <Q1Student> list1= new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        System.out.println(list1.get(1).ShowAddress());
    }
}
