package ru.job4j.loop;
/**
* ʏ���� ���������� ����� ������ ����� � �������� ��������.
* @author Daniil Permin
* @version 1.0
* @since 01.04.2017
*/

public class Counter {
/**
* ����� ���������� ����� ������ ����� � �������� ��������.
* @param first ��������� ����� �������
* @param second �������� ����� �������
* @return sum ����� ������ �����
*/
	public int add(int first, int second) {
		int sum = 0;
		for (int index = first; index <= second; index++) {
			if (index % 2 == 0) {
			sum = sum + index;
			}
		}
	return sum;
	}
}