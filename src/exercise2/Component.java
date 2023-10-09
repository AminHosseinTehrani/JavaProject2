package exercise2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Component {

    private JPanel panel;

    private JFrame frame;

    private JButton buttonRun;
    private int userInput;

    private Lotto lotto;
    public Component(){
        frame = new JFrame();
        panel = new JPanel();

        buttonRun = new JButton();

        frame.setSize(600,600);
        frame.setTitle("Gui");

        panel.add(buttonRun);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        buttonRun.setText("run lotto");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


lotto = new Lotto();
        buttonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userInput = Integer.parseInt(JOptionPane.showInputDialog("Pick  a number between 3 and 27"));;
                outComeMessage( lotto.checkIfWon(getUserInput()),lotto.getGameNumber());

            }

        });

    }


    private int getUserInput(){
        return userInput;
    }

    private void outComeMessage(boolean won,int gameNumber){
if(won) {
    JOptionPane.showMessageDialog(panel,"you won");
    frame.remove(panel);

} else{
    JOptionPane.showMessageDialog(panel,"wrong number");
}


if(gameNumber ==5){

    JOptionPane.showMessageDialog(panel,"you lose");
    frame.remove(panel);
}


    }



}
