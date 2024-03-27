class A1FreezingHot extends ConsoleProgram{
    /**
     * A program that will prompt for two temperatures and determine if they meet the requirements
     * @author: Erick M
     */

     public void run(){
        
        // Initializes variables
        double dblTempOne;
        double dblTempTwo;

        // Prompts for user input
        dblTempOne = readDouble("Please enter a temperature #1: ");
        dblTempTwo = readDouble("Please enter temperature #2: ");

        // Creates a conditional selective algorithm to determine if temperatures meet requirement
        if ((dblTempOne < 0 || dblTempTwo < 0) || (dblTempOne > 120 || dblTempTwo > 120)){

            // Outputs true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
     }
}
