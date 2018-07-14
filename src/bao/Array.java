package bao;

public class Array {
   public static void main (String args[]){
           for (int i = 1 ; i < 10 ; i++){
                int a[]  = {12,344,54,5,46,5,6,45,65,6,7,4,53,5345};
                int s1 = a.hashCode();
                double s2 = s1/(System.currentTimeMillis());
              System.out.print(s1);
           }
       }
}
