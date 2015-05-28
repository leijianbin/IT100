/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import acm.util.*;

public class HangmanLexicon {

	private ArrayList<String> list;

	public HangmanLexicon() {
    	try {
    		BufferedReader rd = new BufferedReader(new FileReader("HangmanLexicon.txt"));
    		list = new ArrayList<String>();
    		while (true) {
    			String line = rd.readLine();
    			if (line != null) list.add(line);
    			else break;
    		}
    		rd.close();
    	} catch (IOException ex) {
    		throw new ErrorException(ex);
    	}
    }
	
/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return list.size();
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		if (index < list.size()) return list.get(index);
		else throw new ErrorException("getWord: Illegal index");
	}
	
	
}
