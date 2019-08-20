package Chap3;
//(2)
class OuterA{
    int outerAttibute1 = 5;
    static int outerAttribute2 = 10;
    
    void outerMethod1(){
        System.out.println("OuterA : outerMethod1()");
    }
    
    static void outerMethod2(){
        System.out.println("OuterA : outerMethod2()");
    }//(3)
    static class StaticInner{
        int statici1nnerAttribute1 = 15;
        static int statici1nnerAttribute2 = 20;
        
        void staticInnerMethod1(){
            System.out.println(statici1nnerAttribute1 +","+ statici1nnerAttribute2);
            System.out.println(outerAttribute2);
        }
       static void staticInnerMethod2(){
           outerMethod2();
       }
    }//end class StaticInner  
}//end class OuterA
//(1)
public class TestOuterA {
    public static void main(String[] args){
        OuterA.StaticInner innerObj = new OuterA.StaticInner();
        innerObj.staticInnerMethod1(); //call non-static method
        OuterA.StaticInner.staticInnerMethod2();  //call staticmethod
    }
}// end class TestOuterA
