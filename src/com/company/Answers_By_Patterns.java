package com.company;

import java.util.HashMap;
import java.util.Map;

public class Answers_By_Patterns {
    final Map<String, String> ANSWERS_BY_PATTERNS = new HashMap<String, String>() {{
        put("hello", "Здравствуйте, рад Вас видеть.");
        put("who", "Я обычный чат-бот.");
        put("name", "Зовите меня Чаттер :)");
        put("howareyou", "Спасибо, что интересуетесь. У меня всё хорошо.");
        put("whatdoyoudoing", "Я пробую общаться с людьми.");
        put("whatdoyoulike", "Мне нравиться думать что я не просто программа.");
        put("iamfeelling", "Как давно это началось? Расскажите чуть подробнее.");
        put("yes", "Согласие есть продукт при полном непротивлении сторон.");
        put("bye", "До свидания. Надеюсь, ещё увидимся.");

        put("joke", "Велик и могуч русский язык. На великом можно написать многотомный роман," +
                " а на могучем за минуту передать его содержание.");
    }};

    public Map<String, String> Answers_By_Patterns(){
        return ANSWERS_BY_PATTERNS;
    }
}
