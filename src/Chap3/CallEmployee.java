package Chap3;

public class CallEmployee {
   public static void main (String[] args) {
    //call static attr & method
    System.out.println("Id : "+Employee.id);
    Employee.work();
    
    //call non-static
    Employee em = new Employee();
    System.out.println("name : "+em.name);
    System.out.println("Age : "+em.age);
    em.getSalary();
}  
}
