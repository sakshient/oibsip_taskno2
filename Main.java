import java.util.*;
class Game1
{
    public static void guessingNumberGame()
    {
        int chance=5;
        int i,guess,session=1;
        System.out.println("welcome Gamer");
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        do
        {
            System.out.println("enter wheter you want to play game or not in Y/N");
            char round=sc.next().charAt(0);
            //System.out.println("welcome to new round!!!");
            if(round=='y' || round=='Y')
            {
                //System.out.println("welcome to new round");
                for(i=0;i<chance;i++)
                {
                    System.out.println("guess the number");
                    guess=sc.nextInt();
                    if(number==guess)
                    {
                        System.out.println("Congratulation you won the game");
                    }
                    else if(number>guess && i!=chance-1)
                    {	System.out.println("please enter larger value");
                    }
                    else if(number<guess && i!=chance-1)
                    {
                        System.out.println("please enter the smaller value");
                    }
                }
                if(i==chance)
                {
                    System.out.println("trials are exhuasted");
                    System.out.println("the value of the random number is : " + number);
                }
            }
            else
            {
                System.out.println("stop");
            }
            session++;
        }
        while(session<3);
    }

    public static void main(String args[])
    {

        guessingNumberGame();
    }
}




