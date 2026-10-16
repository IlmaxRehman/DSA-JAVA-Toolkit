import java.util.*;
public class Freq {
    public static void main(String[] args) {
        int[] arr = {2,4,7,44,5,4,4,5,5,0,3,3,3,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        System.out.print(map);

    }
}

//Operation	Java syntax
//Check existence	containsKey(key)
//Read with default	getOrDefault(key, 0)
//Insert/update	put(key, value)
