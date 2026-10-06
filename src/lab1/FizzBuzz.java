package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }


        int i = 0;
        while (i <= 100) {
            i = doWhileFizzBuzz(i);
        }
    }

    // private method, can only be called from within this class FizzBuzz
    // static means it belongs to the class itself, call by calling the the Class name, no need to create an object
    // int means it returns int, the string print out isn't a return
    private static int doWhileFizzBuzz(int i) {
        // Finding out if it's divisible
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {
            System.out.println("Fizz");

        } else if (divisibleBy5) {
            System.out.println("Buzz");

        } else {
            System.out.println(i);
        }

        i++;
        return i;
    }
}


