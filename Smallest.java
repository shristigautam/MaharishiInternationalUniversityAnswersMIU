/*
The number 124 has the property that it is the smallest number whose first three multiples contain the digit 2. Observe that
124*1 = 124, 124*2 = 248, 124*3 = 372 and that 124, 248 and 372 each contain the digit 2. It is possible to generalize this property to be the
smallest number whose first n multiples each contain the digit 2. Write a function named smallest(n) that returns the smallest number whose first
n multiples contain the digit 2. Hint: use modulo base 10 arithmetic to examine digits.
Its signature is
int smallest(int n)
 */
package MIU;
import java.util.ArrayList;

/**
 *
 * @author Shristi
 */
public class Smallest {
    public static void main(String[] args) {
        int n=4;
        int result=f(n);
        System.out.println(result);
    }
    private static int f(int n){
       int num =1;
       int result=0;
       int sum=1;
            sum=1;
            int temp=0;
            int count=0;
            
            //We need two loops:
            //1: number 1 dekhi badhaune...taba samma jaba ki count mildaina, then stop (while)
            //2: 2nd loop chai diyeko number samma multiply garna ko lagi (for)
            while(count  != n){ //kati ota multiple number sab ma 2 vako chaiyeko, tetisanga count same huna paryo
               for (int i = 1; i <=n; i++) { //diyeko number samma loop chalaune, 4 diye 4, 5 diye 5
               sum=num*i; //multiple nikalne and multiple ko each digit check garne
               while(sum!=0){
               temp=sum%10;
               sum/=10;
                if(temp==2){ //number %10 gardai herne, 2 xa vane count badhaune.
                    count++;
                    break;
                }
               }
               }
               
            if(count==n){ //count number sita milyo vane result and break 
                result=num;
                break;
            }
            else{ //count diyeko number jati vayena vane num++ garne 
                num++;
                count=0; //number change huda count ni reset garna parxa
              }
            }
        result=num;
        return result;
    }
}