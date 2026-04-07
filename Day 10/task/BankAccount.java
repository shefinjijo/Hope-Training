public class BankAccount {
        
    
    private double balance = 5000;  
    String accountType = "Savings"; 
    protected String bankName = "SBI"; 
    public String ownerName = "Steve";

  
  
    private void showBalance() {
        System.out.println("Balance: " + balance);
    }

  
    void showAccountType() {
        System.out.println("Account Type: " + accountType);
    }

  
    protected void showBankName() {
        System.out.println("Bank: " + bankName);
    }

   
    public void showOwner() {
        System.out.println("Owner: " + ownerName);
    }

   
    public void accessInsideBank() {
        showBalance(); 
    }
}

