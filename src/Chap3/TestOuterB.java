package Chap3;
//(2)
class OuterB{
    int outerAttribute1 = 5;
    static int outerAttribute2 = 10;
    
    void outerMethod1(){
        System.out.println("OuterB : outerMethod1()");
    }
    
    static void outerMethod2(){
        System.out.println("OuterB : outerMethod2()");
    }//(3)
    class MemberInner{
        int memberAttribute = 15;
        
        void memberInnerMethod(){
            System.out.println(memberAttribute);
            System.out.println(outerAttribute1 +","+ outerAttribute2);
            outerMethod1();
            outerMethod2();  
        }
    }
}
public class TestOuterB {
    public static void main(String[] args){
        OuterB outObj = new OuterB();
        OuterB.MemberInner innerObj = outObj.new MemberInner();  
        innerObj.memberInnerMethod();
    }
}
