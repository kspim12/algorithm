package com.ryul.sort;

public class Sort {

    public static boolean ASC = true;
    public static boolean DESC = false;
    /**
     *
     * @param arr origin array
     * @param idx1 array index target num
     * @param idx2 array index target num2
     */
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    /**
     *
     * @param arr a non Sorted Array
     * @param ASC type of sort
     */
    public static void bubbleSort(int[] arr, boolean ASC) {
        for ( int i = 0; i < arr.length-1; i++ ) {
            for ( int j = 0; j < arr.length-1-i; j++ ) {
                if ( ASC ) {
                    if ( arr[j] > arr[j+1]) {
                        swap(arr, j, j+1);
                    }
                } else {
                    if ( arr[j] < arr[j+1]) {
                        swap(arr, j, j+1);
                    }
                }

            }
        }
    }


    public static void mySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
