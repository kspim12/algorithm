package com.ryul.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {


    int[] arr1 = {1,2,3,4,5,6};
    int[] arr2 = {6,5,4,3,2,1};
    int[] arr3 = {1,6,5,4,3,2};
    int[] arr4 = {1,2,6,5,4,3};

    @Test
    public void swapTest() {
        int[] arr = {0,1,2,3,4};
        Assertions.assertEquals(1, arr[1]);
        Assertions.assertEquals(0, arr[0]);
        Sort.swap(arr, 0, 1);
        Assertions.assertEquals(1, arr[0]);
        Assertions.assertEquals(0, arr[1]);
    }

    @Test
    public void bubbleSortTest(){
        boolean sortType = Sort.ASC;
        Sort.bubbleSort(arr1, sortType);
        Sort.bubbleSort(arr2, sortType);
        Sort.bubbleSort(arr3, sortType);
        Sort.bubbleSort(arr4, sortType);

        if ( sortType ) {
            int[] expected_arr = {1,2,3,4,5,6};
            Assertions.assertArrayEquals(expected_arr, arr1);
            Assertions.assertArrayEquals(expected_arr, arr2);
            Assertions.assertArrayEquals(expected_arr, arr3);
            Assertions.assertArrayEquals(expected_arr, arr4);
        } else {
            int[] expected_arr = {6,5,4,3,2,1};
            Assertions.assertArrayEquals(expected_arr, arr1);
            Assertions.assertArrayEquals(expected_arr, arr2);
            Assertions.assertArrayEquals(expected_arr, arr3);
            Assertions.assertArrayEquals(expected_arr, arr4);
        }
    }

}