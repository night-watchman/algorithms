package sword.offer;


/**
 * 剑指offer题目10 ：二进制中1的个数
 */
public class NumberOfOneInBinary {


    /**
     * 左移flag 不断与n进行与运算，判断当前位是否为1
     * 一共需要移动32次将 flag置为0
     * @param n
     * @return
     */
    int rightShiftCount(int n) {
        int count = 0;
        int flag = 1;
        while (flag !=  0) {
            if ((n & flag) == flag) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    /**
     * 减一 再与自身进行与运算
     * 一共需要运行 1的个数次
     * @param n
     * @return
     */
    int minusOneCount(int n){
        int count = 0;
        while (n != 0) {
            count++;
            // 减一 再与自身进行与运算可以将最左侧的第一个1变为0
            n = (n - 1)  & n;
        }
        return count;
    }


}
