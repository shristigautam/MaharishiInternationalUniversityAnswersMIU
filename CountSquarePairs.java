/*
1.Define a square pair to be the tuple <x, y> where x and y are positive, non-zero integers, x<y and x + y is a perfect square. A perfect
square is an integer whose square root is also an integer, e.g. 4, 9, 16 are perfect squares but 3, 10 and 17 are not. Write a function 
named CountSquarePairs that takes an array and returns the number of square pairs that can be constructed from the elements in the
array. For example, if the array is {11, 5, 4, 20} the function would return 3 because the only square pairs that can be constructed from
those numbers are <5, 11>,
<5, 20> and <4, 5>. You may assume that there exists a function named isPerfectSquare that returns 1 if its argument is a
perfect square and 0 otherwise. E.G., isPerfectSquare(4) returns 1 and isPerfectSquare(8) returns 0.
If you are programming in Java or C#, the function signature is
int CountSquarePairs(int[ ] a)
If you are programming in C++ or C, the function signature is
int CountSquarePairs(int a[ ], int len) where len is the number of elements in the array.
You may assume that there are no duplicate values in the array, i.e, you don't have to deal with an array like {2, 7, 2, 2}.
Examples:
if a is                 Return                      Reason
______________________________________________________________________________________________

{9, 0, 2, -5, 7}            2                       The square pairs are <2, 7> and <7, 9>. Note that <-5, 9> and <0, 9>
                                                    are not square pairs, even though they sum to perfect squares,
                                                    because both members of a square pair have to be greater than 0.
                                                    Also <7,2> and <9,7> are not square pairs because the first number
                                                    has to be less than the second number.
{9}                         0                       The array must have at least 2 elements
 
*/
package MIU;

/**
 *
 * @author Shristi
 */
public class CountSquarePairs {
    public static void main(String[] args) {
        int[] array =  {11, 5, 4, 20};
        //int [] array= {9, 0, 2, -5, 7};
        // int[] array =  {9} ; garda 0 auxa which is true as the array must have at least 2 elements. 
        // Yo condition a[i]<a[j] le check garxa, so separate check garna jaruri xaina
        System.out.println(countSquarePairs(array));
    }
    static int countSquarePairs(int[ ] a){
        int count=0;
        for(int i=0; i<a.length; i++){
              for(int j=0; j<a.length; j++){
               if(a[i]>0 && a[j]>0){ //only takes positive non zero pairs
                   if(a[i]<a[j] && isPerfectSquare(a[i]+a[j])==1){ //check x<y and x+y = perfect square
                       count++;
//                       System.out.println(a[i]+","+a[j]);
                   }
              }  
            }
        }
        return count;
    }
    
    static int isPerfectSquare(int n){ //perfect square check
        for (int i = 0; i <= n; i++){ // i<=n/2 garda 1 ko case ma mildiana, but yaha x+y=1 hudaina as x<y and x&y>0
            if( i * i == n)
                return 1;
            if(i * i > n)
                break;
        }
        return 0;
    }

}
