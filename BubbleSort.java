package com.geekplanet.shazyar;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //before sort the array
        System.out.println("Before Sort The Array : "+ Arrays.toString(array));

        //sorting the array
        bubbleSort(array);

        //after sort the array
        System.out.println("After Sort The Array : "+Arrays.toString(array));
    }

    private static void bubbleSort(int[] array){
        for(int lastIndex = array.length -1; lastIndex > 0; lastIndex--){
            for (int i = 0; i < lastIndex; i++) {
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
