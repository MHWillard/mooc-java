/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package newpackage;
import java.util.ArrayList;
/**
 *
 * @author mwillard
 */
public class SimpleDictionary {
    private ArrayList<Word> words;
    
    public SimpleDictionary() {
        this.words = new ArrayList<>();
    }
    
    public void add(Word word) {
        this.words.add(word);
    }
    
    public void translate(String word) {
        /*
        returns Strings
        if words contains word: return translation
        otherwise, return null
        */
        
        System.out.println("present: " + this.words.contains(word));
    }
}
