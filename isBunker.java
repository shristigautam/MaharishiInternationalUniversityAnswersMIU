/*
An integer is defined to be a Bunker number if it is an element in the infinite sequence 1, 2, 4, 7, 
11, 16, 22,  … Note that 2­1=1, 4­2=2, 7­4=3, 11­7=4, 16­11=5 so for k>1, the kth element of the 
sequence is equal to the k­1th element + k­1. E.G., for k=6, 16 is the kth element and is equal to 11 
(the k­1th element) + 5 (k­1).
Write function named isBunker  that returns 1 if its argument is a Bunker number, otherwise it returns 
0. So isBunker(11) returns 1, isBunker(22) returns 1 and isBunker(8) returns 0 .
The function signature 
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class isBunker {
    public static void main(String[] args) {
        int n= 7;
        System.out.println(isBunker(n));
    }
    static int isBunker(int n){
        int numMinus1=1;
        int num=2;
        int result=0;
        int temp=0;
        if(n==1) return 1;
        for(int i=1; i<=n; i++){
            temp = numMinus1+i;
            numMinus1= temp;
            num= numMinus1;
            if(temp ==n){
                result =1;
                break;
            }
        }
        return result;
    }
}
