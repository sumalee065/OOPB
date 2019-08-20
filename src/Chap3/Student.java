package Chap3;

public class Student {
    private String studentld;
    private String studentName;
    private String faculty;
    private String major;

    public Student() {
        System.out.println("Hi deflt constructor");
    }

    public Student(String studentld) {
        this.studentld = studentld;
    }

    public Student(String studentld, String studentName) {
        this.studentld = studentld;
        this.studentName = studentName;
    }

    public Student(String studentld, String studentName, String faculty) {
        this.studentld = studentld;
        this.studentName = studentName;
        this.faculty = faculty;
    }

    public Student(String studentld, String studentName, String faculty, String major) {
        this.studentld = studentld;
        this.studentName = studentName;
        this.faculty = faculty;
        this.major = major;
    }

    public static void main(String[] args){
        Student s1  = new Student();
        System.out.println("s1 : "+s1);
        showAttbute(s1);
        
        Student s2 = new Student("1001");
        showAttbute(s2);
        
        Student s3 = new Student("1001","Mariam");
        showAttbute(s3);
        
        Student s4 = new Student("1001","Mariam","Science");
        showAttbute(s4);
        
        Student s5 = new Student("1001","Mariam","Science","IT");
        showAttbute(s5);
        
    }

    private static void showAttbute(Student s1) {
        System.out.println("Id : "+s1.studentld);
        System.out.println("Name : "+s1.studentName);
        System.out.println("Faculty : "+s1.faculty);
        System.out.println("Major : "+s1.major);
        System.out.println("-----------------------");
    }
}//end class
