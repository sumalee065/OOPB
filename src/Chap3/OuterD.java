package Chap3;

class Printer {

    void print() {
        System.out.println("Printer : print()");
    }
}//end class

public class OuterD {

    static void printReport(Printer pnt) {
        pnt.print();
    }

    public static void main(String[] args) {
        printReport(new Printer() {
            void print() {
                System.out.println("my print");
            }
        });
        printReport(new Printer() {
            void print() {
                System.out.println("your print");
            }
        });
        printReport(new Printer() {
            void print() {
                System.out.println("your print");
            }
        });


    }
}//end class
