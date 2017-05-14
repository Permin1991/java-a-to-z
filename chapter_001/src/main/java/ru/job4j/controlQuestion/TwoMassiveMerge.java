package ru.job4j.controlQuestion;

/**
* Пакет выполнения сортировки слиянием.
* @author Daniil Permin
* @since 10.05.17
* @version 1.0
*/
public class TwoMassiveMerge {

/**
* Метод сортировки слиянием двух массивов.
* @param massiveA массив А
* @param massiveB массив В
* @return resultMassive итоговый массив
*/
	public static int[] sortMerge(int[] massiveA, int[] massiveB) {
		int[] resultMassive = new int[massiveA.length + massiveB.length];
		int perMasResult = 0;
		int perMasA = 0;
		int perMasB = 0;
		boolean endMasA = massiveA.length == 0 ? true : false;
		boolean endMasB = massiveB.length == 0 ? true : false;
		while (perMasResult < resultMassive.length) {
			if (perMasA < massiveA.length) {
				if (endMasB || massiveA[perMasA] <= massiveB[perMasB]) {
				resultMassive[perMasResult] = massiveA[perMasA];
				perMasResult++;
				perMasA++;
				}
					if (perMasA == massiveA.length) {
					endMasA = true;
					}
			}
			if (perMasB < massiveB.length) {
				if (endMasA || massiveB[perMasB] <= massiveA[perMasA]) {
				resultMassive[perMasResult] = massiveB[perMasB];
				perMasResult++;
				perMasB++;
				}
					if (perMasB == massiveB.length) {
					endMasB = true;
					}
			}
		}
		return resultMassive;
};
};