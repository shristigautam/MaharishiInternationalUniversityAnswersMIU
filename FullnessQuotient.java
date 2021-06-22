/*
Define the fullness quotient of an integer n > 0 to be the number of
representations of n in bases 2 through 9 that have no zeroes anywhere after
the most significant digit. For example, to see why the fullness quotient of
94 is 6 examine the following table which shows the representations of 94
in bases 2 through 9.
Notice that the representations of 94 in base 2 and 3 both have 0s  somewhere after the most significant digit, but the representations in bases 4, 5, 6, 7, 8, 9 do not. Since there are 6 such
representations, the fullness quotient of 94 is 6.
Write a method named fullnessQuotient that returns the fullness quotient of its argument. If the argument is less than 1 return -1. Its
signature is
int fullnessQuotient(int n)
Hint: use modulo and integer arithmetic to convert n to its various representation

 */
package MIU;

/**
 *
 * @author Shristi
 */
public class FullnessQuotient {
        public static void main(String[] args){
        int result = fullnessQuotient(-4);
        System.out.println(result);
    }
    static int fullnessQuotient(int n){
        int fullnessQuotient = 0; int full=0;
        if(n<0){
            return -1;
        }
        for (int i = 2; i <= 9; i++){
            int m=n;
            int basenumber=0;
            int count=0;
            while(m!=0){
                basenumber= m%i;
                m=m/i;
                if(basenumber==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                fullnessQuotient++;
            }
        }
        
//        for (int i = 2; i <= 9; i++){ //question ma vaneko xa 2-9 samma ko binary nikal vanera
//            int m = n; String iBasedNum = ""; full = 1;
//            while(m != 0){
//                iBasedNum += m % i;
//                m /= i;
//            } //Base ninakelko 2 dekhi 9 samma divide garera each ko
//            
//            //Tyo base ma 0 xaki xaina check gareko, 0 aayo vane full =0 natra count badhaune
//            for (int j = 0; j < iBasedNum.length(); j++){
//                if(j<iBasedNum.length()-1 && iBasedNum.charAt(j) == '0'){
//                    full = 0;
//                    break;
//                }
//            }
//            if(full==1){
//               fullnessQuotient++; 
//            }
//
//        }
        return fullnessQuotient;
    }
}
