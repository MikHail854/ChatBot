package com.company;

import com.company.game.Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBot extends JFrame implements ActionListener{

    final String TITLE_OF_PROGRAM = "Chatter: chatbot";
    final int START_LOCATION = 200;
    final int WINDOW_WIGHT = 350;
    final int WINDOW_HEIGHT = 450;

    JTextArea dialogue; //area for dialog
    JCheckBox ai; //enable/disable AI
    JTextField message;//fiels for entering massages
    SimpleBot sBot;//chat-bot class
    //SimpleAttributeSet botStyle;//style bot text

    Game game;

    public static void main(String[] args) {
        new ChatBot();
    }

    public ChatBot(){
        setTitle(TITLE_OF_PROGRAM);//открывает заголовок программы
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершение программы по нажатию кнопки Х
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIGHT, WINDOW_HEIGHT);//координаты и размеры окна

        //area for dialog
        dialogue = new JTextArea();
        dialogue.setLineWrap(true);//строки будут переноситься
        JScrollPane scrollBar = new JScrollPane(dialogue);//вертикальный скроллинг

        //panel for checkbox, message field and button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));//X_AXIS - размещение по горзонтали
        ai = new JCheckBox("AI");
        //ai.doClick();
        message = new JTextField();
        message.addActionListener( this);
        JButton enter = new JButton("Enter");
        enter.addActionListener(this);

        //adding all elements to the window
        buttonPanel.add(ai);
        buttonPanel.add(message);
        buttonPanel.add(enter);

        add(BorderLayout.CENTER, scrollBar);//добавление скролл-бара (в него завернут весь диалог)
        add(BorderLayout.SOUTH, buttonPanel);//добавление в итоговое окно элеметнов ai, message, button
        setVisible(true);//делает все видимым для пользователя

        sBot = new SimpleBot();//creating bot

        //game = new Game();

    }


    /**
     * срабатывает, когда нажимают на кнопку
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {


        if (message.getText().trim().length() > 0){ //trim - убирает все пробелы
            dialogue.append((message.getText() + "\n"));//добавление строки в конпоненит диалога
            switch (message.getText()) {
                // 1 - поиграем
                case "1":
                    dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) + "Выбери игру:\n");
                    dialogue.append("1) Больше или меньше\n");
                    dialogue.append("2) Города\n");
                    new Game();
                    //new Game(dialogue, message);
                        /*switch (message.getText()){
                            case "1":
                                dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) + "НАКОНЕЦ-ТО СЫГРАЕМ\n");
                                break;
                            default:
                                dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) + "НАКОНЕЦ-ТО СЫГРАЕМ2\n");
                                break;
                        }*/
                    //dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) +
                           // game.Game_Selection(message.getText(), ai.isSelected(), dialogue, message) + "\n");
                            //game. + "\n");
                   // game.Game_Selection();
                   //dialogue.setText("I love this world"+ "\n");
                    break;
                default:
                    dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) +
                            sBot.sayInReturn(message.getText(), ai.isSelected()) + "\n");
                    break;
            }

        }
        message.setText("");//отвечает за очизение строки набора сообщения
        message.requestFocusInWindow();
    }
}
