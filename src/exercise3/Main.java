package exercise3;

public class Main {

    public Main(){


    }

    private static int sumOfNumbers(int a, int b, int c, int d){


        int sum;


        sum = a + b + c + d;

        return sum;



    }
    private static int sumOfNumbers(int a, int b, int c){


        int sum;


        sum = a + b + c;

        return sum;



    }
    private static int sumOfNumbers(int a, int b){


        int sum;


        sum = a + b;

        return sum;



    }



    public static void main (String args[]){
        System.out.println(sumOfNumbers(1,1));
        System.out.println(sumOfNumbers(1,1,1));
        System.out.println(sumOfNumbers(1,1,1,1));
    }

}
