/*
The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second numbers are 1 and
after that ni = ni-2 + ni-1, e.g., 34 = 13 + 21. A number in the sequence is called a Fibonacci number. Write a
method with signature int ClosestFibonacci(int n) which returns the largest Fibonacci number that is less than 
or equal to its argument. For example, ClosestFibonacci(13) returns 8 because 8 is the largest Fibonacci number
less than 13 and ClosestFibonacci(33) returns 21 because 21 is the largest Fibonacci number that is <= 33.
ClosestFibonacci(34) should return 34. If the argument is less than 1 return 0. Your solution must not use
recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes
the same Fibonacci number many times
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class ClosestFibonacci {
    public static void main(String[] args) {
        int result = closestFibonacci(13);
        System.out.println(result);
    }
    
    static int closestFibonacci(int n){
        int a1=1;
        int a2=2;
        int result=0;
        int temp=0;
        if(n==1) return 1;
        while(temp<=n){
            temp = a1+a2;
            a1= a2;
            a2= temp;
            if(temp>=n){
                break;
            }
        }
        return a1;
    }
}
