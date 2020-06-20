package sword.offer;

/**
 * 剑指offer题目11 ：数值的整次方
 */
public class Power {

    public boolean isValid;

    public double power(double base, int exponent) {
        // 对0 求倒数是非法操作,标记为非法输入
        if (doubleEqual(base, 0) && exponent < 0) {
            isValid = false;
            return 0.0;
        }

        int absExponent = exponent;
        if (exponent < 0) {
            absExponent = 0 - exponent;
        }

        double result = powerWithUnsignedExponent(base, absExponent);
        if (exponent < 0) {
            result = 1.0 / result;
        }

        return result;
    }


    /**
     * a^n = a^1/n * a^1/n; n为偶数
     * a^n = a^1/n * a^1/n * a; n为奇数
     * @param base
     * @param exponent
     * @return
     */
    private double powerWithUnsignedExponent(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        if (exponent == 1) {
            return base;
        }

        double result = powerWithUnsignedExponent(base, exponent >> 1);
        result = result * result;
        if ((exponent & 1) == 1) {
            result = result * base;
        }
        return result;
    }

    private boolean doubleEqual(double num1, double num2) {
        if ((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)) {
            return true;
        }
        return false;
    }
}
