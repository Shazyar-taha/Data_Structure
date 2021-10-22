import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        //before sort the array
        System.out.println("Before Sort The Array : "+ Arrays.toString(array));

        //sorting the array
        shellSort(array);

        //after sort the array
        System.out.println("After Sort The Array : "+Arrays.toString(array));
    }


    private static void shellSort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                int newElement = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newElement) {

                    array[j] = array[j - gap];
                    j -= gap;

                }

                array[j] = newElement;
            }
        }

    }


}
