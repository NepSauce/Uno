/* @author(s): Zawad Atif, Nafisah Nubah
 * Date Started: 2024-10-18
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GameStarter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CardScrambling.cardInitializer();
        ArrayList<Integer> testList = CardScrambling.getStartingCardArray();
        
        for (int i = 0; i < testList.size(); i++){
            System.out.print(testList.get(i) + " ");
        }
    }
}