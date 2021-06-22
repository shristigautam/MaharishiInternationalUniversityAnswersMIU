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
public class Meera {
    public static void main(String[] args) {
        int[] a={6,10,1,0,7};
        System.out.println(isMeera(a));
    }
    
    static int isMeera(int[] a){
        int hasPrime=0;
        int hasZero=0;
        
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i]))
                hasPrime=1;
            if(a[i]==0)
                hasZero=1;
        }
        if(hasPrime==hasZero)
            return 1;
        else
            return 0;
                  
        }
    
    static boolean isPrime(int n){
        boolean result=true;
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i ==0){
                result =false;
                break;
            }
        }
        return result;
    }
    }