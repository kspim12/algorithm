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



}
