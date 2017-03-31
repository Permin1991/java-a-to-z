package ru.job4j.condition;
/**
 * Класс для программы вычисления площади треугольника.
 * @author Daniil Permin
 * @version 1.0
 * @since 30.03.2017
 */
	public class Triangle {
/**
* Поля класса Triangle.
* точка "а" класса Point с описанием координат x и y
*/
		private Point a;
/**
* Поля класса Triangle.
* точка "b" класса Point с описанием координат x и y
*/
		private Point b;
/**
* Поля класса Triangle.
* точка "c" класса Point с описанием координат x и y
*/
		private Point c;
/**
* Метод записи  точек в поле класса Triangle.
* @param a - точка a
* @param b - точка b
* @param c - точка c
*/
	public void triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
* Метод вычисления площади треугольника по трём точкам.
* @return area - площадь треугольника
*/
	public double area() { //S = |(x1-x3)*(y2-y3)-(y1-y3)*(x2-x3)/2|
		double areaABC = Math.abs(0.5 * ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (a.getY() - c.getY()) * (b.getX() - c.getX()))); 
		if (areaABC == 0) {
		return 0; // такого треугольника не существует
		}
		return areaABC;
	}
	}