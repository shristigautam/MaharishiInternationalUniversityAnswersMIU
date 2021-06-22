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
public class SumSafe {

    public static void main(String[] args) {
        int[] a={5, -4, 1};
//        int[] a={5, -5, 0};
        int result =f(a);
        System.out.println(result);
    }
    private static int f(int[] a){
        int sum=0;
        if(a.length==0){
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
//        if(sum==0){
//            return 0;
//        }
        for (int i = 0; i < a.length; i++) {
            if (sum==a[i]) {
                return 0;
            }
        }
        return 1;
    }
}