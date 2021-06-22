/*
 * The sum factor of an array is defined to be the number of times that the sum of the array appears as an element of the
 * array. So the sum factor of {1, -1, 1, -1, 1, -1, 1} is 4 because the sum of the elements of the array is 1 and 1 appears four
 * times in the array. And the sum factor of
 * {1, 2, 3, 4} is 0 because the sum of the elements of the array is 10 and 10 does not occur as an element of the array. The
 * sum factor of the empty array { } is defined to be 0.
 * Write a function named sumFactor that returns the sum factor of its array argument.
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class sumFactor {
    public static void main(String[] args) {
        int[] a=  {1, -1, 1, -1, 1, -1, 1};
        System.out.println(sumFactor(a));
    }
    static int sumFactor(int[ ] a){
        int sum=0;
        int sumCount=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==sum) sumCount++;
        }
        return sumCount;
    }
}
