/*
Define an array to be trivalent if all its elements are one of three different values. For example, {22, 19, 10, 10, 19, 22, 22, 10} is
trivalent because all elements are either 10, 22, or 19. However, the array {1, 2, 2, 2, 2, 2, 2} is not trivalent because it contains only two
different values (1, 2). The array {2, 2, 3, 3, 3, 3, 2, 41, 65} is not trivalent because it contains four different values (2, 3, 41, 65).
Write a function named isTrivalent that returns 1 if its array argument is trivalent, otherwise it returns 0.
If you are writing in Java or C#, the function signature is
 int isTrivalent (int[ ] a)

 */
package MIU;

/**
 *
 * @author Shristi
 */
public class isTrivalent {
    public static void main(String[] args) {
        int [] a=  {22, 19, 10, 10, 19, 22, 22, 10};
        System.out.println(isTrivalent(a));
    }
    static  int isTrivalent (int[ ] a){
        int count=0;
        for(int i=0; i<a.length; i++){
            int j=0;
            for (j = 0; j < a.length; j++) {
                if(a[i]==a[j]) break;
            }
            if(i==j) count++;
        }
        
        if(count==3) return 1;
        else
        return 0;
    }

}
