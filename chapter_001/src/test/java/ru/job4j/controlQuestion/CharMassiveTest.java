package ru.job4j.controlQuestion;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Тест класса CharMassive.
* @author Daniil Permin
* @since 15.05.2017
* @version 1.0
*/
public class CharMassiveTest {
/**
* Метод проверки является ли строка sub подстрокой origin.
*/
@Test
	public void conditionTest() {
		CharMassive originSub = new CharMassive();
		String a = "Ты заходи, если что!";
		String b = "ход";
		boolean expect = true;
		boolean result = originSub.contains(a, b);
		assertThat(result, is(expect));
	}
}