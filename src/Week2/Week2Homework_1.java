package Week2;

import java.util.Random;

public class Week2Homework_1
{

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
        System.out.println("Random dice are rolled...");
        if(randomNumber == 1 || randomNumber == 2){
            System.out.println("You have lost a game with the number "+randomNumber+" on the dice.");
        }
        else{
        for (int totalMoney = 0; totalMoney <= 49;)
            {
            System.out.println("Random dice are rolled again...");

            if (randomNumber == 1 || randomNumber == 2 )
            {
                System.out.println("Dice number "+randomNumber+ " Total Money " +totalMoney+"$");
                break;
            }
            if (randomNumber == 3 )
            {
                totalMoney = totalMoney + 0;
            System.out.println("Dice number "+randomNumber+ " Total Money " +totalMoney+"$");
            }
            else if (randomNumber == 4 )
            {
                totalMoney = totalMoney + 4;
                System.out.println("Dice number "+randomNumber+ " Total Money " +totalMoney+"$");
            }
            else if (randomNumber == 5 )
            {
                totalMoney = totalMoney + 5;
                System.out.println("Dice number "+randomNumber+ " Total Money " +totalMoney+"$");
            }
            else if (randomNumber == 6 )
             {
                 totalMoney = totalMoney + 6;
                 System.out.println("Dice number "+randomNumber+ " Total Money " +totalMoney+"$");
             }
                randomNumber = random.nextInt(6)+1;
                if (totalMoney >= 50  && totalMoney <= 55 )
                {
                    System.out.println("You have earned the maximum amount of money you can earn. " +totalMoney+"$");
                }
        }
        }
    }
}


