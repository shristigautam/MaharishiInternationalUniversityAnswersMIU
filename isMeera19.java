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
public class isMeera19 {
    public static void main(String[] args) {
        int[] n= {1, 10, 9};
        System.out.println(isMeera19(n));
    }
    
    static int isMeera19(int [] a){
       int hasNine=0;
       int hasOne=0;
       for(int i=0; i<a.length; i++){
           if(a[i]==1) hasOne=1;
           if(a[i]==9) hasNine=1;
       }
       if(hasNine==hasOne) return 1;
       else return 0;
    }
}
