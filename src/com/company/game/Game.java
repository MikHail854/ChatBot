package com.company.game;

import com.company.ChatBot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    /**
     *
     */
    JButton button;
    private ChatBot chatBot;

    public Game() throws UnsupportedLookAndFeelException {
    super();
        chatBot = new ChatBot();
        chatBot.setVisible(true);
        button = new JButton("BUTTON");


    }
    /*public String Game_Selection(){

        return "Not All working";
    }*/
/*
    @Override
    public void actionPerformed(ActionEvent e) {
        setTitle(TITLE_OF_PROGRAM);//открывает заголовок программы
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершение программы по нажатию кнопки Х
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIGHT, WINDOW_HEIGHT);//координаты и размеры окна

        dialogue.append("It's working!!!!");
        /*if (message.getText().trim().length() > 0) { //trim - убирает все пробелы
            dialogue.append((message.getText() + "\n"));//добавление строки в конпоненит диалога
        }*/
    //}
}
