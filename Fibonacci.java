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
public class Fibonacci {
    public static void main(String[] args) {
        int n= 13;
        System.out.println(isFibonacci(n));
    }
    static int isFibonacci(int n){
        int a1=1;
        int a2=2;
        int result=0;
        int temp=0;
        if(n==1 || n==2) return 1;
        for (int i=1; i<=n; i++){
            temp = a1+ a2;
            a1= a2;
            a2= temp;
            
            if(temp ==n){
                result =1;
                break;
            }
        }
        return result;
    }
}


//For ko satta yo while ni use garna milxa
//    while(temp<=n){ //temp!>n le kaam gardaina ! kaile nagalnu while ma
//        temp = a1+ a2;
//            a1= a2;
//            a2= temp;
//            
//            if(temp ==n){
//                result =1;
//            }
//    }