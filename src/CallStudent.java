public class CallStudent {
   
    public static void main(String[] args) {
        Student mariam = new Student();
        mariam.enrollment();
        mariam.payment();
        mariam.addCoures();
        mariam.dropCoures();
        System.out.println("=============");
        
        GraduateStudent saina = new GraduateStudent();
        saina.enrollment();
        saina.addCoures();
        saina.dropCoures();
        saina.payment();
        saina.oralExaminatiion();
        saina.thesisExamaination();
    }
}//end class
