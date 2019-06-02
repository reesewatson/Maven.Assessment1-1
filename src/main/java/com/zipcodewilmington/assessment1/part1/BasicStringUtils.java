package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

    return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversed = "";
        //Iterate through the string, beginning at the last character--traversing through to the first index.
        for (int i = str.length() - 1; i >= 0; i--) {
            //As you iterate through, add the value stored at each index to the empty "rev" string.
            reversed += str.charAt(i);
            //Return your now reversed string.
        } return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        //Use the methods we have just created in tandem.
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        //Return a substring of our input string beginning at the second index and ending at the last index.
        //The parameters are (inclusive, exclusive).
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        //Begin with an empty string.
        String string = "";
        //Iterate through the given string.
        for(int i = 0; i < str.length(); i++) {
            //Store the character at each index within a variable "c".
            char c = str.charAt(i);
            //Establish condition: if each character is lowercase.. add it to your empty string as uppercase.
            if(Character.isLowerCase(c)) {
                string += Character.toUpperCase(c);
            } else {
                //Else add to string as lowercase.
                string += Character.toLowerCase(c);
            }
        } return string;
    }
}
