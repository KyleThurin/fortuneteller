import java.util.Random;
import java.util.Scanner;

/*
 * Create a program that gives custom responses to 'yes' or 'no' questions
 * To get a response from the user, use the getUserQuestion() method at the bottom of this file
 */
public class FortuneTeller {

    //Main method
    public static void main(String[] args) {

        //Displays text asking the user to enter a question for the fortune teller
        System.out.println("Ask the the all knowing fortune teller a yes or no question:");

        //Call the 'getUserQuestion()' method to get a question from the user
        String userQuestion = getUserQuestion(); //Index 'getUserQuestion'
        System.out.println("You asked: " + userQuestion); //Display the question entered by the user

        //Make a variable and initialize it to a random number from [0, 1, 2, 3]
        int randNumber = new Random().nextInt(4);

        //If 'randNumber' is 0
        if (randNumber == 0) {
            //Tell the user 'Yes
            System.out.println("The all knowing fortune teller says: YES!");

            //If 'randNumber' is 1
        } else if (randNumber == 1) {
            //Tell the user 'No'
            System.out.println("The all knowing fortune teller says: NO!");

            //If 'randNumber' is 2
        } else if (randNumber == 2) {
            //Tell the user 'Almost'
            System.out.println("The all knowing fortune teller says: Not quite, but almost!");

            //If 'randNumber' is 3
        } else if (randNumber == 3) {
            //Tell the user they are not long for this world
            System.out.println("The all knowing fortune teller says: ...you should probably say all your good-byes");
        }
    }



    /**
     * @return The user's response as a String
     */
    public static String getUserQuestion(){
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        return question;
    }
}




