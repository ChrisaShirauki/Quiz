/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Player {
    
    private String name;
    private int score;
   
     public Player( String name)  {
         this.name = name;
         this.score = 0;
       
     }
     
     public String getName(){
         return this.name;  
     }
     
     public int getScore(){
         return this.score;
     }
     
     
     public int increaseAndGetScore(){
         this.score +=150;
        return this.score;
     }
     @Override 
     public String toString(){
         return "Player  Name {" 
                 +  name  + "Score" + score +
                 '}';
     }
}
