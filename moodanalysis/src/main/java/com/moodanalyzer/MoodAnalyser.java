package com.moodanalyzer;

public class MoodAnalyser {
    private String message;

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

    public String moodAnalysis(){
        try{
            if (message == null){
                return "Happy";
            }
            if(message.toLowerCase().contains("happy")){
                return "HAPPY";
            }else if(message.toLowerCase().contains("sad")){
                return "SAD";
            }else{
                throw new CustomException("Cannot analyse ");
            }

        }catch(CustomException e){
            return e.getMessage();

        }
    }
   
}
