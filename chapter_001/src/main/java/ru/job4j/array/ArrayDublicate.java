package ru.job4j.array;
import java.util.Arrays;
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
		int dublicate = 0;
		for (int number = 0; number < array.length - 1 - dublicate; number++) {
		for (int index = number + 1; index <= array.length - 1 - dublicate; index++) {
			while (array[number].equals(array[index])) {
				for (int bubbleSort = index; bubbleSort < array.length - 1; bubbleSort++) {
				String temp = array[bubbleSort  + 1];
				array[bubbleSort + 1] = array[bubbleSort];
				array[bubbleSort] = temp;
				}
			dublicate++;
			}
		}
		}
		return Arrays.copyOf(array, array.length - dublicate);
}
}