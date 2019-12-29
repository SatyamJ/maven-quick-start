package com.saneema.training;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.ArrayList;

class Application {
    public Application() {
        System.out.println("Inside application");
    }

    public int countWords(String sentence) {
        String[] words = StringUtils.split(sentence, ' ');
        return words == null ? 0 : words.length;
    }

    private void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("greetings");
        greetings.forEach(greeting -> System.out.println("Hello = " + greeting));
    }

    public static void main(String[] args) {
        System.out.println("Starting Application...");
        Application application = new Application();
        application.greet();
        int wordCount = application.countWords("I'm a four word.");
        System.out.println("wordCount = " + wordCount);
    }
}
