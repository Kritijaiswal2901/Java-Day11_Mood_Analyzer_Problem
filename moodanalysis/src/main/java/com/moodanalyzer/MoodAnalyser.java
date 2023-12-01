package com.moodanalyzer;

public class MoodAnalyser {
    private String message;

    public enum MoodError {
        EMPTY, NULL, INVALID
    }


    public MoodAnalyser(String message){
        this.message = message;
    }

    //Parameterised and Default constructor

      public MoodAnalyser() {
        this.message = "";
    }
   
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String moodAnalysis() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException("Mood message is NULL", MoodError.NULL);
            } else if (message.trim().isEmpty()) {
                throw new MoodAnalysisException("Mood message is empty", MoodError.EMPTY);
            } else if (message.toLowerCase().contains("happy")) {
                return "HAPPY";
            } else if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                throw new MoodAnalysisException("Cannot analyze", MoodError.INVALID);
            }
        } catch (MoodAnalysisException e) {
            return e.getMessage();
        }
    }
}
   

