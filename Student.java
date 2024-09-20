public class Student {
    private String name;
    private int ID;
    private int age;
    private double GPA;

    public Student(String studentName, int studentID, int studentAge, double studentGPA){
        name = studentName;
        ID = studentID;
        age = studentAge;
        GPA = studentGPA;
    }
    
    public void analysis(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID#: " + ID);
        System.out.println("Student Age: " + age);
        System.out.println("Student GPA: " + GPA);
    } 
}
