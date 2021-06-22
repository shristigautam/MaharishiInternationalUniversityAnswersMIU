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
public class IsContinuousFactoredNumber {
    public static void main(String[] args){
        int result = isContinuousFactored(121);
        System.out.println(result);
    }
    static int isContinuousFactored(int n){
        int factorsProduct; int factorsCount;
        for (int i = 2; i <= n/2; i++){
            if( n % i == 0 ) {
                factorsProduct = 1; factorsCount = 0;
                for (int j = i; j <= n/2; j++){
                    factorsProduct *= j; // harek choti tyo factor lai multiply gardai janxa jaba samma n hunna
                    factorsCount++;
                    if(factorsProduct == n && factorsCount > 1)
                        return 1;
                    if(factorsProduct > n)
                        break;
                }
            }
        }
        return 0;
    }
}
