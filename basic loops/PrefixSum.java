public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,4,5,44,555,555555};
        int[] pre = new pre[arr.length];
        pre[0] = arr[0];

        for(int i=1;i< arr.length; i++){
            pre[i] = pre[i-1] + arr[i];
        }
    }
}
