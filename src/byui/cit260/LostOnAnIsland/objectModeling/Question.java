/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.objectModeling;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bethanytaylor
 */
public class Question implements Serializable{
    
    private String triviaQuestion;
    private int correctAnswer;
    private String playerAnswer;
   
    public Question(){
}

    public String getTriviaQuestion() {
        return triviaQuestion;
    }

    public void setTriviaQuestion(String triviaQuestion) {
        this.triviaQuestion = triviaQuestion;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getPlayerAnswer() {
        return playerAnswer;
    }

    public void setPlayerAnswer(String playerAnswer) {
        this.playerAnswer = playerAnswer;
    }

    @Override
    public String toString() {
        return "Question{" + "triviaQuestion=" + triviaQuestion + ", correctAnswer=" + correctAnswer + ", playerAnswer=" + playerAnswer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.triviaQuestion);
        hash = 89 * hash + this.correctAnswer;
        hash = 89 * hash + Objects.hashCode(this.playerAnswer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (!Objects.equals(this.triviaQuestion, other.triviaQuestion)) {
            return false;
        }
        if (this.correctAnswer != other.correctAnswer) {
            return false;
        }
        return Objects.equals(this.playerAnswer, other.playerAnswer);
    }
    
    
    
}