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

    }
}