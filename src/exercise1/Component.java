package exercise1;

import javax.swing.*;

public class Component {

    private JPanel panel;


    private JFrame frame;
    private JLabel questionLabel;

    private JLabel choice1;
    private JLabel choice2;
    private JLabel choice3;
    private JLabel choice4;





    private String answer;


    public Component(){
        frame = new JFrame();
        panel = new JPanel();
        questionLabel = new JLabel();


        choice1 = new JLabel();
        choice2 = new JLabel();
        choice3 = new JLabel();
        choice4 = new JLabel();



        frame.setSize(600,600);
        frame.setTitle("Gui");
        panel.add(questionLabel);

        panel.add(choice1);
        panel.add(choice2);
        panel.add(choice3);
        panel.add(choice4);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }


    public void inputAnswer(){
        answer =  JOptionPane.showInputDialog("Please input your answer");
    }

    public String getAnswer(){

        return answer;
    }

    public void showMessage( String message){


        JOptionPane.showMessageDialog(panel,message);


    }


    public void setLabelText(String questionLabel,String[] answers){

        this.questionLabel.setText(questionLabel);

        choice1.setText("a. " + answers[0]);
        choice2.setText("b. " + answers[1]);
        choice3.setText("c. " + answers[2]);
        choice4.setText("d. " + answers[3]);



    }

    public void setLabelText(int numberOfCorrectAnswers,int numberOfIncorrectAnswers, double percentage){



        JOptionPane.showMessageDialog(null, "You got " + numberOfCorrectAnswers + " questions right and " +
                (numberOfIncorrectAnswers) + " questions wrong" + " that's " + percentage + "%");



        frame.remove(panel);
    }






}
