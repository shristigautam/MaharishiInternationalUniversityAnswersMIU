/*
convertToBase10(new int[ ] {1, 0, 1, 1}, 2) returns 11
convertToBase10(new int[ ] {1, 1, 2}, 3) returns 14
convertToBase10(new int[ ] {3, 2, 5}, 8) returns 213
convertToBase10 (new int[ ] {3, 7, 1}, 6) returns 0 because 371 is not a legal base 6 number.
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class ConvertToBase10 {
    public static void main(String[] args){
        int[] a = {3, 5, 1};
        int result = convertToBase10(a, 6);
        System.out.println(result);
    }
    static int convertToBase10(int[] a, int base){
        int isLegal = 1;
        int base10Number = 0;
        for (int i = 0; i <  a.length; i++){
            if(a[i] < 0 || a[i] >= base){ //because base vanda thulo kaile hudaina.Eg:Base 2 ma each number 1 ya 0 hunxa
                isLegal = 0;
                break;
            }
        }
        if(isLegal == 1){
            int k=a.length-1; //k ulto bata huna parxa as agadiko number ko power badhi hunxa
            for(int j=0; j<a.length; j++){
              base10Number += a[j] * power(base, k--);  
            }
//            for (int j = a.length-1, k = 0; j >= 0; j--, k++){ //This also works..k loop is for power kinaki suruko number ko power 
//                                                               //greatest hunxa and last ko 0
//                base10Number += a[j] * power(base, k);
//            }
            return base10Number;
        }
        else{
            return -1;
        }         
    }
    
    static int power(int base, int power){ //Math.pow(base, power) use garna paidaina hola, so tesko satta
        int answer=1;
           for(int i=1;i<=power;i++){
               answer*=base;
           }
        return answer;
     }
}
