package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * CounterTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 01.04.2017
 */
public class CounterTest {
/**
*  Метод проверки вычисления суммы чисел в заданных пределах.
*/
	@Test
    public void sumEvenNumbers() {
      	Counter summaNumber = new Counter();
		assertThat(summaNumber.add(1, 10), is(30));
	}

}
