package Chap4;
import java.util.Scanner;

public class ScannerExample {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter name : ");
       String name = sc.next();
       System.out.println("name is"+ name);
         
       System.out.print("Please enten your age :");
       int age = sc.nextInt();
       if(age<1 || age >65){
           System.out.print("Error!! GPA must be 1-65");
       }else if(age<11){
           System.out.println("วัยเด็ก");
       }else if(age<20){
           System.out.println("วัยรุ่น");
       }else if(age<40){
           System.out.println("วัยผู้ใหญ่");
       }else if(age<60){
           System.out.println("วัยกลางคน");
       }else if(age<65){
           System.out.println("วัยสูงอายุ");
       }
       System.out.print("Please enten your salary :");
       double salary = sc.nextDouble();
       
       System.out.print("Employee name :"+name);
       System.out.println(",age : "+age+", salary :"+salary);
      
       System.out.print("Enter you salry : ");
       System.out.print("Enter your degree : ");
       int degree = sc.nextInt ();
       switch (degree){
           case 1:
                System.out.println("ปริญญาตรี");
                break;
            case 2:
                System.out.println("ปริญญาโท");
                break;
            case 3:
                System.out.println("ปริญญาเอก");
                break;
            default:
                System.out.println("ไม่ระบุ");
                break;
        }
        System.out.println("Employee name :"+name);
        System.out.println(",age : "+age+",salary : "+salary);
        
       }
               
   }  
       
     
