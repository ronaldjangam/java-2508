public class crmTask1 {
    public static void main(String[] args){
        int customerId = 101;
        String firstName = "Ronald";
        String lastName = "Jangam";
        String email = "ronald.jangam@example.com";
        String contactNumber = "9876543210";

        int leadId = 201;
        String leadName = "Adam Parker";
        String leadEmail = "adam.parker@gmail.com";
        String leadPhone = "9123456789";
        String leadSource = "Website Form";

        int interactionId = 301;
        int relatedCustomerId = 101;
        String interactionType = "Email";
        String interactionDate = "2025-06-15";
        boolean isPositiveInteraction = true;

        int opportunityId = 401;
        int relatedLeadId = 201;
        String opportunityName = "Java Training Contract";
        double opportunityValue = 7500.00;
        boolean isClosed = false;
        boolean isHotOpportunity = true;

        int ticketId = 501;
        int relatedCustomerTicketId = 101;
        String issueTitle = "Unable to login";
        String issueDescription = "Customer cannot access the dashboard.";
        String ticketStatus = "Open";
    }
}