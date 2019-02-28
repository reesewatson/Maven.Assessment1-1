package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int pDromcount=0;                             // b c c b
        //looping forward from front                  //   c c
        for (int i = 0; i < input.length() ; i++) {  //     c
            //looping backwards from back
            for(int j = input.length(); i < j; j--){
                //checking if the input is the same forwards and backwards and if it is add to counter
                if(isPaladromic(input.substring(i, j))){
                    pDromcount++;
                }
            }
        }
        return pDromcount;
    }

    private boolean isPaladromic(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
