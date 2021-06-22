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
public class HasKSmallfactors {
    public static void main(String[] args){
        boolean result = hasKSmallFactors(10, 20);
        System.out.println(result);
    }
    static boolean hasKSmallFactors(int k, int n){
        if(k <= 0 || n <= 0)
            return false;
        for (int i = 1; i < k; i++){ //k vanda kam ko number matra check garne
            if(n%i==0&& n/i < k){ //4*5=20 ho vane, 4 i vayo and n/i chai 5 vayo
                System.out.println(i);
                return true;
            }

        }
        return false;
    }
}
