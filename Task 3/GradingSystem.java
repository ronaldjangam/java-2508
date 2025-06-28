public class GradingSystem {
    public static void main(String[] args){
        String studentName = "Johnny";
        short studentID = 23;
        
        short numOfSubjects = 3;
        double subOneScore = 89;
        double subTwoScore = 75;
        double subThreeScore = 96;

        boolean pass;

        double totalScore = subOneScore + subTwoScore + subThreeScore;
        double avgScore = totalScore/numOfSubjects;

        if(avgScore >= 50){
            pass = true;
            System.out.println("You have passed! And your average is " + avgScore);
        }else{
            System.out.println("You have failed.");
        }

        System.out.println("Student Info : ");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID : " + studentID);

        System.out.println("Marks: ");
        System.out.println("Subject 1 : " + subOneScore);
        System.out.println("Subject 2 : " + subTwoScore);
        System.out.println("Subject 3 : " + subThreeScore);
    }
}
