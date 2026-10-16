import java.util.Arrays;
public class Sorting {
    public static void main(String[] args){
        int[] arr = {2,5,7,3,5,6,77,6667};
        Arrays.sort(arr); //assending - default

        for(int i= 0 ,j= arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;  // two pointer - one way to sort in descending order

        }

        Integer[] arr1 = {6,7,83,2,4};
        Arrays.sort(arr1,(a,b)-> Integer.compare(b,a));



    }
}
