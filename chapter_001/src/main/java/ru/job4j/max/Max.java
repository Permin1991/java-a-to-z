package ru.job4j.max;

/**
* Класс нахождение максимального числа.
*@author daniil permin
*@version 1.0
*@since 27.03.16
*/

	public class Max {
 /**
 * Класс вычисление максимум из 3-чисел.
 * @param first первое число
 * @param second второе число
 * @param third третье число
 * @return максимум из 3-х чисел
 */
	public int maximumThreeNumber(int first, int second, int third) {
		return max(max(first, second), third);
		}
/**
 * Класс вычисление максимум из 2-чисел.
 * @param first первое число
 * @param second второе число
 * @return максимальное число
 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
 }