import java.util.ArrayList;
import java.util.Collections;

public class CardScrambling{
    private static ArrayList<Integer> startingCardArray;
    private static int cardCount;

    public static void cardInitializer(){
        cardCount = 0;
        startingCardArray = new ArrayList<>();

        //Adding the Red Cards
        //1 0 Card
        //2 of each from 1 to 9
        startingCardArray.add(0);
        cardCount++;
        for (int i = 1; i < 10; i++){
            startingCardArray.add(i);
            startingCardArray.add(i);
            cardCount+=2;
        }

        //Adding the Blue Cards
        //1 10 Card
        //2 of each from 11 to 19
        startingCardArray.add(10);
        cardCount++;
        for (int i = 11; i < 20; i++){
            startingCardArray.add(i);
            startingCardArray.add(i);
            cardCount+=2;
        }

        //Adding the Green Cards
        //1 20 Card
        //2 of each from 21 to 29
        startingCardArray.add(20);
        cardCount++;
        for (int i = 21; i < 30; i++){
            startingCardArray.add(i);
            startingCardArray.add(i);
            cardCount+=2;
        }

        //Adding the Yellow Cards
        //1 40 Card
        //2 of each from 41 to 49
        cardCount++;
        startingCardArray.add(40);
        for (int i = 41; i < 50; i++){
            startingCardArray.add(i);
            startingCardArray.add(i);
            cardCount+=2;
        }
    }

    public static ArrayList<Integer> getStartingCardArray(){
        return startingCardArray;
    }

    public static ArrayList<Integer> fullScrambler(ArrayList<Integer> arrayList){
        ArrayList<Integer> scrambledList = new ArrayList<>();
        scrambledList = Collections.shuffle(arrayList);
        return scrambledList;
    }

}