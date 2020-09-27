/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.models;

import java.util.ArrayList;

/**
 *
 * @author george.pasparakis-AKA-david.oster
 */
public class Word {
    private String word;
    
    public Word(){}
    public Word(String word){this.word = word;}

    public String getWord(){return(this.word);}
    public void   setWord(String word){this.word=word;}
    
    protected void dummyMethod(){}

    // method to check if a letter exists in the word
    public int letterExists(char c, int fromIndex) {
        int index = 0;
        index = word.indexOf(c, fromIndex);
        return(index);
    }
    
    // method to check how many occurences of the letter exist in the word
    /*
        loop through the letters of the word
        when letterExists finds one increase counter by 1
        then call letterExists +1 from previous index
        until all letters are parsed
    */
    public ArrayList<Integer> letterOccurences(char c) {
        boolean cont = true;
        int counter = 0;
        int index = 0;
        ArrayList<Integer> occurences = new ArrayList<>();
        
        do {
            index = letterExists(c,index);
            if(index == -1) {
                cont = false;
            } else {
                occurences.add(index);
                index++;
            }
                
        } while(cont);
        
        return(occurences);
    }
}
