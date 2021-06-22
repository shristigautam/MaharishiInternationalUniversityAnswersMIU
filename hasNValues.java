package MIU;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shristi
 */
public class hasNValues {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} ;
        int n= 10;
        System.out.println(hasNValues(a,n));
    }
    
    static int hasNValues(int[ ] a, int n){
        int count=0;
        int j;
        for(int i=0; i<a.length; i++){
            for(j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    break;
                }
            }
            if(i==j){
                count++;
            }
        }
        
        if(count==n){
            return 1;
        }
        else
            return 0;
    }
}
