
    public class BlackJack
    {


        //turn the string value into  int value
        public static int getValueAsNumber(String value) {
            if (value.equals("Ace"))
            {
                if((Player.totalValuePlayer + 11) > 21 || (Croupier.totalValueCroupierFinal + 11) > 21)
                {
                    return 1;
                }
                else
                {
                    return 11;
                }
            } else if (value.equals("JACK") || value.equals("KING") || value.equals("QUEEN")) {
                return 10;
            } else {
                return Integer.parseInt(value);
            }
        }

        public static void PlayerWin()
        {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("You Win  :" + " <Total> "+"( "+Player.totalValuePlayer + " )");
            System.out.println("CROUPIER  :" + " <Total> "+"( "+Croupier.totalValueCroupierFinal + " )");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            //after win or lose
            Player.totalValuePlayer =0;
            Croupier.totalValueCroupierFinal = 0;

        }
        public  static void CroupierWin()
        {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("You Lose  :" + " <Total> "+"( "+Player.totalValuePlayer+" )");
            System.out.println("CROUPIER Win :" + " <Total> "+"( "+Croupier.totalValueCroupierFinal + " )");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            //after win or lose
            Player.totalValuePlayer =0;
            Croupier.totalValueCroupierFinal = 0;

        }
        public static void TheBlackJack()
        {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("-----------------BlackJack------------------------------------------------");
            System.out.println("You Win  :" + " <Total> "+"( "+Player.totalValuePlayer+" )");
            System.out.println("CROUPIER  :" + " <Total> "+"( "+Croupier.totalValueCroupierFinal + " )");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            //after win or lose
            Player.totalValuePlayer =0;
            Croupier.totalValueCroupierFinal = 0;

        }

        public static  void NowinNolose()
        {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("-----------------Draw Result------------------------------------------------");
            System.out.println("You   :" + " <Total> "+"( "+Player.totalValuePlayer+" )");
            System.out.println("CROUPIER  :" + " <Total> "+"( "+Croupier.totalValueCroupierFinal + " )");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            //after win or lose
            Player.totalValuePlayer =0;
            Croupier.totalValueCroupierFinal = 0;

        }


    }


