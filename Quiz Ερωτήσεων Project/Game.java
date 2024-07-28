
import java.util.List;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Game {
      private static final int MAX_QUESTIONS_PER_ROUND = 10;
      private static final int NUM_OF_PLAYERS = 2;
      
      private Player playerOne;
      private Player playerTwo;
      private Player playingPlayer;
      
      private String selectedCategory;
      private List <Question> questions;
      private int indexOfQuestionInPlay;
      private int questionCounter;
      
      public Game(Player playerOne , Player playerTwo , String selectedCategory){
          this.playerOne = playerOne;
          this.playerTwo = playerTwo;
          this.selectedCategory = selectedCategory;
          this.playingPlayer = this.playerOne;
          this.questions = CategoriesService.getQuestionsForCategory(selectedCategory);
          this.indexOfQuestionInPlay=0;
          this.questionCounter=0;
      }
      
      public Player getPlayerOne(){
          return this.playerOne;
      }
      
      public Player getPlayerTwo(){
          return this.playerTwo;
      }
      
      public String getSelectedCategory(){
          return this.selectedCategory;
      }
      
      public int getMaxQuestionsPerRound(){
          return MAX_QUESTIONS_PER_ROUND;
      }
      
      public int getQuestionsCounter(){
          return questionCounter;
      }
      
      public List <Question> getQuestions(){
          return this.questions;
      }
      
      public int getIndexOfQuestionInPlay(){
          return this.indexOfQuestionInPlay;
      }
      
      public void setIndexOfQuestionInPlay(){
          if(questions.size() - 1 == indexOfQuestionInPlay){
              this.indexOfQuestionInPlay = 0;
          }
          else{
              this.indexOfQuestionInPlay +=1;
          }
          this.questionCounter++;
      }
      
      public Player getPlayingPlayer(){
          return this.playingPlayer;
      }
      
      public void setPlayingPlayer( Player playingPlayer){
          this.playingPlayer = playingPlayer;
      }
      
      public Question getQuestionInPlay(){
         return this.questions.get(indexOfQuestionInPlay);
      }
      
      public String getCorrectAnswer(){
       return getQuestionInPlay().getAnswers()[getQuestionInPlay().getCorrectAnswer()];
      }
      
      public boolean endOfGame(){
          return this.questionCounter >= MAX_QUESTIONS_PER_ROUND * NUM_OF_PLAYERS;
      }
    }
            
    

