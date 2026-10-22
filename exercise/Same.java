
class Cat {
    String name;
}
public class Same {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Shiro";

        Cat cat2 = cat1;
        cat2.name = "Ginger";

        System.out.println(cat1.name);
        System.out.println(cat2.name);
    }
}
