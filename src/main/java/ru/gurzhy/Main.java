package ru.gurzhy;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private final static int MAX_ARRAY_LENGTH = 4;


    /**
     *
     * @param array input array of given size (4 in our homework)
     * @return sum of all elements in input array
     *
     */
    public static int handleCustomArrayGivenSize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sumOfAllArrayElements = 0;
        if (array.length != MAX_ARRAY_LENGTH ||  array[0].length != MAX_ARRAY_LENGTH)
            throw new MyArraySizeException("One of array dimensions is not equals to " + MAX_ARRAY_LENGTH);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                var arrayElement = array[i][j];
                try {
                    int castedFromStringValue = Integer.parseInt(arrayElement);
                    sumOfAllArrayElements += castedFromStringValue;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Cast exceptions with cause: " +
                            "element \"" + array[i][j] + "\" in array[" + i + "][" + j + "] is not a number");
                }
            }
        }
        return sumOfAllArrayElements;
    }

    public static void main(String[] args) {


        String[][] input = new String[4][4];

        //populate array by random 0..9 numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                input[i][j] = ThreadLocalRandom.current().nextInt(0, 9) + "";
            }
        }

        int sumOfElements = 0;
        try {
             sumOfElements = handleCustomArrayGivenSize(input);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of all elements in array is: " + sumOfElements);
    }
}


