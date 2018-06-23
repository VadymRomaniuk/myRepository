package com;

public class WinterAndSummer {
    public static void main(String[] args) {

        int[] arr = {-5, -5, -5, -42, 6, 12};
        int winterDays = seasonDaysCounter(arr);
        System.out.println("Number of winter days = " + winterDays);

    }

    public static int seasonDaysCounter(int[] arr) {
        int maxElemPos = getMaxElemPos(arr);
        int count = 0;

        int firstSummerDay = maxElemPos - 1;
        for (int i = firstSummerDay; i > 0; i--) {

            for (int j = firstSummerDay; j > 0; j--) {
                if (arr[i] < arr[j]) {
                    count++;


                }
            }
            if (count != 0) {
                break;
            }
            firstSummerDay = i;

        }
        return firstSummerDay;
    }

    private static int getMaxElemPos(int[] arr) {
        int maxElemPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxElemPos]) {
                maxElemPos = i;
            }
        }
        return maxElemPos;
    }
}
