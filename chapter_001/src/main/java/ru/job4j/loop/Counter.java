package ru.job4j.loop;
/**
*  Пакет вычисление суммы чётных чисел в заданных пределах.
* @author Daniil Permin
* @version 1.0
* @since 01.04.2017
*/

public class Counter {
/**
* Метод вычисления суммы чётных чисел в заданных пределах.
* @param first начальная цифра предела
* @param second конечная цифра предела
* @return sum сумма чётных чисел
*/
	public int add(int first, int second) {
		int sum = 0;
		for (int index = first; index <= second; index++) {
			if (index % 2 == 0) {
			sum = sum + index;
			}
		}
	return sum;
	}
}