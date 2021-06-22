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
public class isVesuvian {
    public static void main(String[] args) {
        int a =  85;
        System.out.println(isVesuvian(a));
    }
    static int isVesuvian(int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(isSquare(i)==true){ //filter squares only
                for(int j=0; j<n; j++){
                    if(isSquare(j)==true && i+j==n){ //again filter squares and check i+j deko number sanga equal xaki xaina
                        count++;
                    }
                }
            }
        }
        if(count>=2){ //at least 2 pair values should fulfill the condition.
            return 1;
        }
        return 0;
    }
    
    static boolean isSquare(int n){
        for(int i=0; i<=n; i++){
            if(i*i==n){
                return true;
            }
        }
    return false;
    }
    
//    static int isSquare(int n){
//        for(int i=0; i<=n; i++){
//            if(i*i==n){
//                return 1;
//            }
//        }
//    return 0;
//    }
}
