/*
A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers are 1 and any fancy 
number other than the first two is sum of the three times previous one and two times the one before that. See below: 
1,
1,
3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it returns 0.
The signature of the function is
   int isFancy(int n)
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class isFancy {
    public static void main(String[] args) {
        int n= 17;
        System.out.println(isFancy(n));
    }
    static int isFancy(int n){
        int a1=1;
        int a2=1;
        int result=0;
        int fancy=0;
        if(n==1) return 1;
        while(fancy<=n){
            fancy = 3*a2+ 2*a1;
            a1= a2;
            a2= fancy;

            if(fancy ==n){
                result =1;
                break;
            }
        }
        return result;
    }
}



