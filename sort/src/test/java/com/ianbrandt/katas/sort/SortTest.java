package com.ianbrandt.katas.sort;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

	private final Sorter sorter = new Sorter();

	private List<Integer> list;

	@Before
	public void setUp() {

		list = new ArrayList<Integer>();
	}

	@Test(expected = NullPointerException.class)
	public void testSortForNull() {

		sorter.sort(null);
	}

	@Test
	public void testSortForEmptyList() {

		sorter.sort(list);

		assertThat(list).isEmpty();
	}

	@Test
	public void testSortForSingleInteger() {

		list.add(0);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForTwoIntegersInOrder() {

		list.add(0);
		list.add(1);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForTwoIntegersOutOfOrder() {

		list.add(1);
		list.add(0);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForThreeIntegersInOrder() {

		list.add(0);
		list.add(1);
		list.add(2);

		testSortForSequentialIntegers(list);
	}


	@Test
	public void testSortForThreeIntegersFirstTwoOutOfOrder() {

		list.add(1);
		list.add(0);
		list.add(2);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForThreeIntegersLastTwoOutOfOrder() {

		list.add(0);
		list.add(2);
		list.add(1);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForThreeIntegersFirstAndLastOutOfOrder() {

		list.add(2);
		list.add(1);
		list.add(0);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForFourIntegersFirstAndLastOutOfOrder() {

		list.add(3);
		list.add(1);
		list.add(2);
		list.add(0);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForFourIntegersFirstAndThirdOutOfOrder() {

		list.add(2);
		list.add(1);
		list.add(0);
		list.add(3);

		testSortForSequentialIntegers(list);
	}

	@Test
	public void testSortForFourIntegersSecondAndForthOutOfOrder() {

		list.add(0);
		list.add(3);
		list.add(2);
		list.add(1);

		testSortForSequentialIntegers(list);
	}

	private void testSortForSequentialIntegers(List<Integer> list) {

		final int listSize = list.size();

		final Integer[] numbers = new Integer[listSize];

		for (int i = 0; i < listSize; i++) {
			numbers[i] = i;
		}

		sorter.sort(list);

		assertThat(list).containsExactly(numbers);
	}
}
