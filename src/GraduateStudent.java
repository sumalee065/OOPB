public class GraduateStudent extends Student  {
    
    protected String stdyLeve;
    protected String thesisAdviser ;

    public void oralExaminatiion(){
        System.out.println("oralExaminatiion");
    }
    public void thesisExamaination(){
        System.out.println("thesisExamainatio");
    }

    @Override
    public void payment() {
        System.out.println("payment by credit");
    }
    
    
}//end class
