class Box {
        int value;
    }
public class DataTypes {

    
    public static void main(String[] args) {
        Box first = new Box();
        first.value = 20;

        Box second  = first;

        second.value = 40;
        System.out.println(first.value +" , "+ second.value);
    }
}
