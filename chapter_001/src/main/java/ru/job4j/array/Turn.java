package ru.job4j.array;
/**
* Turn.
*@author Daniil Permin
*@version 1.0
*@since 06.04.2017
*/

public class Turn {
/**
* Метод переворачивания массива чисел.
*@param array передаваемый массив
*@return array возвращаемый массив
*/
	public int[] back(int[] array) {
		for (int index = 0; index < array.length / 2; index++) {
		int vremPer = array[index];
		array[index] = array[array.length - 1 - index];
		array[array.length - 1 - index] = vremPer;
		}
		return array;
	}
}