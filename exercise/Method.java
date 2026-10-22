
class Student {
    String name;

    Student(String name){
        this.name = name;
    }
}
public class Method {
    static Student createStudent(){
        Student s = new Student("Ilma");
         return s;
    }

    static void displayStudent(Student student){
        System.out.println(student.name);
    }

    public static void main(String[] args) {
        Student recieved = createStudent();
        displayStudent(recieved);
    }
}
