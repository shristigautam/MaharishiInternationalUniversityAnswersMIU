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
public class largestPrimeFactor {
        public static void main(String[] args){
        int result = largestPrimeFactor(6936);
        System.out.println(result);
    }
    static int largestPrimeFactor(int n){
        int result=0;
        if(n <= 1)
            return 0;
        for (int i = 2; i <= n; i++){
            while(n%i==0){
                n=n/i;
            }
            result=i; //assign garena vane bahira gara sidhai i return garda ek step badhera audo raixa
        }
        return result;
    }
}
