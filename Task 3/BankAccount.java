public class BankAccount {
    public static void main(String[] args){
        String accHolderName = "Ronald Jangam";
        String accHolderDOB = "29-04-2006";
        int accNo = 83273;
        String bankName = "JP Morgan";
        double accBalance = 30000.00;
        double depAmt = 4000.00;
        double withAmt = 3000.00;
        double minThreshold = 1000.00;
        short numOfTransactions = 30;
        boolean accActive = true;
        if(depAmt > 0){
            accBalance = accBalance + depAmt;
        }
        if(withAmt > 0){
            accBalance -= accBalance - withAmt;
        }

        if(accBalance < minThreshold){
            System.out.println("Balance is below minimum threshold");
        }

        if(depAmt > 0 && accActive == true){
            System.out.println("Deposit amount is greater than 0, so the amount is valid and account is active.");
        }

        if(numOfTransactions > 0){
            numOfTransactions++;
        }

        System.out.println("Account Holder : " + accHolderName);
        System.out.println("Final Balance : " + accBalance);
        System.out.println("Number of Transactions : " + numOfTransactions);
    }
    
}
