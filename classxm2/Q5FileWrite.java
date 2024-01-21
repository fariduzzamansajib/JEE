
package classxm2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Q5FileWrite {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Student/Desktop/Dir");
        dir.mkdir();
        System.out.println("Dir has been creayed");
        File f1= new File("C:/Users/Student/Desktop/Dir/sajib.txt");
        
        try{
            f1.createNewFile();
            System.out.println("File has been created");
            PrintWriter pw= new PrintWriter(f1);
            pw.write(101+ " Jannatul Prity");
            pw.flush();
            pw.close();
            System.out.println("File has been Writen");
             Scanner sc = new Scanner (f1);
             System.out.println("File has been Read");
            
            while(sc.hasNext()){
                
                System.out.println(sc.nextLine());
            
            
            
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
