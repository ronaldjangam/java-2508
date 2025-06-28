public class CRMSystem{
    public static void main(String[] args){
        int customerId = 101;
        String customerName = "Ronald Jangam";
        double totalPurchases = 2000.00;
        int interactionCount = 3;

        int leadId = 201;
        double leadBudget = 4000.00;
        boolean isContacted = false;

        double opportunityValue = 6000.00;
        boolean isClosed = false;

        double avgPurchaseVal = totalPurchases/interactionCount;

        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer name : " + customerName);
        
        if(opportunityValue>5000){
            System.out.println("Opportunity is high value.");
        }
    
        if(leadBudget > 3000 && isContacted == false){
            System.out.println("Lead should be prioritized");
        }

        if(interactionCount>1){
            interactionCount++;
        }



    }
}