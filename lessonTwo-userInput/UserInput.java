import java.util.Scanner;

public class UserInput
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();
            System.out.println("You entered: " + numberEntered);
            int numberEnteredTimes2 = numberEntered * numberEntered ;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numberEnteredTimes2 );
            int numberEnteredMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " - 2 = " + numberEnteredMinus2 );
            int numberEnteredPlus2 = numberEntered + 2;
            System.out.println(numberEntered + " + 2 = " + numberEnteredPlus2 );
            int numberEnteredDivide2 = numberEntered - 2;
            System.out.println(numberEntered + " / 2 = " + numberEnteredDivide2 );
            int numberEnteredModulo2 = numberEntered % 2;
            System.out.println(numberEntered + " % 2 = " + numberEnteredModulo2 );

            numberEntered +=2; //Increase by two =57
            System.out.println("increaseByTwo: " + numberEntered);
            numberEntered -=3;
            System.out.println("DecreaseByThree: " + numberEntered);
            // increment
            numberEntered++;
            System.out.println("Increment: " + numberEntered);
            // decrement
            numberEntered--;
            System.out.println("Decrement: " + numberEntered);

            int numberABS = Math.abs(numberEntered);
            System.out.println("Absolute Value: " + numberABS);
            int whichIsBigger = Math.max(5,8);
            System.out.println("Which is bigger: " + whichIsBigger);
            int whichIsSmaller = Math.min(5,8);
            System.out.println("Which is smaller: " + whichIsSmaller);
            double numSqrt = Math.sqrt(numberEntered);
            System.out.println("Square Root: " + numSqrt);
            System.out.println("Square Root: " + Math.sqrt(4));
            int numCeiling = (int) Math.ceil(5.23);
            System.out.println("Ceiling: " + numCeiling);
            int numFloor = (int) Math.floor(5.23);
            System.out.println("Floor: " + numFloor);
            int numRound = (int) Math.round(5.23);
            System.out.println("Round: " + numRound);
            int randomNumber = (int) (Math.random()* 10);
            System.out.println("Random Number: " + randomNumber);
        }else
        {
            System.out.println("Invalid input");
        }
    }
    

}
