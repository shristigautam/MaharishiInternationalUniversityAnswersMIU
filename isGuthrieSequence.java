/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIU;

/**
 *
 * @author Shristi
 * 
 * 2nd number la euta variable banaune, ani first lai even/odd anusar calculate garera arko variable(n) ma rakhne
 * Ani 2nd ra firstko n value milyo vane n=0, currentNum=i+2 if currentNum !=1 and continue
 */
public class isGuthrieSequence {
    public static void main(String[] args) {
        int[] array= {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};
        System.out.println(isGuthrieSequence(array));
    }
    
    static int isGuthrieSequence(int[ ] a){
        int currentNum=a[1];
        int result=0;
        if(a[a.length-1]!=1) return 0; //last ma 1 xainxa vane return 0
        for(int i=0; i<a.length; i++){
            int n=0;
            if(a[i]%2==0){ //even hudako case
                n=a[i]/2;
            }
            else{ //odd hudako case
                n=a[i]*3 +1;
            }
            if(n!=currentNum){
               result=1;
               break;
            }
            else{
                if(currentNum !=1){ //1 vayesi ni ++ garyo vane error auxa
                   currentNum = a[i+2];
                }
                else{
                    break; //natra 1 huda ni loop chalxa as 1 last element ho, so for loop le tesko ni loop lauxa
                }
            }
        }
        return result==0 ? 1: 0;
    }
}

/**
 * Vyaye try with while loop
 * 
*/