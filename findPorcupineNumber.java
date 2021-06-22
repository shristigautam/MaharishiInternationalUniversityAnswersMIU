/*
2. A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime number whose last digit is 9
and the next prime number that follows it also ends with the digit 9. For example 139 is a porcupine number because:
 a. it is prime
 b. it ends in a 9
 c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not
prime so 149 is the next prime number after 139.
Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is
greater than n. So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would
findPorcupineNumber(138). But findPorcupineNumber(139) would return 409 which is the second porcupine number.
The function signature is
int findPorcupineNumber(int n)
You may assume that a porcupine number greater than n exists
 */
package MIU;

/**
 *
 * @author Shristi
 */

/**
 *Steps:
 * 1) Prime filter garne and set 9 vako 0;
 * 2) Paxadi 9 vako prime na aunujel nikalne and aayesi teslai porcupine set garne and set 9 vako 1.
 * 3) Paxadiko 9 vako prime aayepaxi arko prime ma 9 xaki xaina check garne
 * 3) Xa vane break and return agadi ko porcupine, xaina vane set 9 vako= 0;
 *
 */
public class findPorcupineNumber {
    public static void main(String[] args) {
        int n = 139;
        System.out.println(findPorcupineNumber(n));
    }
    static int findPorcupineNumber(int n){
        int hasLast9=0; 
        int porcupine=0;
       for(int i=n+1; i<=Integer.MAX_VALUE; i++){ //because next porcupine check gar vanya xa, so n=139 halda n+1 dekhi suru garna paryo
          if(checkPrime(i)==true) {
            if(hasLast9==0){ //this is for namilera back audako loop
                  if(i%10 == 9){
                    hasLast9=1;
                    porcupine=i; //euta prime ma 9 aayo vane teslai porcupine mandine
                  }
            }
            else{
                if(i%10 == 9){ //porcupine paxi ko prime ma 9 xaki xaina check garne
                    break;
                }   
                else{
                    hasLast9=0; //2nd ma 9 xaina vane check again
                }
            }
        }
     }
    return porcupine;

    }
    
   //Dui choti prime check garna parxa, so function banaideko
    static boolean checkPrime(int n){
       int isPrime=0;
       if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime++;
            }
        }
         if(isPrime==0)
            return true;
         return false;
    }
}
