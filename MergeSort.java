import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // before sort the array
        System.out.println("Before Sort The Array : "+ Arrays.toString(array));

        // sorting the array
        mergeSort(array, 0, array.length);

        // after sort the array
        System.out.println("After Sort The Array : "+Arrays.toString(array));

    }



    private static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        // finding midpoint
        int mid = (start + end) / 2;
        // left side
        mergeSort(input, start, mid);
        // right side
        mergeSort(input, mid, end);
        // merge the array
        merge(input, start, mid, end);
    }


    private static void merge(int[] input, int start, int mid, int end){

        if(input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }

}
