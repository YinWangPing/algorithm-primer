package algorithm.foroffer;

import org.junit.Test;

/**
 * Created by liyazhou on 2017/5/30.
 * 面试题36：数组中的逆数对
 *
 * 题目：
 *      在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 *      输入一个数组，求出这个数组中的逆序对。
 *      例如在数组 {7, 5, 6, 4} 中，一共存在 5 个逆序对，
 *      分别是 (7, 6)、(7, 5)、(7, 4)、(6, 4)和(5, 4)。
 *
 * 考查点：
 *      1. 发现规律
 *
 * 思路：
 *      1. 蛮力解法，时间复杂度是 O(n^2)
 *
 */
public class Test36 {


    public int inversePairs(int[] array){
        if (array == null) return -1;
        int counter = 0;
        for (int i = 0; i < array.length; i ++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]) {
                    counter ++;
                    // System.out.println(array[i] + " :: " + array[j]);
                }
            }
        }
        return counter;
    }


    @Test
    public void test01(){
        int[] array = {7, 5, 6, 4};
        System.out.println(inversePairs(array));
    }

}
