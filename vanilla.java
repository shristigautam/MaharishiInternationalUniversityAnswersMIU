/*
An array is called vanilla if all its elements are made up of the same digit. For example {1, 1, 11, 1111, 1111111} is a vanilla array
because all its elements use only the digit 1. However, the array {11, 101, 1111, 11111} is not a vanilla array because its elements use the
digits 0 and 1. Write a method called isVanilla that returns 1 if its argument is a vanilla array. Otherwise it returns 0.
If you are writing in Jav
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class vanilla {
    public static void main(String[] args) {
        int[] a = {};
        System.out.println(isVanilla(a));
    }
    static int isVanilla(int[ ] a){
        if(a.length==0) return 1;
        int num=a[0]%10;
        for(int i=0; i<a.length;i++){
            if(a[i]<0) a[i]=-a[i];
            while(a[i]%10 !=0){
                if(num != a[i]%10) return 0;
                a[i]=a[i]/10;
            }
        }
        return 1;
    }
        
}
