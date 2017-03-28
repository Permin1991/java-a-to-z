package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MaxTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 27.03.2017
 */
public class MaxTest {
/**
*  Metod poiska 2 chisel.
*/
	@Test
    public void searchMax() {
      	Max maximum = new Max();
		assertThat(maximum.max(1, 5), is(5));
	}
}