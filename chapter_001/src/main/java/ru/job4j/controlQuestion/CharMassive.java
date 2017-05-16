package ru.job4j.controlQuestion;
/**
*  Пакет контрольных задач.
* @author Daniil Permin
* @since 15.05.2017
* @version 1.0
*/
public class CharMassive {
/**
* Метод проверки является ли строка sub подстрокой  origin.
* @param origin строка
* @param sub подстрока
* @return contains да или нет
*/
	public static boolean contains(String origin, String sub) {
		char[] originArray = origin.toCharArray();
		char[] subArray = sub.toCharArray();
		int indexSub = 0;
		for (int index = 0; index <= originArray.length - 1; index++) {
			if (originArray[index] == subArray[indexSub]) {
				for (int indexOrigin = index; indexOrigin <= originArray.length - 1; indexOrigin++) {
					if (originArray[indexOrigin] == subArray[indexSub]) {
						indexSub++;
					} else {
						indexSub = 0;
						break;
					}
					if (indexSub == subArray.length) {
						return true;
					}
				}
		}
		}
		return false;
}
}