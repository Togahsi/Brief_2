import java.util.Scanner;
import java.util.Random;

public class Player extends Card
{
    //=======================================================================
    Scanner cin = new Scanner(System.in);
    //=======================================================================

    static   String playerName;
    static int coins = 500;
    static public int myBet;
    static int placeBet;
    static  int totalValuePlayer;
    //=======================================================================
    static void showCoins()
    {
        System.out.println(coins);
    }
    //=======================================================================
    public int getCoins() {
        return coins;
    }
    //=======================================================================





}
