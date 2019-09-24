package com.company.game.more_or_less;

import javax.swing.*;

/**
 * Я загадываю число от 1 до 100. Тебе нужно отгадать это число за 5 попаток.
 * При неправильном ответе я тебе даю подсказку: загаданное число "больше" или "меньше"
 */

public class More_or_less extends JFrame /*implements ActionListener*/ {
    final int min = 1;// Минимальное число для диапазона
    final int max = 100;// Максимальное число для диапазона
    final int rnd = rnd(min, max);

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max)
     */

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }



   /* public String More_or_less() {

    }*/
}



