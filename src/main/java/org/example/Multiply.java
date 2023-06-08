package org.example;

import java.util.ArrayList;

public class Multiply {
    public static boolean isMultiply (int number, int numberMultiply){
        return number % numberMultiply == 0;
    }

    public static boolean areNumberMultiply(int number, int[] numbersMultiply){
        boolean isMultiply = false;
        for (int counter = numbersMultiply.length - 1; counter >= 0 && !isMultiply; counter--) {
            isMultiply = isMultiply(number, numbersMultiply[counter]);
        }
        return isMultiply;
    }

    public static ArrayList<Integer> numbersMultiply(int number, int... numbersMultiply){
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int counter = number; counter >= 0; counter--) {
            if (areNumberMultiply(counter, numbersMultiply)){
                listNumbers.add(counter);
            }
        }
        return listNumbers;
    }

}
