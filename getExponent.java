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
public class getExponent {
    public static void main(String[] args) {
        int n=54;
        int p=3;
        int result =f(n,p);
        System.out.println(result);
    }
    private static int f(int n,int p){
        int count=0;
        while(n!=0){
            if(n%p==0){
                count ++;
            }
            else{
                break;
            }
            n=n/p;
            
        }
            System.out.println(count);
        return count;
    }
}
