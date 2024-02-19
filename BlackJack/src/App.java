import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int Key;
        int myBet;

        do {
            System.out.println("1-Start Game");
            System.out.println("2-Display My Coins");
            System.out.println("0-Exit Game");

            if (cin.hasNextInt()) {
                Key = cin.nextInt();
                switch (Key) {
                    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    case 1:
                        System.out.println("How Much Do You Want To Bet For This Game : ");
                        if (cin.hasNextInt()) {
                            myBet = cin.nextInt();
                            if (myBet > Player.coins) {
                                System.out.println("You Do Not Have That much Coins");
                            } else if (Player.coins <= 0)
                            {
                                System.out.println("You Lose All your Coins");
                                Key = 0;
                            }
                            else {
                                System.out.println("************* The player Takes 2 cards : ****************");
                                Main.hitPlayer();
                                Main.hitPlayer();
                                System.out.println("Player hand : " + "< " + Player.totalValuePlayer + " >");

                                System.out.println("************* Croupier Takes 2 cards : ****************");
                                System.out.println(" Hidden Card ");
                                Main.hitHiddenCard();
                                Main.hitCroupier();
                                System.out.println("********************************************************");

                                if (Player.totalValuePlayer == 21) {
                                    BlackJack.TheBlackJack();
                                    Player.coins += myBet;
                                    Key = 2;
                                }

                                boolean isPlaying = true;
                                int PlayKey;
                                do {
                                    System.out.println("1-Hit");
                                    System.out.println("2-Stand");
                                    PlayKey = cin.nextInt();
                                    switch (PlayKey) {
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        case 1:
                                            Main.hitPlayer();
                                            if (Player.totalValuePlayer == 21 && Croupier.totalValueCroupierFinal < 21) {
                                                BlackJack.PlayerWin();
                                                Player.coins += myBet;
                                                isPlaying = false;
                                            } else if (Player.totalValuePlayer == 21 && Croupier.totalValueCroupierFinal > 21)
                                            {
                                                BlackJack.PlayerWin();
                                                Player.coins += myBet;
                                                isPlaying = false;
                                            } else if (Player.totalValuePlayer > 21 && Croupier.totalValueCroupierFinal <= 21)
                                            {
                                                BlackJack.CroupierWind();
                                                Player.coins -= myBet;
                                                isPlaying = false;
                                            } else if (Player.totalValuePlayer < 21 && Croupier.totalValueCroupierFinal == 21)
                                            {
                                                BlackJack.CroupierWind();
                                                Player.coins -= myBet;
                                                isPlaying = false;
                                            } else if (Player.totalValuePlayer == 21 && Croupier.totalValueCroupierFinal == 21)
                                            {
                                                BlackJack.NowinNolose();
                                                isPlaying = false;
                                            }
                                            break;
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        case 2:
                                            while (Croupier.totalValueCroupierFinal <= 17)
                                            {
                                                System.out.println("*****************************************");
                                                Main.hitCroupier();
                                            }

                                            if (Croupier.totalValueCroupierFinal > 21) {
                                                BlackJack.PlayerWin(); // Player wins because Croupier busted
                                                Player.coins += myBet;
                                            } else if (Croupier.totalValueCroupierFinal >= Player.totalValuePlayer) {
                                                BlackJack.CroupierWind();
                                                Player.coins -= myBet;
                                            } else {
                                                BlackJack.PlayerWin();
                                                Player.coins += myBet;
                                            }

                                            isPlaying = false;
                                            break;
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


                                        default:
                                            System.out.println("Error Your Choice is Out of Range ");
                                            isPlaying = false;
                                            break;
                                    }
                                } while (isPlaying);
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a valid integer for your bet.");
                            cin.next(); // consume invalid input
                        }
                        break;

                    case 2:
                        System.out.println(" My Coins is : " + Player.coins);
                        break;

                    default:
                        System.out.println("===================Exit the Game====================");
                        break;
                }
            } else
            {
                System.out.println("Invalid input. Please enter a valid integer for your choice.");
                cin.next(); // consume invalid input
                Key = -1; // set Key to a non-zero value to continue the loop
            }
        } while (Key != 0);
    }
}