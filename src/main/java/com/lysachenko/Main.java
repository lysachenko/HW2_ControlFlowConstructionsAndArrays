package com.lysachenko;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[20];

        fillIntArray(intArray);

        System.out.print("Source integer array: ");
        showArray(intArray);

        System.out.println("\nMin element in integer array = " + findMinElement(intArray));
        System.out.println("Max element in integer array = " + findMaxElement(intArray));
        System.out.print("Sort array by ascending: ");
        showArray(sortArrayByAscending(intArray));
        System.out.print("\nSort array by descending: ");
        showArray(sortArrayByDescending(intArray));
        System.out.println("\nSum of elements in integer array = " + calculateSumOfArray(intArray));
        System.out.print("Each element of array changed on his square: ");
        showArray(changeElementsOnTheirSquare(intArray));

        String[][] stringArray = new String[3][3];
        stringArray[0][0] = "dia";
        stringArray[0][1] = "qwe";
        stringArray[0][2] = "sda";
        stringArray[1][0] = "fhg";
        stringArray[1][1] = "go";
        stringArray[1][2] = "wer";
        stringArray[2][0] = "opi";
        stringArray[2][1] = "nbt";
        stringArray[2][2] = "nal";

        System.out.println("\n\nSource string matrix: ");
        showStringMatrix(stringArray);

        System.out.println("\nString on main diagonal is: "
                + showStringWhichContainsOfStringsOnMainDiagonal(stringArray));

        int[] sourceArray = {3, 2, 3, 1, 4, 2, 8, 3};

        System.out.print("\nSource array: ");
        showArray(sourceArray);

        replaceDuplicates(sourceArray);

        System.out.print("\nArray after replace duplicate with 0: ");
        showArray(sourceArray);

    }

    public static void replaceDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }

    public static void showStringMatrix(String[][] stringArray) {

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] changeElementsOnTheirSquare(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }

        return array;
    }


    public static int calculateSumOfArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] sortArrayByAscending(int[] array) {

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] sortArrayByDescending(int[] array) {

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int findMinElement(int[] array) {

        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }

        return minElement;
    }

    public static int findMaxElement(int[] array) {

        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > minElement) {
                minElement = array[i];
            }
        }

        return minElement;
    }

    public static void showArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void fillIntArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }

    public static String showStringWhichContainsOfStringsOnMainDiagonal(String[][] stringArray) {

        String str = "";

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                if (i == j) {
                    str = str + stringArray[i][j];
                }
            }
        }

        return str;
    }

}
