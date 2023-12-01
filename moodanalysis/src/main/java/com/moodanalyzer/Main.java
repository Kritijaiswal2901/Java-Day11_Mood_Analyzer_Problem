package com.moodanalyzer;

public class Main {
    public static void main(String[] args) {
        // String message = "I am feeling sad!";
        // MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        // String result = moodAnalyser.moodAnalysis();
        // System.out.println(result);

        // String message1= "I am feeling happy!";
        // MoodAnalyser moodAnalyser1 = new MoodAnalyser(message1);
        // String result1 = moodAnalyser1.moodAnalysis();
        // System.out.println(result1);

        // // Creating MoodAnalyser object using default constructor
        // MoodAnalyser defaultMoodAnalyser = new MoodAnalyser();
        // String defaultResult = defaultMoodAnalyser.moodAnalysis();
        // System.out.println("Default Constructor Result: " + defaultResult);

        // // Creating MoodAnalyser object using parameterized constructor
        // String message2 = "I am feeling sad!";
        // MoodAnalyser parameterizedMoodAnalyser = new MoodAnalyser(message2);
        // String parameterizedResult = parameterizedMoodAnalyser.moodAnalysis();
        // System.out.println("Parameterized Constructor Result: " + parameterizedResult);

        // // Repeating TC 1.1
        // String message3 = "I am in Any Mood";
        // MoodAnalyser moodAnalyser2 = new MoodAnalyser(message3);
        // String result3 = moodAnalyser2.moodAnalysis();
        // System.out.println("Repeating TC 1.1 Result: " + result3);

        // // Repeating TC 1.2
        // String message4 = "I am in Happy Mood";
        // MoodAnalyser moodAnalyser3 = new MoodAnalyser(message4);
        // String result4 = moodAnalyser3.moodAnalysis();
        // System.out.println("Repeating TC 1.2 Result: " + result4);

        // String message5 = "I am in Sad Mood";
        // MoodAnalyser moodAnalyser4 = new MoodAnalyser(message5);
        // String result5 = moodAnalyser4.moodAnalysis();
        // System.out.println("Repeating TC 1.2 Result: " + result5);

        //  // UC 2 - Test Case
        //  String nullMessage = null;
        //  MoodAnalyser nullMoodAnalyser = new MoodAnalyser(nullMessage);
        //  String nullResult = nullMoodAnalyser.moodAnalysis();
        //  System.out.println("UC 2 Test Case Result: " + nullResult);

         

        // TC 3.1 - Given Empty Mood, Should Throw MoodAnalysisException indicating Empty Mood
        String emptyMessage = "";
        MoodAnalyser emptyMoodAnalyser = new MoodAnalyser(emptyMessage);
        try {
            emptyMoodAnalyser.moodAnalysis();
        } catch (MoodAnalysisException e) {
            System.out.println("TC 3.1 Result: " + e.getMessage() + " - Error Type: " + e.getErrorType());
        }

        // TC 3.2 - Given NULL Mood, Should Throw MoodAnalysisException
        String nullMessage = null;
        MoodAnalyser nullMoodAnalyser = new MoodAnalyser(nullMessage);
        try {
            nullMoodAnalyser.moodAnalysis();
        } catch (MoodAnalysisException e) {
            System.out.println("TC 3.2 Result: " + e.getMessage() + " - Error Type: " + e.getErrorType());
        }
    }
}

    
