
package classxm2;

import java.io.Serializable;


public class Q4Object implements Serializable {
    
    String name;
    int Roll;
    String subject;

    public Q4Object() {
    }

    public Q4Object(String name, int Roll, String subject) {
        this.name = name;
        this.Roll = Roll;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Name=" + name + ",\nRoll=" + Roll + ",\nSubject=" + subject ;
    }
    
    
    
    
  
}
