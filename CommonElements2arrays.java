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
public class CommonElements2arrays {

    public static void main(String[] args){
        int[] array1 = { 1, 2, 3, 9 };
        int[] array2 = { 3, 4, 6, 8, 2, 7, 5 };
        int[] rArray = commonArray(array1, array2); 
        for (int i = 0; i < rArray.length; i++){
            System.out.println(rArray[i]);  
        }
    }
    
    static int[] commonArray(int[] first, int[] second) {
        if (first == null || second == null) 
            return null;
        if (first.length == 0 || second.length == 0) 
            return new int[0];
        int min = (first.length < second.length) ? first.length : second.length;
        int[] c = new int[min];
        int k = 0; //return array ko size ko lagi natra khali auxa kunai kunai index
        for (int i = 0; i < first.length; i++){
          for (int j = 0; j < second.length; j++){
               if (first[i] == second[j])
               {
                   c[k] = first[i];
                   k++;
               }
          }
       }
       int[] retArray = new int[k];
       for (int t = 0; t < retArray.length; t++){
          retArray[t] = c[t];
       }
    return retArray;
    }

}
