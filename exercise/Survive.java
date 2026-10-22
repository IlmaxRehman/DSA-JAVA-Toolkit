class Student{
    String name = "Ilma";
}

public class Survive {
    static Student createS(){
        Student s = new Student();
        return s;
    }

    public static void main(String[] args) {
        Student student = createS();

        System.err.println(student.name);
    }
}
