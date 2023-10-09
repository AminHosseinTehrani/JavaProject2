package exercise1;


import java.util.Random;

public class Test {
    static int questionNumber = 0;
    Component component;
    private int numberOfCorrectAnswers = 0;


    String[] questions = {"Which one of these is the Java runnable method?",
            "Which is the correct casing way to write name employee name?",
            "How do you instantiate a Dog object in Java?",
            "How do you print text to the console?",
            "Which one of these is NOT a variable type in java?"};
    String[][] possibleAnswers = {{"public static void main (String[] args)","public void main()","private static void main (String[] args","public void args()"},
            {"EMPLOYEENAME","EmployeeName","Employeename","employeeName"},
            {"Dog dog = Dog()", "Dog dog = new Dog()","String Dog dog = new Dog()","Dog dog -> new Dog()"},
            {"System.in.println(\"hello\")", "System.out.println(\"hello\")", "System.in.println(\"hello\")", "Console.WriteLine(\"hello\"}"},
            {"Bool","int","boolean","String"}};

    //fix
    String[] correctAnswers = {"a","d","b","b","a"};
    boolean[] questionAsked = {false,false,false,false,false};

    public Test(){

        component = new Component();
    }


    private int getQuestionNumber(){

        return questionNumber;
    }
    private void incrementQuestionNumber(){

        questionNumber +=1;
    }



    public String getAnswerChoice(int questionNumber, int answerNumber){

        return possibleAnswers[questionNumber][answerNumber];

    }

    public void checkAnswer(){
// check if possibleAnswers
        if(correctAnswers[getQuestionNumber()].equals(component.getAnswer())){



            component.showMessage( generateMessage(true));
            numberOfCorrectAnswers +=1;
        }else{
            component.showMessage( generateMessage(false));
        }


        System.out.println(component.getAnswer());
        incrementQuestionNumber();
    }

    private String generateMessage(boolean correctAnswer){
        Random random = new Random();
        if(correctAnswer){
            switch (random.nextInt(4)) {
                case 0:
                    return "great job";

                case 1:
                    return "perfect";

                case 2:
                    return "great keep going";

                case 3:
                    return "good job you can do it";


            }
        }


        else {
            switch (random.nextInt(4)) {
                case 0:
                    return "nope";

                case 1:
                    return "keep trying!";

                case 2:
                    return "Wrong. I know you can do it!";

                case 3:
                    return "Wrong answer!";


            }
        }
        inputAnswer();
        return null;
    }


    public void inputAnswer(){

        for (int i = 0; i<= 5; i+=1) {
            simulateQuestion();

            if(questionNumber <=4) {
                component.inputAnswer();
                checkAnswer();
            }





        }
    }


    private void simulateQuestion(){

        for(int i = 0; i<= questionAsked.length -1; i+=1){
            if(questionAsked[i] == false){
                component.setLabelText(questions[i],possibleAnswers[i]);
                questionAsked[i] = true;
                break;
            }





        }
        System.out.println(questionNumber);
        if(questionNumber == 5){
            component.setLabelText(getNumberOfCorrectAnswers(),getNumberOfIncorrectAnswers(),calculateScorePercentage());
        }




    }


    private int getNumberOfCorrectAnswers(){
        return numberOfCorrectAnswers;
    }

    private int getNumberOfIncorrectAnswers(){
        return 5 - numberOfCorrectAnswers;
    }

    private double  calculateScorePercentage(){

        return ((double)getNumberOfCorrectAnswers()/5)*100;
    }

}
