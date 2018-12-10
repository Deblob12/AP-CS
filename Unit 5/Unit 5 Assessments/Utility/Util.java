 

/**
 * Provides iterative and recursive methods for a variety of uses.
 */
public class Util {
    /**
     * Calculates the factorial of a number iteratively.
     * @param n Number to be processed.
     * @return Factorial of number specified.
     */
    public static long iterativeFactorial(int n) {
        /* Add code here. Fix placeholder return statement. */
        long factorial = 1;
        if(n<0) throw new IllegalArgumentException();
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    
    /**
     * Calculates the factorial of a number recursively.
     * @param n Number to be processed.
     * @return Factorial of number specified.
     */
    public static long recursiveFactorial(int n) {
        /* Add code here. Fix placeholder return statement. */
        if(n<0) throw new IllegalArgumentException();  
        if(n == 1 || n == 0){
            return 1;
          }
        return (long) recursiveFactorial(n-1) * ((long) n);
    }
    
    /**
     * Calculates the sum of the digits in a number iteratively.
     * @param n Number to be processed.
     * @return Sum of the number's digits.
     */
    public static int iterativeDigitSum(long n) {
        /* Add code here. Fix placeholder return statement. */
        if(n<0) throw new IllegalArgumentException();
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    
    /**
     * Calculates the sum of the digits in a number recursively.
     * @param n Number to be processed.
     * @return Sum of the number's digits.
     */
    public static int recursiveDigitSum(long n) {
        if(n<0) throw new IllegalArgumentException();
        if(n == 0){
            return 0;
        }
        return (int) (n % 10 + recursiveDigitSum(n/10));
    }
    
    /**
     * Calculates the nth value of the modern Fibonacci sequence iteratively.
     * @param n Index of the Fibonacci sequence to be calculated.
     * @return The value at index n of the Fibonacci sequence.
     */
    public static int iterativeFibonacci(int n) {
        /* Add code here. Fix placeholder return statement. */
        if(n < 1) throw new IllegalArgumentException();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 3; i < n + 1; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    
    /**
     * Calculates the nth value of the modern Fibonacci sequence recursively.
     * @param n Index of the Fibonacci sequence to be calculated.
     * @return The value at index n of the Fibonacci sequence.
     */
    public static long recursiveFibonacci(int n) {
        /* Add code here. Fix placeholder return statement. */
        if(n<1) throw new IllegalArgumentException();
        if (n==1){
            return 0;   
        }
        if (n==2){
           return 1;  
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
    
    /**
     * Iteratively generates a string made of n copies of a supplied input 
     * string separated by a comma and a space. 
     * @param inputString String to be repeated.
     * @param count Number of times to repeat the input string.
     * @return New constructed string.
     */
    public static String iterativeStringGen(String inputString, int count) {
        /* Add code here. Fix placeholder return statement. */
        if(count < 0) throw new IllegalArgumentException();
        String res = "";
        int initial = count;
        while(count > 0){
            if(count == initial){
                res += inputString;
                count--;
            }
            else{
                res += ", " + inputString;
                count--;
            }
        }
        return res;
    }

    /**
     * Recursively generates a string made of n copies of a supplied input 
     * string separated by a comma and a space. 
     * @param inputString String to be repeated.
     * @param count Number of times to repeat the input string.
     * @return New constructed string.
     */
    public static String recursiveStringGen(String inputString, int count)throws IllegalArgumentException {
        /* Add code here. Fix placeholder return statement. */
        if(count <0)throw new IllegalArgumentException("String count must be 0 or greater");
        if(count == 0) return "";
        if(count == 1) return inputString;
        
        return inputString + ", " + recursiveStringGen(inputString, count-1);
    }
    
    /**
     * Calculates the sum of all numbers in an array iteratively.
     * @param array Array to be processed.
     * @return Sum of elements in the array.
     */
    public static long iterativeArraySum(int[] array) {
        /* Add code here. Fix placeholder return statement. */
        long sum = 0;
        for(int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    
    /**
     * Calculates the sum of all numbers in an array recursively.
     * @param array Array to be processed.
     * @return Sum of elements in the array.
     */
    public static long recursiveArraySum(int[] array) {
        if(array.length == 0|| array == null)return 0;
        return recursiveArraySumHelper(array, 0);
    }
    
    /**
     * Provides the recursive processing needed by recursiveArraySum().
     * @param array Array to be processed.
     * @param index Current index being processed.
     * @return Sum of elements in the array.
     */
    private static long recursiveArraySumHelper(int[] array, int index) {
        /* Add code here. Fix placeholder return statement. */
        if(index == array.length-1) return array[index];
        return array[index] + recursiveArraySumHelper(array, index+1);
    }
    
    /**
     * Iteratively counts the number of even numbers in an array.
     * @param array Array to be processed.
     * @return Number of even numbers in the array.
     */
    public static int iterativeCountOnlyEvens(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
    
    /**
     * Recursively counts the number of even numbers in an array.
     * @param array Array to be processed.
     * @return Number of even numbers in the array.
     */
    public static int recursiveCountOnlyEvens(int[] array) {
        if(array.length == 0|| array == null)return 0;
        return recursiveCountOnlyEvensHelper(array, 0);
    }
    
    /**
     * Provides the recursive processing needed by recursiveCountOnlyEvens().
     * @param array Array to be processed.
     * @param index Current index being processed.
     * @return Sum of elements in the array.
     */
    private static int recursiveCountOnlyEvensHelper(int[] array, int index) {
        /* Add code here. Fix placeholder return statement. */
        int yes = 0;
        if(array[index]%2 == 0){
            yes = 1;
        }
        if(index == array.length-1){
            return yes;
        }
        return yes + recursiveCountOnlyEvensHelper(array, index+1);
    }
}
