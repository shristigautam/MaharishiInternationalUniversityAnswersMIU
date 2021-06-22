/**
*The Stanton measure of an array is computed as follows. Count the number of 1s in the array. Let this count be n.
* The Stanton measure is the number of times that n appears in the array. For example, the Stanton measure of 
* {1, 4, 3, 2, 1, 2, 3, 2} is 3 
* because 1 occurs 2 times in the array and 2 occurs 3 times.

* Write a function named stantonMeasure that returns the Stanton measure of its array argument.
* If you are programming in Java or C#, the function prototype is
* int stantonMeasure(int[ ] a)

 */
package MIU;

/**
 *
 * @author Shristi
 */
public class stantonMeasure {
    public static void main(String[] args) {
        int[] a= {1, 4, 3, 2, 1, 2, 3, 2};
        System.out.println(stantonMeasure(a)); //Returns 3 because 1 occurs 2 times and 2 occurs 3 times.
    }
    
    static int stantonMeasure(int[ ] a){
        int n=0;
        int nCount=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==1) n++;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==n) nCount++;
        }
        return nCount;
    }
    
}
