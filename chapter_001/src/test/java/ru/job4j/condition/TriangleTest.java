package ru.job4j.condition;

import org.junit.Test;
//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TriangleTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 30.03.2017
 */
public class TriangleTest {
/**
*  Метод проверки вычисления площади треугольника.
*/
	@Test
    public void searchAreaTrangle() {
      	Point pointA = new Point();
		Point pointB = new Point();
		Point pointC = new Point();
		pointA.point(-2, -3);
		pointB.point(1, -1);
		pointC.point(6, 5);
		Triangle triangleABC = new Triangle();
		triangleABC.triangle(pointA, pointB, pointC);
		double result = triangleABC.area();
		double expected = 4;
		assertThat(result, closeTo(expected, 0.01));
	}
/**
*  Метод проверки вычисления площади треугольника, когда треугольника не существует.
*/
	@Test
    public void ssearchAreaTrangleError() {
      	Point pointA = new Point();
		Point pointB = new Point();
		Point pointC = new Point();
		pointA.point(2, 3);
		pointB.point(2, 3);
		pointC.point(6, 5);
		Triangle triangleABC = new Triangle();
		triangleABC.triangle(pointA, pointB, pointC);
		double result = triangleABC.area();
		double expected = 0;
		assertThat(result, closeTo(expected, 0.01));
	}
}
