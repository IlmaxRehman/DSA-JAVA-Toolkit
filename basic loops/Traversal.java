public class Traversal{
    public static void main(String[] args){
        int[] arr = {1,3,4,6,8,5,44,6,6,5,8};
            for(int i =0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        
        //enhanced loop - use when you dont need the index of the elements
        for(int num : arr){
            System.out.println(num);
        }

        //traverse bakckward

        for(int i=arr.length -1 ;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}