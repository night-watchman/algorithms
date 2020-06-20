package sword.offer;


/**
 * 剑指offer题目9：斐波那契数列
 */
public class Fibonacci {

    /**
     * 递归计算
     * @param n
     * @return
     */
    public long countRecursive(int n){
        if (n <= 0 ){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return countRecursive(n - 1) + countRecursive( n - 2);
    }


    /**
     * 迭代计算
     * @param n
     * @return
     */
    public long countIterate(int n){
        int[] result = {0, 1};
        if (n < 0) {
            return 0;
        }

        if (n < 2) {
            return result[n];
        }

        long fibNMinusOne = 1;
        long fibNMinusTwo = 0;
        long fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }

}
