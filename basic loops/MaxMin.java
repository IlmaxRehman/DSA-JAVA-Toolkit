public class MaxMin {
    public static void main(String[] args){
        int[] arr = {3,6,2,56,1,0,667,566665};
        int min = arr[0];
        int max = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }

            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Minimum :"+ min + " maximum :"+max);
    }
}
