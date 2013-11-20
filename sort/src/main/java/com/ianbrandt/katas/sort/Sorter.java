package com.ianbrandt.katas.sort;

import java.util.List;

public class Sorter {

	public <T extends Comparable<? super T>> void sort(final List<T> list) {

		boolean swapped;

		do {

			swapped = false;

			for (int i = 0; i < list.size() - 1; i++) {

				T current = list.get(i);
				T next = list.get(i + 1);

				if (current.compareTo(next) > 0) {

					list.set(i, next);

					list.set(i + 1, current);

					swapped = true;
				}
			}

		} while (swapped);
	}
}
