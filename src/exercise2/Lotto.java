package exercise2;

import java.util.Random;

public class Lotto

{

   private  static int[] randomLottoNumbers = new int[3];

private int sumOfNumbers;
private static int gameNumber;


private boolean winner = false;
    public Lotto(){
        Random random = new Random();

        int minimumNumber = 1;
        int maximumNumber = 9;

        for(int i = 0; i<= randomLottoNumbers.length -1; i+=1){
            randomLottoNumbers[i] = random.nextInt(maximumNumber - minimumNumber) + minimumNumber;
        }

       // addSomeOfNumbers();

        setSumOfNumbers();


       // checkNumbers();

    }



    public int[] returnRandomNumberArray(){
        return randomLottoNumbers;

    }



    private int getSumONumbers(){

        return sumOfNumbers;
    }

    private void setSumOfNumbers(){
        for(int i = 0; i<= randomLottoNumbers.length -1; i+=1){

            sumOfNumbers += randomLottoNumbers[i];
        }
System.out.println("sum" + sumOfNumbers);
    }

    public boolean checkIfWon(int userInput){

if(userInput == getSumONumbers()){
    gameNumber +=1;
    return true;
}
gameNumber +=1;
        return false;

    }




    public int getGameNumber(){
        return gameNumber;
    }








    }




