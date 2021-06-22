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
public class MadhavArray {
    public static void main(String[] args) {
        int [] array = {6,2};
        int result = MadhavArray(array);
        System.out.println(result);
    }
    static int MadhavArray(int[] a){
        int lengthCondition =0;
        int result=1;
        for(int n=0; n<=a.length;n++){
            if(n*(n+1)/2==a.length){
                lengthCondition=1; 
                break;
                //esmai != check garera sidhai return 0 garda mildaina kinaki 
                //kunai euta value sita matra yo condition milxa, not all
            }
        }
        //Last example ma mathiko kunai euta value ko n*(n+1)/2 condition deko xa, so check it first
        if(lengthCondition==1){
        int sum=0;
        int counter = 0;
            for (int i = 0; i < a.length; i = i+counter){ //remember i=i+counter
                sum = 0;
                for (int j = i; j <= i+counter; j++){ //remember j=i; j<=i+counter; j++
                    sum += a[j];
                }
                if(sum != a[0]){
                    result = 0; 
                    break;
                }
                counter++;
            }   
        }
        else{
            result =0;
        }
        return result;
    }
}
