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
public class matches {
    public static void main(String[] args) {
        int[ ] a ={1, 2, 3, -5, -5, 2, 3, 18};
        int[ ] p ={3,-2,3};
        System.out.println(matches(a,p));
    }
    static int matches(int[ ] a, int[ ] p){
        
        int isMatched = 1;
        int k = 0; //like counter in madhav array
        for (int i = 0 ; i < p.length; i++){
            int nCount = 0;
            int pCount= 0;
            for (int j = k; j < k+absolute(p[i]); j++){
                if(p[i] < 0 && a[j] < 0){
                    nCount++;
                }
                if(p[i] > 0 && a[j] > 0){
                    pCount++;
                }
            }
            if(nCount != absolute(p[i]) && pCount != absolute(p[i])){//Logic: euta ta always not equal nai hunxa, 
                                                                    //duitai not equal vo vane chai result nai false;
                isMatched = 0;
                break;
            }
            k = k+absolute(p[i]);
        }
        return isMatched;
        
    }
    
    static int absolute (int a){
        if (a<0) return -a;
        else return a;
    }
}
