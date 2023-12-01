package com.moodanalyzer;

public enum MoodAnalysisError {
    
    EMPTY("Mood should not be empty or null"),
    INVALID("Invalid mood provided");

    private final String message;

    MoodAnalysisError(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    
}