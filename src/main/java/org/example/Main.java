package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        ArrayList<Integer> listNumbers = new ArrayList<>();
        if (args.length > 1){
            number = Integer.parseInt(args[0]);
            for (int counter = 1; counter < args.length; counter++) {
                listNumbers.add(Integer.parseInt(args[counter]));
            }
        }

        listNumbers = Multiply.numbersMultiply(number, convertToArrayInt(listNumbers));

        for (int counter = 0; counter < listNumbers.size(); counter++) {
            System.out.print(listNumbers.get(counter) + ", ");
        }

    }

    private static int[] convertToArrayInt(ArrayList<Integer> listNumbers) {
        int[] listNumbersArary = new int[listNumbers.size()];
        for (int count = 0; count < listNumbers.size(); count++) {
            listNumbersArary[count] = listNumbers.get(count);
        }
        return listNumbersArary;
    }
}