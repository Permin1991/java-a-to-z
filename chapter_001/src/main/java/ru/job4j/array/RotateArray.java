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
		for (int iMassive = 0; iMassive < array.length / 2; iMassive++) {
			for (int index = iMassive; index < array.length - 1 - iMassive; index++) {
			int vremPer = array[iMassive][index];
			array[iMassive][index] = array[array.length - 1 - index][iMassive];
			array[array.length - 1 - index][iMassive] = array[array.length - 1 - iMassive][array.length - 1 - index];
			array[array.length - 1 - iMassive][array.length - 1 - index] = array[index][array.length - 1 - iMassive];
			array[index][array.length - 1 - iMassive] = vremPer;
			}
		}
		return array;
	}
}