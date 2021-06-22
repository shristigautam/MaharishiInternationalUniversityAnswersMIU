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
public class isBean {
    public static void main(String[] args) {
        int[] a= {3,4,5,6};
        System.out.println(isBean(a));
    }
    static int isBean(int []a){
        int has=0; //declare here for return to be able to reach here
        for(int i=0; i<a.length; i++){
        int hasmax=0;
        int hasmin=0;
        has=0;
        for(int j=0; j<a.length; j++){
            if(a[j]== a[i]+1)
                hasmax=1;
            if(a[j]==a[i]-1)
                hasmin=1;
        }
        if(hasmax==1 || hasmin==1)
            has=1;
        else
        {
            break;
        }
    }
       return has; 
    } 
}
