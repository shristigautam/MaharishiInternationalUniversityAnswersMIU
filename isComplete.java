package MIU;

/*
An array is defined to be complete if the conditions (a), (d) and (e) below hold.
  a. The array contains even numbers
  b. Let min be the smallest even number in the array.
  c. Let max be the largest even number in the array.
  d. min does not equal max
  e. All numbers between min and max are in the array
For example {­5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because 
  a. The array contains even numbers
  b. 2 is the smallest even number
  c. 8 is the largest even number
  d. 2 does not equal 8
  e. the numbers 3, 4, 5, 6, 7 are in the array.
Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
{2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise 
it returns 0.
If you are writing in Java or C#, the function signature is
   int isComplete (int[ ] a)
 */

/**
 *
 * @author Shristi
 */
public class isComplete {
    public static void main(String[] args) {
        int [] a = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
        System.out.println(isComplete(a));
    }
    
    static int isComplete (int[ ] a){
        int hasEven=0;
        int min=0;
        int max=0;
        int hasallvalues=0;
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0){
                hasEven=1;
                min=a[i]; //initialize min and max to first even number
                max=a[i];
            }
        }
        if (hasEven!=1) return 0; //condition a
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0){
                if(a[i]<min) min = a[i]; //condition b and c
                if(a[i]>max) max = a[i];
            }
        }
        if(min==max) return 0; //condition d
        for(int j=min; j<=max; j++){
            hasallvalues=0;
            for(int i=0; i<a.length;i++){
                if (j==a[i]){
                    hasallvalues=1;
                    break;
                }
            }
            if (hasallvalues==0) return 0; //condition e
        }
        return 1;
    }
}
