/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question {
    private String question;
    private String [] answers= new String [4];
    private int correctAnswer=0;
    
    
    public Question(String question, String[] answers, int correctAnswer){
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
       
    }
    
    public String getQuestion(){
        return question;
    }
    
    public String [] getAnswers(){
        return this.answers;
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    public int getCorrectAnswer(){
        return correctAnswer;
    }
    
    public void setCorrectAnswer(int finalAnswer){
        this.correctAnswer = finalAnswer;
    }
}
