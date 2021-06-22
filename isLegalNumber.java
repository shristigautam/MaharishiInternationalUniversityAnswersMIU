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
public class isLegalNumber {
    public static void main(String[] args) {
       int [] a= {3, 7, 1};
       int n =6;
        System.out.println(isLegalNumber(a,4));
    }
    static int isLegalNumber(int[] a , int base){
        int islegal=1;
        for(int i=0; i<a.length; i++){
            if(a[i]>base){
                islegal=0;
                break;
            }
        }
        return islegal;
    }
}
