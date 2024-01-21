
package classxm2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Q4ObjectWrite {

    public static void main(String[] args) {

        Q4Object s1 = new Q4Object("Jahir", 123, "Java");
        Q4Object s2 = new Q4Object("Preety", 1323, "Javascript");

        File file1 = new File("C:/Intel/sajib.txt");
        try {
            file1.createNewFile();
            // write Object in a file
            FileOutputStream file2 = new FileOutputStream(file1);
            ObjectOutputStream obj = new ObjectOutputStream(file2);

            obj.writeObject(s1);
            obj.writeObject(s2);
            
            obj.flush();
            obj.close();

            //read object in a file
            FileInputStream file3 = new FileInputStream(file1);
            ObjectInputStream obj1 = new ObjectInputStream(file3);

            Q4Object r = (Q4Object) obj1.readObject();
            Q4Object r2 = (Q4Object) obj1.readObject();
            
            obj1.close();

            System.out.println(r);
            System.out.print(r2);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
