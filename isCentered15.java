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
public class isCentered15 {

    public static void main(String[] args) {
        int a[] = {3, 2, 10, 4, 1, 6, 9};
        int result = isCentered15(a);
        System.out.println(result);
    }

    private static int isCentered15(int[] a) {
        if(a[a.length%2]!=0 && a[a.length/2]==15){ //bichma 15 vako case 
            return 1;
        }
        for (int i = 0; i <= 3; i++) { //mid number samma loop laune
            int sum = 0;
            for (int j = i; j < (a.length - i); j++) { //mid ko 
                sum += a[j];
            }
            if (sum == 15) 
                return 1;
        }
        return 0;

    }

}



//    private static int isCentered15(int[] a) {
//            int sum = 0;
//            for (int j = a.length / 2-1; j <= (a.length - a.length / 2); j++) {
//                System.out.println(j);
//                sum += a[j];
//            }
//           System.out.println();
//            if (sum == 15) {
//                return 1;
//            }
//
//        return 0;
//    }