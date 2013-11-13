package com.ianbrandt.kata.spellcheck;

import java.util.List;

public class SpellCheck {

	private List<String> wordList;

	public SpellCheck(final List<String> wordList) {

		this.wordList = wordList;
	}

	public boolean check(final String word) {

		return wordList.contains(word);
	}
}
