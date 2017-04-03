package ru.job4j.loop;
/**
*  Пакет рисования пирамиды.
* @author Daniil Permin
* @version 1.0
* @since 03.04.2017
*/

public class Paint {
/**
* метод вывода пирамиды.
* @param h высота пирамиды
* @return piramida
*/
	 public String piramid(int h) {
		StringBuilder piramida = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 1; j <= h * 2 - 1; j++) {
				if (j >= h - i && j <= h + i) {
				piramida.append("^");
				} else {
				piramida.append(" ");
				}
			}
			if (i < h - 1) {
			piramida.append(System.getProperty("line.separator"));
			}
		}
		return piramida.toString();
		}
	}
