class A3Within10 extends ConsoleProgram {

    /**
     * A program what will determine which of the 2 inputted numbers is closet to 10
     * @author: Erick M
     */

    

    public void run() {

        // Initializes variables
        int intFirstNumber = readInt(" ");
        int intSecondNumber = readInt(" ");
        int intDistanceOne = intFirstNumber - 10;
        int intDistanceTwo = intSecondNumber - 10;

        // Computes the distance form 10
        if (Math.abs(intDistanceOne) < Math.abs(intDistanceTwo)){
            System.out.println(intFirstNumber);
        } else if (Math.abs(intDistanceOne) > Math.abs(intDistanceTwo)){
            System.out.println(intSecondNumber);
        } else {
            System.out.println("0");
        }
    }
}

