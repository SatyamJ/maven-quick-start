package com.saneema.training;

import java.util.List;
import java.util.ArrayList;

class Application {
    public Application() {
        System.out.println("Inside application");
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
    }
}
