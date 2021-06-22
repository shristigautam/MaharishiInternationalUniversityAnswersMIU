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
public class solve10 {
    public static void main(String[] args) {
        int[] nums = solve10();
        for (int n : nums){
            System.out.println(n);
        }
    }
    static int[ ] solve10(){
        int[] a= new int [2];
        int solved=0;
        for(int i=1; i<=10; i++){ //Integer.MAX_VALUE garyo vane j ko loop chalya chalei hunxa, 10! vanda kam ta
            for(int j=1; j<=10; j++){
                if(factorial(i)+factorial(j) == factorial(10)){
                   a[0]=i;
                   a[1]=j;
                   solved=1;
                   break;
                }
            }
              if (solved==1) break;

        }
        return a;
    }
    
    static int factorial(int n){
        int fact=1;
         if(n == 1 || n == 0)
            return 1;
        while(n!=1){
            fact*=n;
            n--;
        }
        return fact;
    }
    
//  public static int factorial(int n){ //good method for factorial
//        if(n == 1 || n == 0)
//            return 1;
//        else
//            return n * factorial(n-1);
//    }
    
}
