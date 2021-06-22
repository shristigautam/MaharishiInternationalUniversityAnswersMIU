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
public class Beans_Nine_Thirteen {
    public static void main(String[] args){
        int[] a =  {1, 2, 9, 7, 13, 16};
        int result = isBean(a);
        System.out.println(result);
    }
    static int isBean(int[] a){
        int result =0;
        int nine = 0;
        int seven = 0;
        int sixteen = 0;
        int thirteen = 0;
        if (a.length == 0){
            return 0;
        }
        for (int i=0; i<a.length; i++){
            if (a[i]==9){
                nine = 1;
            }
            if (a[i]==13){
                thirteen = 1;
            }
            if (a[i]==7){
                seven = 1;
            }
            if (a[i]==16){
                sixteen = 1;
            }
        }
//     if ((nine == 1 && thirteen == 1) || (nine == 0 && thirteen == 0)) {
    if (nine == thirteen) {
    result = 1;
    }
    if (seven == 1 && sixteen == 1) {
    result = 0;
    }
    return result;
    
    }
}
