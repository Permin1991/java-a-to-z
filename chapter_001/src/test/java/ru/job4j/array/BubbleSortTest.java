package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * BubbleSortTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 07.04.2017
 */
public class BubbleSortTest {
/**
*  Метод сортировки чесел по возрастанию.
*/
@Test
	public void arraySortTest() {
		BubbleSort bubble = new BubbleSort();
		int[] massive = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] resultArray = bubble.sort(massive);
		int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(resultArray, is(expectArray));
    }
}