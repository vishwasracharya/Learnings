/*
QUESTION
---------
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

****************
ANSWER
------
*/

class Solution {
    public int fib(int n) {
    
        int a=0, b=1, count=2;

        if (n != 0){
            while (count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
            }
        }else{
            return 0;
        }
        return b;
    }
}