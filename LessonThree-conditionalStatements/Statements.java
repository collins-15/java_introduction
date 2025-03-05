public class Statements {

    public static void main(String[] args) 
    {
        int randomNumber = (int) (Math.random() * 50);// up to 49

         /* Relational Operators:

         * Java has 6 relational operators
         * > : Greater Than
         * < : Less Than
         * == : Equal To

         * != : Not Equal To

         * >= : Greater Than Or Equal To

         * <= : Less Than Or Equal To

         */

        if (randomNumber < 25) 
        {
            System.out.println("The random number is less than 25");
        }else if (randomNumber > 40) {
            System.out.println("The random Number is greater than 40");
        }else if (randomNumber == 30) {
            System.out.println("The random Number is equal than 30");
        }else if (randomNumber != 12) {
            System.out.println("The random Number is not equal to 12");
        }else if (randomNumber <= 20) {
            System.out.println("The random Number is less than or equal to 20");
        }else if (randomNumber >= 10) {
            System.out.println("The random Number is greater than or equal to 10");
        }
        else
        {
            System.out.println("The random number is " + randomNumber);
        }
        
        /* Logical Operators:

         * Java has 6 logical operators

         * ! : Converts the boolean value to its right to its opposite form ie. true to false

         * & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)

         * && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)

         * | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)

         * || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)

         * ^ : Returns true if there is 1 true and 1 false boolean value on the right or left

         */
        if (!(false)) {
            System.out.println("\n I turned false into true");
        }
        if ((true) & (true)) {
            System.out.println("\n I used & operator to check if both are true");
        }
        if ((true) || (false)){
            System.out.println("\n I used || operator to check if either is true");
        }
        if ((true) && (true)){
            System.out.println("\n I used && operator to check if both are true");
        }
           
        // There is also a | logical operator it checks the second boolean result even
        //  if the first comes back true 
        if ((true) ^ (false))
        {
            System.out.println("\n1 is true and the other false");
        }

        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println("\n The biggest value is " + biggestValue); //Prints out the biggest value using the ternary operator

        // Switch statements
        char theGrade = 'B';
        /* When you have a limited number of possible values a switch statement makes sense
         * The switch statement checks the value of theGrade to the values that follow case
         * If it matches it executes the code between {} and then break ends the switch statement
         * default code is executed if there are no matches
         * You are not required to use the break or default statements
         * The expression must be an int, short, byte, or char
         */

         switch (theGrade) {
            case 'A':
                System.out.println("Great Job");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Bad Job");
                break;
            case 'D':
                System.out.println("Poor Job");
                break;
            default:
                 System.out.println("Invalid Grade");
                break;
         }



    }
}