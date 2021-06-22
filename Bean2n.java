/*
A Bean array is defined to be an integer array where for every value n in the array, there is also an element 2n, 2n+1 
or n/2 in the array. 
For example, {4, 9, 8} is a Bean array because
For 4, 8 is present; for 9, 4 is present; for 8, 4 is present.
Other Bean arrays include {2, 2, 5, 11, 23}, {7, 7, 3, 6} and {0}.
The array {3, 8, 4} is not a Bean array because of the value 3 which requires that the array contains either the value 6, 7 
or 1 and none of these values are in the array.
Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it returns a 0.
If you are programming in Java or C#, the function signature is
   int isBean(int[ ] a)

 */
package MIU;

/**
 *
 * @author Shristi
 */
public class Bean2n {
    public static void main(String[] args) {
        int[] a= {4,9,8};
        System.out.println(Bean2n(a));
    }
    static int Bean2n(int []a){
        int bean=0;
        for(int i=0; i<a.length; i++){
            int has2n=0; //set all to 0 after each loop
            int has2n1=0;
            int hasnBy2=0;
            bean=0;
            for(int j=0; j<a.length; j++){
                if(a[j]== 2* a[i])
                    has2n=1;
                if(a[j]==2*a[i]+1)
                    has2n1=1;
                if(a[j]==a[i]/2)
                    hasnBy2=1;
            }
            if(has2n==1 || has2n1==1 || hasnBy2==1)
                bean=1;
            else
            {
                break;
            }
        }
       return bean; 
    } 
}
