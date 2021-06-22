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
public class isDaphne {
    public static void main(String[] args) {
        int[] a={4, 8, 7,10,-4,6};
        int result =f(a);
        System.out.println(result);
        
    }
    private static int f(int[] a){
        int evencountfirst=0;
        int oddcountend=0;
        boolean odd=false;

        for (int i = 0; i < a.length; i++) {
              if(a[i]%2==0){
                    evencountfirst++;
                }
              if(a[i]%2!=0){
                  odd=true;
                  break;
              }
        }
        
            for (int j = a.length-1; j >=0; j--) {
                
                if(a[j]%2==0){
                    oddcountend++;
                }
                 if(a[j]%2!=0){
                  odd=true;
                  break;
              }
                
            
        }
        if(oddcountend==evencountfirst&&odd==true){
            return 1;
        }
        return 0;
    }
    
}