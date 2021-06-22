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
public class evenSpaced {
    public static void main(String[] args) {
        int [] a={-2, -3,-4,-12};
        System.out.println(evenSpaced(a));
    }
    
    static int evenSpaced(int [] a){
        if(a.length<2) return 0;
        int largest=a[0];
        int smallest =a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>largest) largest=a[i];
            if(a[i]<smallest) smallest=a[i];
        }
        if((largest-smallest)%2 ==0)
            return 1;
        else
            return 0;
    }
}
