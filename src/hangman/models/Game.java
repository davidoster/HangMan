/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.models;

/**
 *
 * @author george.pasparakis-AKA-david.oster
 */
public class Game {
    private Player player;
    private Word word;

    public Game() {
    }

    public Game(Player player, Word word) {
        this.player = player;
        this.word = word;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
    
    public void start() {
        // get word if word is not initialized
        // print word with first and last letter and number of letters
        // loop while tries of player
        // ask player for a letter
        // check for letterOccurences
        // if letter exists print else hang
        
    }
    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", word=" + word + '}';
    }
}
