import java.util.ArrayList;
public class Main
{

    //=======================================================================
    public static void hitPlayer()
    {

        Card.CardInfo ObPlayer = Card.randomOneCard();
        int Print_ValueCardPly = ObPlayer.getCardValue();//just for print
        String Print_TypeCardPly = ObPlayer.getCardType();//just for print
        Player.totalValuePlayer +=ObPlayer.getCardValue();//add the cardValue to playerTotal Points
        System.out.println("[ " + Print_TypeCardPly + " ]" + " value : " + "[ " +Print_ValueCardPly+ " ]");

    }
    //=======================================================================
    public static void hitCroupier()
    {
        Card.CardInfo ObCroupier = Card.randomOneCard();
        int Print_ValueCardCrou =ObCroupier.getCardValue();//just for print
        String Print_TypeCardCrou = ObCroupier.getCardType();//just for print
        Croupier.totalValueCroupierFinal += ObCroupier.getCardValue();
        System.out.println("[ " + Print_TypeCardCrou + " ]" + " value : " + "[ " +Print_ValueCardCrou+ " ]");
    }

    public static void hitHiddenCard()
    {
        Card.CardInfo ObCroupier = Card.randomOneCard();
        int Print_ValueCardCrou =ObCroupier.getCardValue();//just for print
        String Print_TypeCardCrou = ObCroupier.getCardType();//just for print
        Croupier.totalValueCroupierFinal += ObCroupier.getCardValue();

    }



}




