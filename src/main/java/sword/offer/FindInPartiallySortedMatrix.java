package sword.offer;


/**
 * 剑指offer题目3 ：二维数组中的查找
 *
 * 在一个二维数组中，每一行都按照从左到右递增顺序排序
 * 每一列都按照从上到下递增顺序排序。请完成这样一个函数，输入
 * 这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class FindInPartiallySortedMatrix {

    /**
     *
     * @param matrix
     * @param number
     * @return
     */

    public boolean find(int[][] matrix, int number) {
        boolean find = false;
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
            int row = 0;
            int column = matrix[0].length - 1;
            while (row < matrix.length && column >= 0) {
                if (matrix[row][column] == number) {
                    find = true;
                    break;
                } else if (matrix[row][column] > number) {
                    // 比当前值小，排除当前列
                    column--;
                } else {
                    // 比当前值大，排除当前行
                    row++;
                }
            }
        }
        return find;
    }
}
