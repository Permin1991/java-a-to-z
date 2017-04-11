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
	public void arrayRotateTestThree() {
		RotateArray rotateMassiveThree = new RotateArray();
		int[][] massive = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] resultArray = rotateMassiveThree.rotate(massive);
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
/**
*  Метод поворота массива 4*4 на 90 градусов по часовой стрелке.
*/
@Test
	public void arrayRotateTestFour() {
		RotateArray rotateMassiveFour = new RotateArray();
		int[][] massive = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] resultArray = rotateMassiveFour.rotate(massive);
		int[][] expectArray = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
		assertThat(resultArray, is(expectArray));
    }
}