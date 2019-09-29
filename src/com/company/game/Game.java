package com.company.game;

import com.company.ChatBot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Game extends JFrame implements ActionListener{
public class Game extends ChatBot{
    /**
     *
     */

    final String TITLE_OF_PROGRAM = "Chatter: chatbot";

    final int START_LOCATION = 200;
    final int WINDOW_WIGHT = 350;
    final int WINDOW_HEIGHT = 450;


    //public Game(){
    public Game(JTextArea dialogue, JTextField message, JButton enter, JPanel buttonPanel){
        dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) + "Выбери игру:\n");
        dialogue.append("1) Больше или меньше\n");
        dialogue.append("2) Города\n");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        dialogue.append("ЗАШЕЛ\n");
        if (message.getText().trim().length() > 0) { //trim - убирает все пробелы
            dialogue.append((message.getText() + "\n"));//добавление строки в конпоненит диалога
        }
        message.setText("");//отвечает за очизение строки набора сообщения
        message.requestFocusInWindow();

    }
}
