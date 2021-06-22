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
public class FillArray {
    public static void main(String[] args){
        int[] a =  {4,2,-3,12};
        int[] result = fillArray(a, 3, 5);
        for(int k=0; k<result.length; k++)
        System.out.println(result[k]);
    }
    static int[] fillArray(int[] a,int k,  int n){
    int [] arr2 = new int[n];
    if(n<=0 || k<=0){
        return new int[0];
    }
    int j=0;
    for(int i=0; i< arr2.length; i++){
         arr2[i]= a[j];
         j++;
         if(j==k){
             j=0;
         }
    }
    return arr2;
    }
}
