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
public class PorcupineNumber {
        public static void main(String[] args) {
        int n = 0; //139 first and Next 409,709,829 auxa 
        System.out.println(findPorcupineNumber(n));
    }
        
    static int findPorcupineNumber(int n){
        int has9=0;
        int porcupine=0;
        for(int i=n+1; i<Integer.MAX_VALUE; i++){
            if(isPrime(i)==1){
                if(has9==0){
                    if(i%10==9) {
                        has9=1;
                        porcupine=i;
                    }
                }
                else{
                   if(i%10==9) {
                        break;
                    } 
                   else
                     has9=0;  
                }
            }
        }
        return porcupine;
    }
    
    static int isPrime(int n){
        if (n<=1) return 0;
        for(int i =2; i*i<=n; i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
}
