package sword.offer;


import java.security.InvalidParameterException;

/**
 * 剑指offer题目8 ：旋转数组中的最小数字
 *
 * 把一个数组最开始的若干个元素搬到数组末尾，称之为数组的旋转
 * 输入一个递增数组的一个旋转，输出旋转数组的最小元素，
 * 数组{3，4，5，1，2} 为数组 {1，2，3，4，5}的一个旋转
 *
 */
public class MinNumberInRotatedArray {


    /**
     * 二分查找思想
     * @param numbers
     * @return
     */
    public int min(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            throw new InvalidParameterException();
        }

        int start = 0;
        int end = numbers.length - 1;
        int middle = start;
        while (numbers[start]  >= numbers[end]) {

            // start 指向第一个递增数组的最后一个元素，end指向第二个数组的第一个元素
            if (end - start == 1) {
                middle = end;
                break;
            }

            middle = (start + end) / 2;

            // start middle end 三个数相同，需要线性查找
            if (numbers[start] == numbers[middle] && numbers[start] == numbers[end]) {
                return minInOrder(numbers, start, end);
            }

            // start 指针总是指向第一个递增数组
            if (numbers[start] <= numbers[middle]) {
                start = middle;
            } else if (numbers[start] > numbers[middle]) {
                // end 指针总是指向第二个递增数组
                end = middle;
            }
        }
        return numbers[middle];

    }

    private int minInOrder(int[] numbers, int start, int end) {
        int result = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }
}
