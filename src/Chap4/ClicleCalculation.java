package Chap4;

import java.util.Scanner;

public class ClicleCalculation {
    public static void main(String[] args){
        int menu = 0;
        Circle cc;
        do {
            System.out.println ("--- Menu ---");
            System.out.println ("0 : Exit");
            System.out.println ("1 : เส้นผ่านศูนย์กลาง");
            System.out.println ("2 : เส้นรอบวง");
            System.out.println ("3 : พื่นที่");
            System.out.println ("4 : ทั้งหมด");
            System.out.println ("-----------");
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter menu :");
            menu = sc.nextInt();
            System.out.println("menu = " + menu);
            switch(menu){
                case 1:
                    System.out.print("Enter radius");
                    double redius = sc.nextDouble();
                    cc = new Circle(redius);
                    System.out.println("Circumference :" +Math.floor(cc.computeCircumference()));
                    break;
                case 2:
                    System.out.print("Enter diametr");
                    double diametr = sc.nextDouble();
                    cc = new Circle(diametr);
                    System.out.println("Diamrter :" +Math.floor(cc.computeDiameter()));
                    break;
                case 3:
                    System.out.print("Enter area");
                    double area = sc.nextDouble();
                    cc = new Circle(area);
                    System.out.println("Area :" +Math.floor(cc.computeArea()));
                    break;
            }
            
        }while (menu < 0);
         
    }
}
