import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TicTacToe implements ActionListener{

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;


    TicTacToe(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(40, 40, 40));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(24, 24, 24));
        textfield.setForeground(new Color (24, 244, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 74));
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds( 0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(140, 140, 140));

        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();

    }  
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<9;i++){
            if(e.getSource()==buttons[i]) {
                if(player1_turn==true) {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(244, 0, 0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O Turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(0, 0, 244));
                        buttons[i].setText("O");
                        player1_turn=true;
                        textfield.setText("X Turn");
                        check();
                }
            }
        }
    }

    }
    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(random.nextInt(2)==0) {
            player1_turn = true;
            textfield.setText("X Turn");
        }
        else{
            player1_turn=false;
            textfield.setText("O Turn");
        }
    }

    public void check(){

    }
    public void xWins(int a, int b, int c) {

    }
    public void oWins(int a, int b, int c) {

    }
}