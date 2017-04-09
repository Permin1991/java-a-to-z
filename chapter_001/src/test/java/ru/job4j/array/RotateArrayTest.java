package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * RotateArrayTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 09.04.2017
 */
public class RotateArrayTest {
/**
*  Метод поворота массива 3*3 на 90 градусов по часовой стрелке.
*/
@Test
	public void arrayRotateTest() {
		RotateArray rotateMassive = new RotateArray();
		int[][] massive = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] resultArray = rotateMassive.rotate(massive);
		int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(resultArray, is(expectArray));
    }
/**
*  Метод поворота массива 2*2 на 90 градусов по часовой стрелке.
*/
@Test
	public void arrayRotateTestTwo() {
		RotateArray rotateMassiveTwo = new RotateArray();
		int[][] massive = {{1, 2}, {3, 4}};
		int[][] resultArray = rotateMassiveTwo.rotate(massive);
		int[][] expectArray = {{3, 1}, {4, 2}};
		assertThat(resultArray, is(expectArray));
    }
}