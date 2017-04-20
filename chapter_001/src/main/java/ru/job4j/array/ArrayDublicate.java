package ru.job4j.array;
/**
* RotateArray.
*@author Daniil Permin
*@version 1.0
*@since 12.04.2017
*/

public class ArrayDublicate {
/**
* Метод удаления повторный слов в массиве.
*@param array передаваемый массив
*@return array возвращаемый массив
*/
	public String[] remove(String[] array) {
		int dublicate;
		for (int index = 0; index < array.length - 1; index++) {
			if (array[index].equals(array[index + 1])) {
				String temp = array[index + 1];
				array[index + 1] = array[index];
				array[index] = temp;
				dublicate++;
			}
		}
		return Arrays.copyOf(array, array.length - dublicate);
	}
}