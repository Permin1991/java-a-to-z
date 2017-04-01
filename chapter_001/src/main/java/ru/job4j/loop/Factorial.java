package ru.job4j.loop;
/**
*  Пакет вычисления факториала.
* @author Daniil Permin
* @version 1.0
* @since 01.04.2017
*/

public class Factorial {
/**
* Метод вычисления факториала.
* @param n число факториала
* @return fact вычисленный факториал
*/
	public int calc(int n) {
		if (n == 0) {
			return 1;
		}
		int fact = 1;
		for (int index = 1; index <= n; index++) {
			fact *= index;
		}
	return fact;
	}
}