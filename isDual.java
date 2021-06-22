/*
Define a Dual array to be an array where every value occurs exactly twice. 
For example, {1, 2, 1, 3, 3, 2} is a dual array.
The following arrays are not Dual arrays
{2, 5, 2, 5, 5} (5 occurs three times instead of two times)
{3, 1, 1, 2, 2} (3 occurs once instead of two times)
Write a function named isDual that returns 1 if its array argument is a Dual array. Otherwise it returns 
0.
If you are programming in Java or C#, the function signature is
   int isDual (int[ ] a)

 */
package MIU;

/**
 *
 * @author Shristi
 */
public class isDual {
    public static void main(String[] args) {
        int[] a ={1, 2, 1, 3, 3, 2};
        System.out.println(isDual(a));
    }
   static int isDual (int[ ] a){
        int count;
        int result=1;
        if(a.length%2!=0) return 0; //harek value exactly 2 choti aunalai array ko length even huna parxa
        for(int i=0; i<a.length; i++){
            count=0;
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]) count++;
            }
            if(count!=2) {
                result=0;
                break;
            }
     }
       return result; 
   }

}
