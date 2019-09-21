package com.company;

import java.util.Random;

public class Elusive_Ansvers {
    final String[] ELUSIVE_ANSWERS = {
            "Вопрос непростой, прошу тайм-аут на раздумья.",
            "Не уверен, что располагаю такой информацией.",
            "Может лучше поговорим о чём-то другом?",
            "Простите, но это очень личный вопрос.",
            "Не уверен, что Вам понравится ответ.",
            "Поверьте, я сам хотел бы это знать.",
            "Вы действительно хотите это знать?",
            "Уверен, Вы уже догадались сами.",
            "Зачем Вам такая информация?",
            "Давайте сохраним интригу?"
    };
    public String Elusive_Ansvers(){
        Random random = new Random();
        return ELUSIVE_ANSWERS[random.nextInt(ELUSIVE_ANSWERS.length)];
    }
}
