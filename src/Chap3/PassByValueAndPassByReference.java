package Chap3;

class Account{
    private int accountId;
    private String accountName;

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
}//end class

public class PassByValueAndPassByReference {
   public static void changeDoubleValue(double newRate){
       newRate = 3.75;
   } 
   
   public static void changeObjectAttribute(Account actObj){
       actObj.setAccountName("Anny");    
   }
   
   public static void main(String[] argr){
       double interestRate = 4.99;
       System.out.println("---pass by Value---");
       System.out.println("Before calling method : interestRate = "+ interestRate);
       changeDoubleValue(interestRate); //passby value
       System.out.println("After calling method : interestRate = "+interestRate);
       
       System.out.println("---Pass by Reference---");
       Account actObj = new Account(105227,"No Name");
       System.out.println("actObj = "+actObj);
       System.out.println("Id = "+actObj.getAccountId());
       System.out.println("Name = "+actObj.getAccountName());
       
       changeObjectAttribute(actObj);
       System.out.println("After calling method :"); // pass by reference
       System.out.println("actObj = "+actObj);
       System.out.println("ID = "+actObj.getAccountId());
       System.out.println("Name = "+actObj.getAccountName());
   }
}
