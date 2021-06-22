/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class NextPerfectSquare {
    public static void main (String [] args){
        int result = NextPerfectSquare(0);
        System.out.println(result);
    }
        static int NextPerfectSquare(int n){
            int square=0; int i=1; //both int i=0 and int i=1 work, 1 garda 
                                    //euta loop kam lagne matra ho as 0*0=0
            while (square <= n){ //don't forget the = in <= as aaafai square vaye ni next square chainxa
                square = i*i;
                i++;
            }
//for(i=1; square<= n; i++){
//    square = i*i;
//}
            return square;
        }
}
