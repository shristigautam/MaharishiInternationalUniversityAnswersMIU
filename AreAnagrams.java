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
public class AreAnagrams {
    public static void main(String[] args) {
        char [] a1= {'p','0','0','l'};
        char [] a2= {'p','0','0','l'};
        System.out.println(areAnagrams(a1, a2));
    }
    static int areAnagrams(char [ ] a1, char [ ] a2){
        char [] a = a1;
        char [] b =a2;
        int count =0;
        if(a.length != b.length) return 0;
        if(a.length == 0 && b.length ==0) return 1;
        for(int i =0; i<a.length; i++){
            for(int j =0; j<b.length; j++){
                if(a[i]==b[j]){
                    b[j]=0; //setting matched items to null in case of double occurrence
                    count ++;
                    break;
                }
            }
        }
        if(count==a1.length) return 1;
        
        return 0;
    }
}
