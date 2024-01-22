
package WW;

import java.util.ArrayList;

public class sdf {
    public static void main(String[] args) {
        sdkj d1= new sdkj("jahgiu",1245,57);
        sdkj d2= new sdkj("gd",1245,57);
        sdkj d3= new sdkj("jahgfghiu",1245,57);
        ArrayList<sdkj> a1=new ArrayList<>();
        a1.add(d1);
        a1.add(d2);
        a1.add(d3);
        System.out.println(a1.get(0));
        ArrayList<Integer> d5= new ArrayList<>();
        d5.add(d1.id);
        d5.add(d2.id);
        d5.add(d3.id);
        System.out.println(d5.get(0));
    }
 
}
