package ru.job4j.condition;
/**
 * ����� ��� ��������� ���������� ������� ������������.
 * @author Daniil Permin
 * @version 1.0
 * @since 30.03.2017
 */
	public class Triangle {
/**
* ���� ������ Triangle.
* ����� "�" ������ Point � ��������� ��������� x � y
*/
		private Point a;
/**
* ���� ������ Triangle.
* ����� "b" ������ Point � ��������� ��������� x � y
*/
		private Point b;
/**
* ���� ������ Triangle.
* ����� "c" ������ Point � ��������� ��������� x � y
*/
		private Point c;
/**
* ����� ������  ����� � ���� ������ Triangle.
* @param a - ����� a
* @param b - ����� b
* @param c - ����� c
*/
	public void triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
* ����� ���������� ������� ������������ �� ��� ������.
* @return area - ������� ������������
*/
	public double area() { //S = |(x1-x3)*(y2-y3)-(y1-y3)*(x2-x3)/2|
		double areaABC = Math.abs(0.5 * ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (a.getY() - c.getY()) * (b.getX() - c.getX()))); 
		if (areaABC == 0) {
		return 0; // ������ ������������ �� ����������
		}
		return areaABC;
	}
	}