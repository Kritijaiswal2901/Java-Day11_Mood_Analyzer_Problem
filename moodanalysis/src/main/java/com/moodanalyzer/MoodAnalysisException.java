package com.moodanalyzer;


public class MoodAnalysisException extends Exception {
    private MoodAnalyser.MoodError errorType;

    public MoodAnalysisException(String message, MoodAnalyser.MoodError errorType) {
        super(message);
        this.errorType = errorType;
    }

    public MoodAnalyser.MoodError getErrorType() {
        return errorType;
    }
}

