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
public class nUpCount {
    
    public static void main (String[] args){
        int [] a = new int [] {2,3,1,-6,8,-3,-1,2};
        int  n = 5;
//        int [] a = new int [] {1,2,-1,5,3,2,-3};
//        int  n = 20;
//         Answer is 0

        int result = nUpCount(a, n);
        System.out.println(result);
    }
    
    static int nUpCount(int a[], int n){
        int sumCount =0;
        int pSum=0;
        for(int i=0; i<a.length; i++){
            if(pSum<=n && pSum+a[i]>n){
                sumCount++;
            }
            pSum+=a[i]; // Remember to add the sum at last because suruko number
            //if n vanda athulo xa vane tyo ni counr hunxa. 
            //Example: {6,3,1) with n=6 returns 1;
        }
       return sumCount;

    }
    
}
