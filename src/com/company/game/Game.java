package com.company.game;

import com.company.ChatBot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class Game extends JFrame implements ActionListener{
    /**
     *
     */

    final String TITLE_OF_PROGRAM = "Chatter: chatbot";

    final int START_LOCATION = 200;
    final int WINDOW_WIGHT = 350;
    final int WINDOW_HEIGHT = 450;


    Random random;//for random answers
    Date date;//for date and time

    JTextField SMS;//fiels for entering massages

    JTextArea output; //area for dialog

    /*public Game() {
        random = new Random();
        date = new Date();
    }*/

    public Game() /*String*/ /*Game_Selection(/*String msg, boolean ai/*, JTextArea dialogue/*, JTextField message*/{
    //public Game(JTextArea dialogue, JTextField message) /*String*/ /*Game_Selection(/*String msg, boolean ai/*, JTextArea dialogue/*, JTextField message*/{
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIGHT, WINDOW_HEIGHT);//координаты и размеры окна
        output = new JTextArea();
        output.setLineWrap(true);//строки будут переноситься
        JScrollPane scrollBar = new JScrollPane(output);//вертикальный скроллинг

        JPanel bPanel = new JPanel();
        bPanel.setLayout(new BoxLayout(bPanel, BoxLayout.X_AXIS));//X_AXIS - размещение по горзонтали

        SMS = new JTextField();
        SMS.addActionListener( this);

        JButton jButton = new JButton("КНОПКА");
        jButton.addActionListener(this);

        bPanel.add(SMS);
        bPanel.add(jButton);

        add(BorderLayout.CENTER, scrollBar);//добавление скролл-бара (в него завернут весь диалог)
        add(BorderLayout.SOUTH, bPanel);//добавление в итоговое окно элеметнов ai, message, button

        setVisible(true);//делает все видимым для пользователя


        /*dialogue.append(TITLE_OF_PROGRAM.substring(0, 9));
        if (message.getText() == "ура"){
            dialogue.append("EEEEERROR\n");
        }


        return "Рад был с тобой сыграть";*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.append("ЗАШЕЛ\n");
        if (SMS.getText().trim().length() > 0) { //trim - убирает все пробелы
            output.append((SMS.getText() + "\n"));//добавление строки в конпоненит диалога
        }
        SMS.setText("");//отвечает за очизение строки набора сообщения
        SMS.requestFocusInWindow();

    }
}
