/*
Define an array to be a Mercurial array if a 3 does not occur between any two 1s. Write a function named
isMercurial that returns 1 if its array argument is a Mercurial array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isMercurial(int[ ] a)
If you are programming in C or C++, the function signature is
int isMercurial(int a[ ], int len) where len is the number of elements in the array a.
Hint: if you encounter a 3 that is preceded by a 1, then there can be no more 1s in the array after the 3. 
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class Mercurial {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 1, 18};
        System.out.println(Mercurial(a));
    }
    static int Mercurial(int [] a){
        int i; //int i and j yaha declare garena vane 3rd loop ma lidaina
        int j;
        for(i =0; i<a.length; i++){ //yaha int i nalekhne as mathi nai lekheko xa
            if(a[i]==1){
                break;
            }
        }
        for(j=a.length-1; j>=0;j--){
            if(a[j]==1){
                break;
            }
        }
        
        for(int k=i; k<=j; k++){
            if(a[k]==3){
                return 0;
            }
        }
        return 1;
    }
}
