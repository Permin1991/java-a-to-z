package ru.job4j.condition;
/**
 * Класс для программы положение точки.
 * @author Daniil Permin
 * @version 1
 * @since 26.03.2017
 */
public class Point {
/**
* Поля класса Point.
* x описание точки в системе координат
*/
	private	int x;
/**
* Поля класса Point.
* y описание точки в системе координат
*/
	private	int y;
/**
* Метод записи координат x и y в поле класса Point.
*@param x координата X
*@param y координата Y
*/
	public void point(int x, int y) {
      this.x = x;
      this.y = y;
  }
/**
*Метод возарвщает X.
*@return X
*/
	public int getX() {
    return this.x;
  }
/**
* Метод возарвщает Y.
*@return Y
*/
	public int getY() {
    return this.y;
  }
/**
*Метод проверки находитс ли точка на функции.
*@param a значение а для функции y(x)=a*x+b
*@param b значение b для функции y(x)=a*x+b
*@return true или false
*/
	public boolean is(int a, int b) {
	int yOtX = a * this.x + b;
	return this.y == yOtX ? true : false;
	}
}
