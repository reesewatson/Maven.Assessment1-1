package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int total = 0;

        for(int i = 0; i <= n; i++) {
            total += i;
        } return total;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        //Don't forget to begin at 1, because we are calculating the product of digits.
        int total = 1;

        for(int i = 1; i <= n; i++) {
            total *= i;
        } return total;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String valStr = val.toString();
        String reversed = BasicStringUtils.reverse(valStr);
        return Integer.parseInt(reversed);
    }
}
