package ru.job4j.array;
/**
* RotateArray.
*@author Daniil Permin
*@version 1.0
*@since 09.04.2017
*/

public class RotateArray {
/**
* Метод поворота массива чисел на 90 градусов по часовой стрелке.
*@param array передаваемый массив
*@return array возвращаемый массив
*/
	public int[][] rotate(int[][] array) {
		for (int index = 0; index < array.length - 1; index++) {
			int vremPer = array[0][index];
			array[0][index] = array[array.length - 1 - index][0];
			array[array.length - 1 - index][0] = array[array.length - 1][array.length - 1 - index];
			array[array.length - 1][array.length - 1 - index] = array[index][array.length - 1];
			array[index][array.length - 1] = vremPer;
		}
		return array;
	}
}