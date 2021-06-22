package MIU;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shristi
 */
public class primeCount {
    public static void main(String[] args) {
        int start= 5;
        int end = 5;
        int result = primeCount(start, end);
        System.out.println(result);
        
    }
    static int primeCount(int start, int end){
        int count=0;
        for (int num= start; num<=end; num++){
            int isprime=0; //Reset prime to 0 after each round, else muniko condition ma error auxa.
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    isprime++;
                }
            }
            if(isprime ==0){
               count++;
            }
        }
        return count;
    }
    
}
