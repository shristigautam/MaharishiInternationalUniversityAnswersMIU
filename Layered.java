/*
An array is called layered if its elements are in ascending order and each element appears two or more
times. For example, {1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3, 3} and {3, 3, 1, 1, 1, 2, 2} are not. Write a
method named isLayered that accepts an integer array and returns 1 if the array is layered, otherwise it returns
0.
If you are programming in Java or C#, the function signature is
int isLayered(int[ ] a)
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class Layered {
    public static void main(String[] args) {
        int[] a= {} ;
        System.out.println(isLayered(a));
    }
    
    static int isLayered(int[ ] a){
        if(a.length<=0) return 0;
        int elem=a[0];
        int ascending=1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=elem) elem=a[i];
            else return 0;
        }
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++){
                if(a[i]==a[j]) count++;
            }
            if(count <2) return 0;
        }
        
        return 1;
    }
}
