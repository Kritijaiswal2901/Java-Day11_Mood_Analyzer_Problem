package com.moodanalyzer;

public class Main {
    public static void main(String[] args) {
        String message = "I am feeling sad!";
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        String result = moodAnalyser.moodAnalysis();
        System.out.println(result);

        String message1= "I am feeling happy!";
        MoodAnalyser moodAnalyser1 = new MoodAnalyser(message1);
        String result1 = moodAnalyser1.moodAnalysis();
        System.out.println(result1);

        // Creating MoodAnalyser object using default constructor
        MoodAnalyser defaultMoodAnalyser = new MoodAnalyser();
        String defaultResult = defaultMoodAnalyser.moodAnalysis();
        System.out.println("Default Constructor Result: " + defaultResult);

        // Creating MoodAnalyser object using parameterized constructor
        String message2 = "I am feeling sad!";
        MoodAnalyser parameterizedMoodAnalyser = new MoodAnalyser(message2);
        String parameterizedResult = parameterizedMoodAnalyser.moodAnalysis();
        System.out.println("Parameterized Constructor Result: " + parameterizedResult);

    }
}