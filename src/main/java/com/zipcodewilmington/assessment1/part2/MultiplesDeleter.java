package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] odds = new Integer[ints.length];
        int oddsIndex = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 == 1) {
                odds[oddsIndex] = ints[i];
                oddsIndex++;
            }
        } return Arrays.copyOf(odds, oddsIndex);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] evens = new Integer[ints.length];
        int evensIndex = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 == 0) {
                evens[evensIndex] = ints[i];
                evensIndex++;
            }
        } return Arrays.copyOf(evens, evensIndex);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] threes = new Integer[ints.length];
        int index3 = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % 3 != 0) {
                threes[index3] = ints[i];
                index3++;
            }
        } return Arrays.copyOf(threes, index3);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] newArray = new Integer[ints.length];
        int nIndex = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % multiple != 0) {
                newArray[nIndex] = ints[i];
                nIndex++;
            }
        } return Arrays.copyOf(newArray, nIndex);
    }
}
