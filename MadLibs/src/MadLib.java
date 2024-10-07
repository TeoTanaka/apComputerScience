import java.util.Objects;
import java.util.Scanner;

public class MadLib {//project 1.2.10
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String story = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
//        story = "Once upon a time in a <adjective> land, a <noun> <adverb> grew";
        while (story.contains("<") && story.contains(">")) {
            //finding the opening and closing brackets
            int bracket1 = story.indexOf("<");
            int bracket2 = story.indexOf(">");

            String userInput = getInput(story.substring(bracket1+1,bracket2));
            //putting the input into the story
            String storyPiece1 = story.substring(0,bracket1);
            String storyPiece2 = story.substring(bracket2+1);

            story = storyPiece1+userInput+storyPiece2;

        }
        System.out.println("Here's your completed story:");
        System.out.println(story);

    }
    public static String getInput(String inputType){
        System.out.println("Enter a "+inputType+": ");
        return sc.nextLine();
    }




}
