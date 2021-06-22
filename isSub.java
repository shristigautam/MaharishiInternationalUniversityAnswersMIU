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
public class isSub {
    public static void main(String[] args) {
        int [] a= {16,5,3,1};
        System.out.println(isSub(a));
    }
    static int isSub(int [] a){
        int result=1;
        for (int i = 0; i < a.length-1; i++) {
            int sum=0;
            for(int j=i+1; j<a.length; j++){
                sum=sum+a[j];
            }
            if(a[i]<=sum)
            {
                result=0;
                break;
            }
        }
        return result;
    }
}
