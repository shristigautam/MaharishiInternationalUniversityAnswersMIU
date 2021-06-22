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
import java.util.Arrays;
public class isSym {
    public static void main(String[] args) {
        int [] a={2,7,8,10,11,5,8};
        System.out.println(isSym(a));
    }
    static int isSym(int [] a){
        int [] left = new int [a.length];
        int [] right = new int [a.length];
        int result =1;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
                left[i]=0;
            else
                left[i]=1;
        }
        int k=0;
        for (int j = a.length-1; j>= 0; j--) {
            if(a[j]%2==0)
                right[k]=0;
            else
                right[k]=1;
            k++;
        }
        for (int m = 0; m < a.length; m++) {
            if(left[m] != right[m]){
                result=0;
                break;
            }
        }
        return result;
    }
}
