package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * PaintTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 03.04.2017
 */
public class PaintTest {
/**
* Класс тестирования пирамиды с h=2.
*/
	@Test
	public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
	}
/**
* Класс тестирования пирамиды с h=3.
*/
	@Test
	public void whenPiramidWithHeightTwoThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
	}
}
