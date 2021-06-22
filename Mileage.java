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

public class Mileage {
    public static void main(String[] args) {
        int[] a={9,9,9,9,9,9,9};
        int n=1;
        updateMileageCounter(a,n);
    }
    
    static void updateMileageCounter(int[] a, int miles){
        int carry = 0; int sum;
        for (int i = 0; i < a.length; i++){
            sum = a[i] + miles % 10 + carry;
            if(sum < 10){
                a[i] = sum; carry = 0;
            }
            else{
                a[i] = sum % 10; carry  = 1;
            }
            miles /= 10;
            if(miles == 0 && carry == 0)
                break;
        }
        System.out.println(Arrays.toString(a));

    }
}





//    static int[] f(int[] a, int n){
//        int[] array=new int[a.length];
//        int sum=0;
//        int factor=1;
//        for (int i = a.length-1; i >=0; i--) { //array to number convert
//            sum=sum+a[i]*factor;
//            System.out.println(factor);
//            factor*=10;
//            
//        }
//        int s=sum;
//        int d=0;
//        while(sum!=0){ //reverse garne
//            int digit=sum%10;
//            d=d*10+digit;
//            sum=sum/10;
//        }
//
//        d=d+n; //add n to Mileage
//        int j=0;
//      while(d!=0){
//            if(j<a.length){ //add to array
//                 array[j]=d%10;
//            }
//            d=d/10; 
//           j++;
//
//            
//        }
//        return array;
//    }
//}   
