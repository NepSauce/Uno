import java.util.ArrayList;

public class CardScrambling{
    private static ArrayList<Integer> startingCardArray = new ArrayList<>();

    public static void cardInitializer(){
        //Adding the Red Cards
        //1 0 Card
        //2 of each from 1 to 9
        startingCardArray.add(0);
        for (int i = 1; i < 10; i++){
            startingCardArray.add(i);
            startingCardArray.add(i);
        }
    }

    public static ArrayList<Integer> getStartingCardArray(){
        return startingCardArray;
    }
}