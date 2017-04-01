package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * FactorialTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 01.04.2017
 */
public class FactorialTest {
/**
*  Метод проверки вычисления факториала 5!.
*/
	@Test
    public void factorialNumber() {
      	Factorial fact = new Factorial();
		assertThat(fact.calc(5), is(120));
	}
/**
*  Метод проверки вычисления факториала 0!.
*/
	@Test
    public void factorialNumberZero() {
      	Factorial factZero = new Factorial();
		assertThat(factZero.calc(0), is(1));
	}
}
