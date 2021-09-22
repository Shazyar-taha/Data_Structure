
import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // before sort the array
        System.out.println("Before Sort the Array ");
        System.out.println(Arrays.toString(intArray));

        // sorting the array
        insertionSort(intArray);

        // after sort the array
        System.out.println("After Sort The Array");
        System.out.println(Arrays.toString(intArray));


    }


    private static void insertionSort(int[] array){

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
            firstUnsortedIndex++){

            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i -1 ] > newElement; i--){
                array[i] = array[i-1];
            }

            array[i] = newElement;
        }

    }

}