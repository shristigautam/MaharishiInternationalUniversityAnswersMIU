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
public class Is121Array {
    public static void main(String[] args) {
    int[] a= {1,1,2,2,1,2,1,1} ;
    int result=f(a);
        System.out.println(result);
    }
    private static int f(int[] a){
        int startOnes=0;
        int endOnes=0;
        int oneCondition=0;
        int twoCondition=1;
        int i=0;
        int j=0;
        int result =0;
        a[0]= -1;
        if(a.length <= 2 || a[0] != 1 || a[a.length-1] != 1)//length 2 vanda kam xa & agadi/paxadi 1 xaina vane false
            return 0;
        
        for (i = 0; i < a.length; i++) {
            if(a[i]==1){ //agadiko 1 check garne
                startOnes++;
            }
            else{
                break;
            }
            
        }
        for(j =a.length-1; j>=0; j--){ //paxadi ko 1 check garne
           if(a[j]==1){
                endOnes++;
            } 
           else{
               break;
           }
        }
        
        if(startOnes==endOnes){
            oneCondition=1;
        }
        
        if(i>j) return 0;
                
        for(int k=i; k<=j; k++){
            if(a[k] != 2){
                twoCondition= 0;
                break;
            }
        }
        
        if(oneCondition==1 &&twoCondition ==1 ){ 
            result =1;
        }

        return result;
    }
}



//         int[] a={1, 1,2,2,1, 1};
//    int result=f(a);
//        System.out.println(result);
//    }
//    private static int f(int[] a){
//        int middindex=a.length/2;
//        int startingindex=0;
//        int endindex=0;
//        if(a[middindex]!=2){
//            return 0;
//        }
//        if(a[0]!=1&&a[a.length-1]!=1){
//            return 0;
//        }
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]==1){
//                startingindex++;
//            }
//            else{
//                break;
//            }
//            
//        }
//        for (int i = a.length-1; i >=0; i--) {
//            System.out.println(i);
//              if(a[i]==1){
//                endindex++;
//            }
//            else{
//                break;
//            }
//            
//        }
//        for (int i = startingindex; i < middindex; i++) {
//            if(a[i]!=2){
//                return 0;
//                
//            }
//            
//        }
//        for (int i = middindex; i >=endindex; i--) {
//            if(a[i]!=2){
//                return 0;
//            }
//            
//        }
//
//        if(startingindex==endindex){
//            return 1;
//        }
//        return 0;
//    }
//   
//    
//}
