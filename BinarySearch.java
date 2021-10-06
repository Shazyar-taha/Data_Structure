import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {
        // initialize the array
        int[] array=new int[1000];
        // add number to the array
        addNumber(array, 1, 1000);
        // print the array
        System.out.println(Arrays.toString(array));
        // using binary search
        int index = binarySearch(array, 893);
        // print the value
        System.out.println("index = "+index);
        System.out.println("Number is  "+array[index]);
    }



    // add number to the array
    private static void addNumber(int[] array, int startNumber, int endNumber) {
        for (int i = startNumber; i < endNumber; i++){
            array[i] = i;
        }
    }


    // binary search algorithm
    private static int binarySearch(int[] array, int number){
        int start = 0;
        int end = array.length;


        while(start < end){

            int mid = (start + end) / 2;

            if(array[mid] == number){
                return mid;
            }else if(array[mid] < number){
                start = mid + 1;
            }else{
                end = mid;
            }

        }
        return -1;
    }

}
