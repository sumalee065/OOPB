package Chap3;

public class Employee {
    static int id = 1001;
    String name ="Nalinee";
    int age = 35;
    
    static void work(){
        System.out.println("work()");
    }
    
    void getSalary(){
        System.out.println("getSlary()");
    }
        
    public static void main(String[] args){
        //call sattic attr & method
        System.out.println("Id : "+id);
        work();
        
        //call non-static
        Employee em = new Employee();
        System.out.println("name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary();
        
    }
}
    
    
    
