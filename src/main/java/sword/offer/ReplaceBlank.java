package sword.offer;


/**
 * 剑指offer题目4 ：空格替换
 *
 * 请实现一个函数，把字符串中的每个空格替换成 "%20"
 * 需要在原始的字符中替换
 */
public class ReplaceBlank {

    /**
     * 时间复杂度O(n) ，先统计空格数量，判断数组长度是否足够
     * 再从后先前移动字符，遇到空格则替换为 "%20"
     * @param chars
     * @param length
     */
    public void replaceBlank(char[] chars, int length){
        if (chars == null || chars.length == 0){
            return;
        }

        int blankCount  = 0;
        for (int i =0; i < length; i++) {
            if (chars[i] == ' ') {
                blankCount++;
            }
        }

        if (chars.length < length + blankCount * 2) {
            return;
        }

        int replaceBlankBytesIndex = length + blankCount * 2 - 1;

        for(int i = length - 1; i  >= 0; i--) {
            if (chars[i] != ' ') {
                chars[replaceBlankBytesIndex--] = chars[i];
            } else {
                chars[replaceBlankBytesIndex--] = '0';
                chars[replaceBlankBytesIndex--] = '2';
                chars[replaceBlankBytesIndex--] = '%';
            }
        }

    }
}
