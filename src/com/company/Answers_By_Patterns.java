package com.company;

import com.company.game.more_or_less.More_or_less;

import java.util.HashMap;
import java.util.Map;

public class Answers_By_Patterns {
    Joke joke = new Joke();
    More_or_less more_or_less = new More_or_less();
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

        put("joke", joke.Joke());

        //put("game", more_or_less.More_or_less());


    }};

    public Map<String, String> Answers_By_Patterns(){
        return ANSWERS_BY_PATTERNS;
    }
}
