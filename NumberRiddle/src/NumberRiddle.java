public class NumberRiddle {

    /*
IMPORTANT NOTE

I set the guesses to doubles to save space, however, if it was required to input integers
and doubles separately then I would have made 2 arrays instead one is guessesInt and guessesDouble
then I would have done the following process for both
*/

    private static double yourGuess;

    private static final double[] guesses = {20,-2,0,1,8.96,-6.78};

    private static double step1,step2,step3,step4;

    public static void main(String[] args){
        solveAllGuesses();
    }
    //algorithm that solves steps

    private static void solveAllGuesses() {
        for (double i : guesses){
            yourGuess = i;
            solveSteps();
            print();
        }

    }
    private static void solveSteps(){
        step1 = yourGuess*2;
        step2 = step1+6;
        step3 = step2/2;
        step4 = step3-yourGuess;

    }

    //all the print statements
    private static void print() {
        System.out.println("your number is "+yourGuess);
        System.out.println("step 1 "+step1);
        System.out.println("step 2 "+step2);
        System.out.println("step 3 "+step3);
        System.out.println("step 4 "+step4);
        System.out.println((.5*12));
    }

}
