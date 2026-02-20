package Recursion;

import java.time.LocalTime;

public class Fibonacci {
    
    /* naive implementation. Makes multple recursive calls for the same value. 
    Number of calls at least doubles every other recursive step.
    For input k, number of steps = 2^(k/2), exponential growth.
    For k = 40, 2^20 steps, approx 1m steps. */
    public static int binaryFib(int k) {
        if (k <= 1) { 
            return 1;
        }
        else {
            return binaryFib(k - 1) + binaryFib(k - 2);
        }
    }

    /* By returning the previous two fib numbers, and return a new pair by adding the previous pair.
    this eliminates the need to recalculate values recursively.
     */
    private static int[] linearFibTuple(int k) {
        if (k <= 1) {
            return (new int[] {k, 0});
        }
        else {
            int[] res = linearFibTuple(k -1);
            return (new int[] {res[0] + res[1], res[0]});
        }
    }

    public static int linearFib(int k) {
        return linearFibTuple(k)[0];
    }

    public static int iterFib(int k) {
        if (k <= 1) {
            return k;
        }
        else {
            int prev = 0;
            int current = 1;
            int next;
            for (int i = 2; i <= k; i++) {
                next = current + prev;
                prev = current;
                current = next;
            }
            return current;
        }
    }

    public static void main(String args[]) {
        long start = System.nanoTime();
        int res = binaryFib(40);
        long end = System.nanoTime();

        double diff = (end - start) / 1e6;
        System.out.println(res);
        System.out.println("binary fib time: " + diff);
        
        start = System.nanoTime();
        res = linearFib(40);
        end = System.nanoTime();
        diff = (end - start) / 1e6;
        System.out.println("linear fib time: " + diff);

        start = System.nanoTime();
        res = iterFib(40);
        end = System.nanoTime();
        diff = (end - start) / 1e6;
        System.out.println("iter fib time: " + diff);
    }
}
