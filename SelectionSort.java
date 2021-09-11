package com.geekplanet.shazyar;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //before sort the array
        System.out.println("Before Sort The Array : "+ Arrays.toString(array));

        //sorting the array
        selectionSort(array);

        //after sort the array
        System.out.println("After Sort The Array : "+Arrays.toString(array));
    }

    private static void selectionSort(int[] array){
        for(int lastUnsortIndex = array.length -1; lastUnsortIndex > 0; lastUnsortIndex--){

            int largest = 0;

            for(int i = 1; i <= lastUnsortIndex; i++){
                if (array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortIndex);
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
