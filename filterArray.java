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
public class filterArray {
    public static void main(String[] args) {
        int [] a = {9, -9};
        int n = 1;
        int [] result= filterArray(a,n);
        System.out.println(Arrays.toString(result));
    }
    static int[ ] filterArray(int[ ] a, int n) {
        int count=0;
        int arraySize=0;
        int m=n;
        while(n!=0){
            count++; //overall binary sizeko lagi
            if(n%2==1){
                arraySize++; //array size ko lagi
            }
             n=n/2; //eslai last ma rakhna parxa
        }
        if(count > a.length) return new int[0];
        int[] result = new int[arraySize];
        int pos=0;
        int arrpos=0;
            while(m!=0){
                if(m%2==1){
                  result[pos]= a[arrpos];
                  pos++;
                }
                arrpos++;
                m=m/2;
            }
        return result;
    }
}
