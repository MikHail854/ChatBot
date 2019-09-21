package com.company;

import java.util.*;
import java.util.regex.*;

public class SimpleBot {

    Pattern pattern;//for regexp
    Random random;//for random answers
    Date date;//for date and time

    public SimpleBot(){
        random = new Random();
        date = new Date();
    }

    public String sayInReturn(String msg, boolean ai){

        Common_Phrases common_phrases = new Common_Phrases();
        Elusive_Ansvers elusive_ansvers = new Elusive_Ansvers();

        String say = (msg.trim().endsWith("?"))? // метод endsWith - определяет, заканчивается ли на строка на ?
                elusive_ansvers.Elusive_Ansvers():
                common_phrases.Common_Phrases();
        if (ai) {
            String message =
                    String.join(" ", msg.toLowerCase().split("[ {,|.}?]+"));

            Patterns_For_Analysis patterns_for_analysis = new Patterns_For_Analysis();
            Answers_By_Patterns answers_by_patterns = new Answers_By_Patterns();

            for (Map.Entry<String, String> o : patterns_for_analysis.Patterns_For_Analysis().entrySet()) {
                pattern = Pattern.compile(o.getKey());
                if (pattern.matcher(message).find())
                    if (o.getValue().equals("whattime")) return date.toString();
                    else return answers_by_patterns.Answers_By_Patterns().get(o.getValue());
            }
        }
        return say;
    }
}
