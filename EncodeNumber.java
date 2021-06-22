/*
The fundamental theorem of arithmetic states that every natural number greater than 1 can be written as a unique product of prime
numbers. So, for instance, 6936=2*2*2*3*17*17. Write a method named EncodeNumber what will encode a number n as an array that
contains the prime numbers that, when multipled together, will equal n. So EncodeNumber(6936) would return the array {2, 2, 2, 3,
17, 17}. If the number is <= 1 the function should return null;
If you are programming in Jav
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class EncodeNumber {
    public static void main(String[] args) {
      int n =6;
      int[] b = encodeNumber(n);
      for(int i=0; i<b.length; i++){
        System.out.println(b[i]);
      }
    }
    //prime check garna jaruri xaina kinaki 2 to n samma divide garda prime matra factor hunxa, aru hunna
    static int[ ] encodeNumber(int n){
        int count =0;
        int num=n;
        if(n<=1) return new int[0];
        for(int i=2; i<=n; i++){ //don't forget i<=n; equal rakhna parxa natra lastko euta audaina
            while(n%i==0){ //evenly divide hunujel samma garne
                n=n/i;
                count++;
            }
        }
        int[] array = new int[count];
      
        n = num;
        int k=0;
        for(int j=2; j<=n; j++){
            while(n%j==0){
                array[k++]= j;
                n=n/j;
            }
        }
      return array;
    }
        
}
