package ru.job4j.array;
/**
* Turn.
*@author Daniil Permin
*@version 1.0
*@since 07.04.2017
*/

public class BubbleSort {
/**
* Метод сортировки массива чисел по возрастанию.
*@param array передаваемый массив
*@return array возвращаемый массив
*/
	public int[] sort(int[] array) {
		for (int index = 1; index < array.length; index++) {
			if (array[array.length - index] < array[array.length - 1 - index]) {
				for (int change = 0; change <= array.length - index; change++) {
				if (array[change] > array[change + 1]) {
				int vremPer = array[change];
				array[change] = array[change + 1];
				array[change + 1] = vremPer;
				}
				}
			}
		}
		return array;
	}
}