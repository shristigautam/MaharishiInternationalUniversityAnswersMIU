/*
An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements 
sum to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual,
otherwise it returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0} is a dual 
array (because 1+2 = 2+1 = 3+0 = 3), {1, 1, 2, 2} is not a dual array (because 1+1 is not equal to 2+2), 
{1, 2, 1} is not a dual array (because array does not have an even number of elements), {} is a dual array. 
If you are programming in Java or C#, the function signature is int isDual(int[ ] a)
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class DualArray {
    public static void main(String[] args) {
	    int[] a = {1,2,2,1,0,3};
	    int result = isDual(a);
		System.out.println(result);
	}
    
    static int isDual(int[] a){
        if(a.length==0) return 1;
        if (a.length %2 != 0) return 0;
        int sum1 = a[0]+a[1];
            for (int i=2; i<a.length-1; i=i+2){
                if(sum1 != a[i]+ a[i+1]) {
                    return 0;
                }
            }
        return 1;
    }
    
}
