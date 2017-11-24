/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Arif
 */
public class Game {

    private final FileHandler file = new FileHandler();
    public final String randomWord = file.getRandomWord();
    public String underline = "";
    private int count = 0;

    public int getCount() {
        return count;
    }

    public String getUnderline() {
        for (int i = 0; i < randomWord.length(); i++) {
            underline += "_";
        }
        return underline;
    }

    public int updateUnderline(char guess) {
        String wordFound = "";
        int state = 0;
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == guess) {
                wordFound += guess;
            } else if (underline.charAt(i) != '_') {
                wordFound += randomWord.charAt(i);
            } else {
                wordFound += "_";
            }
        }

        if (underline.equals(wordFound)) {
            count++;
            state = 1;
            if (count == 7) {
                state = 2;
            }
        } else {
            underline = wordFound;
        }
        if (underline.equals(randomWord)) {
            state = 3;
        }
        return state;
    }
}

