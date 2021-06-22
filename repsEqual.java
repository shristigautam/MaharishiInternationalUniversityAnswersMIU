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
public class repsEqual {
    public static void main(String[] args) {
        int [] arr={1,3,2,0,5,3};
        int n = 32053;
        System.out.println(repsEquall(arr, n));
    }
    static int repsEquall(int[ ] a, int n){//or arraylai number ma convert garera compare garda ni hunxa 
        //as gadiko 0 ignore gar da ni hunxa
        int number=0;
        int j = a.length-1; //ulto bta loop laune array ma ani %10 garera last bata check garne
        int result=0;
        if(String.valueOf(n).length() != a.length){ //length suruma check nagarda muniko logic le {1,3,2} ra 32 lai 1 dinxa
            return 0;
        }
        while(n!=0){
            number=n%10;
            if(a[j] != number){
                result++;
                break;
            };

            n=n/10;
            j--;
        }
        if(result==0){
            return 1;
        }
        return 0;
    }
}


/** This one is easy (convert array to number)
 * static int repsEquall(int[ ] a, int n) {
    String num="";
    int sum=0;
    int factor=1;
        for (int i = a.length-1; i >=0; i--) {
            sum=sum+factor*a[i];
            factor=factor*10;
        }
        if(num==n){
            return 1;
        }
        return 0;
    }
 */