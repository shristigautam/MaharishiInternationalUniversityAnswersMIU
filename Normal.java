/*
A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0.
Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd
factor. 10 is not a normal number since 5 is an odd factor. The function signature is 
int isNormal(int n)
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class Normal {
    public static void main(String[] args){
        int result = isNormal(8);
        System.out.println(result);
    }
    static int isNormal(int n){
        if(n <= 0)
            return 0;
        int isNormal = 1;
        for (int i = 2; i <= n/2; i++){ // 2 dekhi loop lako as 1 hunu hunna
            if(n % i == 0 && i % 2 == 1){ //n%i==0 filters factors and i%2==1 checks if the factor is odd
                isNormal = 0; break;
            }
        }
        return isNormal;
    }
}
