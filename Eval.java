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
public class Eval {
    public static void main(String[] args) {
        int [] a ={3, 2, 1};
        double x= 3;
        System.out.println(eval(x,a));
    }
    static double eval(double x, int[ ] a){
        double sum=0;
        for(int i=0; i<a.length; i++){
            sum = sum+ a[i]*power(x,i);
        }
        return sum;
        
    }
    
   static double power(double base, int power){ //Math.pow(base, power) use garna paidaina hola, so tesko satta
    int answer=1;
       for(int i=1;i<=power;i++){
           answer*=base;
       }
    return answer;
 }
}
