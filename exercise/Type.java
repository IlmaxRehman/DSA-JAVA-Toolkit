package exercise;
//Write a program that demonstrates static typing, object creation and method execution

public class Type {

    String name;
    int age;

    void display(){
        System.out.println(name + " is "+ age);
    }
    public static void main(String[] args) {
        Type s = new Type();
        s.name = "Ilma";
        s.age = 22;
        s.display();
        
    }
}
