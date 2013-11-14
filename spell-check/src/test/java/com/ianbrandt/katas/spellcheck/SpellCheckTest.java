package com.ianbrandt.katas.spellcheck;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpellCheckTest {

	private static final List<String> wordList = new ArrayList<String>();

	private SpellCheck spellCheck = new SpellCheck(wordList);

	public SpellCheckTest() {

		wordList.add("Test");
		wordList.add("Driven");
	}

	@Test
	public void testSpellCheckForNull() {

		assertThat(spellCheck.check(null)).isFalse();
	}

	@Test
	public void testSpellCheckForTheWordTest() {

		assertThat(spellCheck.check("Test")).isTrue();
	}

	@Test
	public void testSpellCheckForTheWordDriven() {

		assertThat(spellCheck.check("Driven")).isTrue();
	}

	@Test
	public void testSpellCheckForTheWordTst() {

		assertThat(spellCheck.check("Tst")).isFalse();
	}

	@Test
	public void testSpellCheckForTheWordTstt() {

		assertThat(spellCheck.check("Tstt")).isFalse();
	}
}
