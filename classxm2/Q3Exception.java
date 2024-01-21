
package classxm2;


public class Q3Exception {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=a/b;
        int [] arr= new int[5];
        int value= arr[4];
        
        String x=null;
        
        try{
            System.out.println(c);
            System.out.println(x);
            System.out.println(arr);
           
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
