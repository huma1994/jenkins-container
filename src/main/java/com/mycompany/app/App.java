package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE1 = "hello my name is sanjeev.. this msg is been printed over a black ship ";
    
    
    private static final String MESSAGE2 = "hello my name .......apple ";




	private static final String MESSAGE= MESSAGE1 + MESSAGE2;

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
