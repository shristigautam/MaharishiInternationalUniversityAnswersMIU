/*
Write a function named sameNumberOfFactors that takes two integer arguments and returns 1 if they have
the same number of factors. If either argument is negative, return -1. Otherwise return 0.
int sameNumberOfFactors(int n1, int n2) 

if n1 is    and n2 is               return
-6          21                       -1 (because one of the arguments is negative)
6           21                        1(because 6 has four factors (1, 2, 3, 6) and so does 21 (1, 3, 7, 21)
8           12                        0 (because 8 has four factors(1, 2, 4, 8) and 12 has six factors (1, 2, 3, 4, 6, 12)
23          97                        1 (because 23 has two factors (1, 23) and so does 97 (1, 97))
0           1                         0 (because 0 has no factors, but 1 has one (1))
0           0                         1 (always true if n1 == n2)
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class sameNumberOfFactors {
    public static void main(String[] args) {
        int a=8;
        int b=12;
        System.out.println(sameNumberOfFactors(a,b));
    }
    static int sameNumberOfFactors(int n1, int n2) {
        int count1=0;
        int count2=0;
        if(n1<0 ||n2<0) return -1; //euta negative vako case
        if(n1==n2) return 1; //duita same vako case
        for(int i=1; i<=n1; i++){ //don't do n/2 because 1 vako case ma mildaina as 1/2 is 0 in programming
            if(n1%i==0){
                count1++;
            }
        }
        for(int j=1; j<=n2; j++){
            if(n2%j==0){
                count2++;
            }
        }
        if(count1==count2) return 1;
        else
        return 0;
    }
}


