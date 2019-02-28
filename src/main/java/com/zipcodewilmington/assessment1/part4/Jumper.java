package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumps = k/j;
        int steps = k % j;

        return jumps + steps;
    }
}
