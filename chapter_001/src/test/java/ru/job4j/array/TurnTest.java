package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TurnTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 06.04.2017
 */
public class TurnTest {
/**
*  Метод проверки переворачивая массива из нечётного количества чисел.
*/
@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] massive = {1, 2, 3, 4, 5};
		int[] resultArray = turn.back(massive);
		int[] expectArray = {5, 4, 3, 2, 1};
		assertThat(resultArray, is(expectArray));
    }
/**
*  Метод проверки переворачивая массива из чётного количества чисел.
*/
@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurned() {
		Turn turn = new Turn();
		int[] massive = {2, 6, 1, 4};
		int[] resultArray = turn.back(massive);
		int[] expectArray = {4, 1, 6, 2};
		assertThat(resultArray, is(expectArray));
		}
}