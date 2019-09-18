package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBot extends JFrame implements ActionListener{

    final String TITLE_OF_PROGRAM = "Chatter: chatbot";
    final int START_LOCATION = 200;
    final int WINDOW_WIGHT = 350;
    final int WINDOW_HEIGHT = 450;

    //JTextPane dialogue; //area for dialog

    JTextArea dialogue; //area for dialog
    JCheckBox ai; //enable/disable AI
    JTextField message;//fiels for entering massages
    SimpleBot sBot;//chat-bot class
    //SimpleAttributeSet botStyle;//style bot text



    public static void main(String[] args) {
        new ChatBot();
    }

    ChatBot(){
        setTitle(TITLE_OF_PROGRAM);//открывает заголовок программы
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершение программы по нажатию кнопки Х
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIGHT, WINDOW_HEIGHT);//координаты и размеры окна

        //area for dialog
        dialogue = new JTextArea();
        dialogue.setLineWrap(true);//строки будут переноситься
        JScrollPane scrollBar = new JScrollPane(dialogue);//вертикальный скроллинг

        //panel for checkbox, message field and button
        JPanel buttonPanal = new JPanel();
        buttonPanal.setLayout(new BoxLayout(buttonPanal, BoxLayout.X_AXIS));//X_AXIS - размещение по горзонтали
        ai = new JCheckBox("AI");
        //ai.doClick();
        message = new JTextField();
        message.addActionListener( this);
        JButton enter = new JButton("Enter");
        enter.addActionListener(this);

        //adding all elements to the window
        buttonPanal.add(ai);
        buttonPanal.add(message);
        buttonPanal.add(enter);

        add(BorderLayout.CENTER, scrollBar);//добавление скролл-бара (в него завернут весь диалог)
        add(BorderLayout.SOUTH, buttonPanal);//добавление в итоговое окно элеметнов ai, message, button
        setVisible(true);//делает все видимым для пользователя

        sBot = new SimpleBot();//creating bot

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (message.getText().trim().length() > 0){ //trim - убирает все пробелы
            dialogue.append((message.getText() + "\n"));

            dialogue.append(TITLE_OF_PROGRAM.substring(0, 9) +
                    sBot.sayInReturn(message.getText(), ai.isSelected()) + "\n");
        }
        message.setText("");
        message.requestFocusInWindow();
    }
}