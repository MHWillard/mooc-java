/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author mwillard
 */
public class Main {
    public static void main(String[] args) {
        
SimpleDictionary book = new SimpleDictionary();
Word one = new Word("one","yksi");
Word two = new Word("two", "kaksi");

book.add(one);
book.add(two);

System.out.println(one);
        System.out.println(two);

book.translate("one");
book.translate("two");
book.translate("three");
        
}
}
