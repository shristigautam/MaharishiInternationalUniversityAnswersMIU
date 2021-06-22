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
public class Is235Array {
    public static void main(String[] args){
        int[] a = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        System.out.println(is235Array(a));
    }
    static int is235Array(int[] a){
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int countNot = 0;
        for (int i = 0; i< a.length; i++){
            if(a[i] % 2 == 0)
                count2++;
            if(a[i] % 3 == 0)
                count3++;
            if(a[i] % 5 == 0)
                count5++;
            if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0)
                countNot++;
        }
        if(count2 + count3 + count5 + countNot == a.length)
            return 1;
        else 
            return 0;
}
}
