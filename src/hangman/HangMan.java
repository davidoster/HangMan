/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import hangman.models.Word;
import java.util.ArrayList;

/**
 *
 * @author george.pasparakis-AKA-david.oster
 */
public class HangMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game myGame = new Game(new Player(3), new Word("kolopetinitsa"));
        
        
        
        Word word = new Word("koukounari");
        ArrayList<Integer> occurences = word.letterOccurences('u');
        System.out.println("Letter u exists " + occurences.size() + " times!");
        System.out.println("Indexes are: " + occurences);
    }
    
}
