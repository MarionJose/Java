public class Bank{
    final static String bankName = "SBI";
    private long balance = 0L;
    private int withdrawCount = 0;
 
    public static String printName(){
        return bankName ;
    }
 
    //NON PARAMETER
 
    public long checkBalance(){
        return balance;
    }
 
 
    public void deposit(long amount){
       long balanceAdded = amount + balance;
       balance = balanceAdded;
    }
 
    public void withdraw(int withdrawAmount,String accountType){
        if(accountType == "Savings")
        {
            if(withdrawAmount > balance){
                System.out.println("Negative balance not allowed!");
                return;
            }
            System.out.println("counter = "+withdrawCount);
            if(withdrawCount > 3){
                System.out.println("Number of withdraw is utilized ");
                return;
            }
            balance = balance - withdrawAmount;
            withdrawCount = withdrawCount+1;
        }
        else if(accountType == "Current"){
            balance = balance - withdrawAmount;
        }
        else{
            System.out.println("NOT SUPPORTED ACC TYPE "+accountType);
        }
 
    }
 
 
 
 }
 
 
 
 